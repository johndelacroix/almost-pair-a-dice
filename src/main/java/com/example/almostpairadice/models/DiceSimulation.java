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
    private String diceCount;

    @Column(name = "DICE_SIDE")
    private String diceSide;

    @Column(name = "ROLL_SUM")
    private String rollSum;

    @Column(name = "FREQUENCY")
    private String frequency;

    public DiceSimulation() { }

    public DiceSimulation(Long id, String diceCount, String diceSide, String rollSum, String frequency) {
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

    public String getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(String diceCount) {
        this.diceCount = diceCount;
    }

    public String getRollSum() {
        return rollSum;
    }

    public void setRollSum(String rollSum) {
        this.rollSum = rollSum;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDiceSide() {
        return diceSide;
    }

    public void setDiceSide(String diceSide) {
        this.diceSide = diceSide;
    }
}
