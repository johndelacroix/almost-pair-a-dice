package com.example.almostpairadice.dto;

public enum ErrorMessage {
    INPUT_ERROR(0, "The number of dice and the total number of rolls must be at least 1."),
    INPUT_DICE_SIDE_ERROR(1, "The sides of a dice must be at least 4.");

    private final int code;
    private final String description;

    private ErrorMessage(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}
