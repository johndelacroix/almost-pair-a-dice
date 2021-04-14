package com.example.almostpairadice.repositories;

import com.example.almostpairadice.models.DiceSimulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiceSimulationRepository extends JpaRepository<DiceSimulation, Long> {
    List<DiceSimulation> findByDiceCountAndDiceSide(String diceCount, String diceSide);
}
