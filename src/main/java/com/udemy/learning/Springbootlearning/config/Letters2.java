package com.udemy.learning.Springbootlearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class Letters2 {

    @Bean
    public String list(){
        return "Ali" ;
    }

    @Override
    public String toString() {
        return "Ali";
    }
}
