package com.ejercicio1.ejercicio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ProcesoA implements CommandLineRunner {
    @Override
    @Order(1)
    public void run(String... args) throws Exception {
        obtenerNombre();
    }
    void obtenerNombre(){
        String nombre = this.getClass().getSimpleName();
        System.out.println("se esta ejecutando El: " + nombre);
    }
}
