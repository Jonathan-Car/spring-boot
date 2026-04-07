package com.jony.Ejercicio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ProcesoA implements CommandLineRunner {


    private final MessageService messageService;

    public ProcesoA(MessageService messageService) {
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
