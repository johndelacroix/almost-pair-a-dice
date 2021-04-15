package com.example.almostpairadice.repositories;

import com.example.almostpairadice.models.DiceSimulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiceSimulationRepository extends JpaRepository<DiceSimulation, Long> {

    @Query(value = "select rownum() as id, a.* from (select dice_count, dice_side, roll_sum, SUM(frequency) as frequency from dice_simulation " +
            "where dice_count=:diceCount and dice_side=:diceSide group by dice_count, dice_side, roll_sum) a", nativeQuery = true)
    List<DiceSimulation> findByDiceCountAndDiceSide(Integer diceCount, Integer diceSide);

}
