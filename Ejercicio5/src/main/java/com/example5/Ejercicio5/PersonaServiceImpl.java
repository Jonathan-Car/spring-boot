package com.example5.Ejercicio5;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final Faker faker;

    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        Persona p = new Persona();
        p.setNombre(faker.name().firstName());
        p.setApellidos(faker.name().lastName());
        String numeros = faker.number().digits(8);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = Integer.parseInt(numeros) % 23;
        char letraContrasena = letras.charAt(indice);
        String dni = numeros + letraContrasena;
        p.setDni(dni);
        p.setFechaNacimiento(faker.date().birthday(18, 80).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        return p;
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> lista = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lista.add(findOne());
        }
        return lista;
    }
}
