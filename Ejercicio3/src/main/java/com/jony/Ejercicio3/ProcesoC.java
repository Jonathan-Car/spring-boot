package com.jony.Ejercicio3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcesoC implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoC(@Qualifier("systemErrMessageService") MessageService messageService) {
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
