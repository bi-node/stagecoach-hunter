package com.binode.stagecoachhunter.otherconfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper geModelMapper(){
        return new ModelMapper();
    }
}
