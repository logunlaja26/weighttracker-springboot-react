package com.lyomann.weighttrackerspringbootreact.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Weight {

    private final int weight;





    public Weight(int weight) {
        this.weight = weight;
        LocalDate.now();

    }


}
