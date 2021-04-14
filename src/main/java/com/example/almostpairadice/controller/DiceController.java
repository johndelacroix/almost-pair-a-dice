package com.example.almostpairadice.controller;

import com.example.almostpairadice.dto.DiceRollResult;
import com.example.almostpairadice.dto.ErrorMessage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class DiceController {

    private static Logger LOGGER = LoggerFactory.getLogger(DiceController.class);

    @GetMapping(value="/diceroll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> rollIt(@RequestParam(value = "diceCount", defaultValue = "3") int diceCount,
                                                       @RequestParam(value = "diceSides", defaultValue = "6") int diceSides,
                                                       @RequestParam(value = "rollCount", defaultValue = "100") int rollCount) {

        //0-9
        /*Random rand = new Random();
        int x = rand.nextInt(10);*/

        //validation
        if (diceCount < 1 || rollCount < 1) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("error", ErrorMessage.INPUT_ERROR.getCode());
            jsonObject.put("message", ErrorMessage.INPUT_ERROR.getDescription());
            return ResponseEntity.ok().body(jsonObject.toString());
        } else if (diceSides < 4) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("error", ErrorMessage.INPUT_DICE_SIDE_ERROR.getCode());
            jsonObject.put("message", ErrorMessage.INPUT_DICE_SIDE_ERROR.getDescription());
            return ResponseEntity.ok().body(jsonObject.toString());
        }

        Map<Integer, Integer> diceTotalMap = new HashMap<>();

        for (int i=0; i<rollCount; i++) {

            int sum = 0;
            for (int j=0; j<diceCount; j++) {
                Random rand = new Random();
                int result = rand.nextInt(diceSides) + 1;
                sum += result;
            }
            Integer count = diceTotalMap.get(sum);

            if (count == null) {
                count = 0;
            }

            diceTotalMap.put(sum, count + 1);

            LOGGER.info("Roll attempt {}: SUM {}", i+1, sum);
        }

        List<DiceRollResult> diceRollResultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: diceTotalMap.entrySet()) {
            DiceRollResult diceRollResult = new DiceRollResult();
            diceRollResult.setSum(entry.getKey());
            diceRollResult.setFrequency(entry.getValue());
            LOGGER.info("{}: {}", entry.getKey(), entry.getValue());
            diceRollResultList.add(diceRollResult);
        }

        return ResponseEntity.ok().body(diceRollResultList);
    }
}
