package com.lyomann.weighttrackerspringbootreact.configuration;

import com.lyomann.weighttrackerspringbootreact.model.Weight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationManager {
    @Bean
    public Weight weight() {
        return new Weight(0, "01/11/2020");
    }

}
