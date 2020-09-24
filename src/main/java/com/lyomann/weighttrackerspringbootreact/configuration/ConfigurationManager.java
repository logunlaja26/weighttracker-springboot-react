package com.lyomann.weighttrackerspringbootreact.configuration;

import com.lyomann.weighttrackerspringbootreact.model.Weight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class ConfigurationManager {

    private final static UUID weightID = UUID.randomUUID();
    @Bean
    public Weight weight() {

        return new Weight(weightID , 0, "01/11/2020");
    }

}
