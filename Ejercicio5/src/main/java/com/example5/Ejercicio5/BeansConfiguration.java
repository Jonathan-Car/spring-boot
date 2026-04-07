package com.example5.Ejercicio5;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class BeansConfiguration {
    @Bean
    public Faker faker() {
        return new Faker(new Locale("es"));
    }
}
