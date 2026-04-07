package com.ejercicio1.ejercicio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcesoC implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        obtenerNombre();
    }
    void obtenerNombre(){
        String nombre = this.getClass().getSimpleName();
        System.out.println("se esta ejecutando El: " + nombre);
    }
}
