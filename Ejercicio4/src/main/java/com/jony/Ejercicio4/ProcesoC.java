package com.jony.Ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcesoC implements CommandLineRunner {

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoC(@Qualifier("systemErrMessageService") MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) {
        String cita;
        cita = faker.gameOfThrones().quote();
        messageService.showMessage("ProcesoC - " + cita);
    }
}
