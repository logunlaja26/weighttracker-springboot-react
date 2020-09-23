package com.lyomann.weighttrackerspringbootreact.controller;

import com.lyomann.weighttrackerspringbootreact.model.Weight;
import com.lyomann.weighttrackerspringbootreact.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("weight")
public class WeightController {

    private final WeightService weightService;

    @Autowired
    public WeightController(WeightService weightService) {
        this.weightService = weightService;
    }

    @GetMapping
    public List<Weight> getAllWeights(){
        //return List.of( new Weight(173,"01/22/2020"),new Weight(178,"01/23/2030"));
        return weightService.getAllWeights();
    }
}
