package com.example5.Ejercicio5;

import java.util.List;
public interface PersonaService {
    List<Persona> find(int count);
    Persona findOne();
}
