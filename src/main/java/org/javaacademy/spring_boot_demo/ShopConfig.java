package org.javaacademy.spring_boot_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfig {

    @Bean
    public String price() {
        return "100$";
    }
}
