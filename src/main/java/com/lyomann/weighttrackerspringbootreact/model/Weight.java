package com.lyomann.weighttrackerspringbootreact.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class Weight {

    private UUID weightId;
    private final int weight;
    private String localDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));



    public Weight(UUID weightId, int weight, String localDate) {
        this.weightId = weightId;
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

    public UUID getWeightId() {
        return weightId;
    }
}
