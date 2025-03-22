package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seat {
    @JsonProperty("row")
    private String row;

    @JsonProperty("number")
    private int number;

    @JsonProperty("isReserved")
    private boolean isReserved;

    public Seat() {
    }

    public Seat(String row, int number, boolean isReserved) {
        this.row = row;
        this.number = number;
        this.isReserved = isReserved;
    }

    public boolean reserve() {
        return true;
    }

    public boolean cancel() {
        return true;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "row='" + row + '\'' +
                ", number=" + number +
                ", isReserved=" + isReserved +
                '}';
    }
}
