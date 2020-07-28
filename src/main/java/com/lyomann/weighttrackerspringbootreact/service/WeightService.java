package com.lyomann.weighttrackerspringbootreact.service;

import com.lyomann.weighttrackerspringbootreact.model.Weight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class WeightService {

    private final Weight weight;

    @Autowired
    public WeightService(Weight weight) {
        this.weight = weight;
    }



    public List<Weight> getAllWeights(){
        List<Weight> weights = new ArrayList<>();
        weights.add(new Weight("07/10/20",170));
        weights.add(new Weight("07/12/20",172));

        return weights;
    }


}
