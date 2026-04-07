package com.jony.Ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ProcesoA implements CommandLineRunner {

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoA(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        String cita = faker.backToTheFuture().quote();

        messageService.showMessage("ProcesoA - " + cita);
    }
}

