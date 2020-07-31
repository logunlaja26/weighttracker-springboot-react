package com.lyomann.weighttrackerspringbootreact.model;


import org.springframework.stereotype.Component;


public class Weight {

    private final String date;
    private final int weight;

    public Weight(String date, int weight) {
        this.date = date;
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public int getWeight() {
        return weight;
    }
}
