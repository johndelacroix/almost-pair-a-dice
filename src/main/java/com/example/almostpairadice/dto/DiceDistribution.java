package com.example.almostpairadice.dto;

public class DiceDistribution {
    private Integer diceCount;
    private Integer diceSide;
    private Integer sum;
    private Integer frequency;
    private Float probability;
    private String probabilityText;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Float getProbability() {
        return probability;
    }

    public void setProbability(Float probability) {
        this.probability = probability;
    }

    public String getProbabilityText() {
        return probabilityText;
    }

    public void setProbabilityText(String probabilityText) {
        this.probabilityText = probabilityText;
    }

    public Integer getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(Integer diceCount) {
        this.diceCount = diceCount;
    }

    public Integer getDiceSide() {
        return diceSide;
    }

    public void setDiceSide(Integer diceSide) {
        this.diceSide = diceSide;
    }
}
