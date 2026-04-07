package com.jony.Ejercicio4;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcesoB implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    public ProcesoB(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) {
        String cita = faker.rickAndMorty().quote();
        messageService.showMessage("ProcesoB - " + cita);
    }

    void obtenerNombre() {
        messageService.showMessage("Ejecutando : " + getClass().getSimpleName());
    }
}
