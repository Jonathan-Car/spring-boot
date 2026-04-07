package com.jony.Ejercicio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcesoB implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoB(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        obtenerNombre();
    }
    void obtenerNombre(){
        messageService.showMessage("Ejecutando : " + getClass().getSimpleName());
    }
}
