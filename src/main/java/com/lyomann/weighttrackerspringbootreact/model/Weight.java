package com.lyomann.weighttrackerspringbootreact.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Weight {

    private final int weight;
    private String localDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    

    public Weight(int weight, String localDate) {
        this.weight = weight;
        this.localDate = localDate;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }
}
