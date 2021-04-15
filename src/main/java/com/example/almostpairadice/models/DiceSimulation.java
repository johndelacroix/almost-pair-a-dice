package com.example.almostpairadice.models;

import javax.persistence.*;

@Entity
@Table(name = "DICE_SIMULATION")
public class DiceSimulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DICE_COUNT")
    private Integer diceCount;

    @Column(name = "DICE_SIDE")
    private Integer diceSide;

    @Column(name = "ROLL_SUM")
    private Integer rollSum;

    @Column(name = "FREQUENCY")
    private Integer frequency;

    public DiceSimulation() { }

    public DiceSimulation(Long id, Integer diceCount, Integer diceSide, Integer rollSum, Integer frequency) {
        this.id = id;
        this.diceCount = diceCount;
        this.setDiceSide(diceSide);
        this.rollSum = rollSum;
        this.frequency = frequency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(Integer diceCount) {
        this.diceCount = diceCount;
    }

    public Integer getRollSum() {
        return rollSum;
    }

    public void setRollSum(Integer rollSum) {
        this.rollSum = rollSum;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getDiceSide() {
        return diceSide;
    }

    public void setDiceSide(Integer diceSide) {
        this.diceSide = diceSide;
    }
}
