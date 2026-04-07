package com.example5.Ejercicio5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public String listarPersonas(Model model) {
        model.addAttribute("personas", personaService.find(10));
        return "persona-lista-personas";
    }

    @GetMapping("/personas/una")
    public String verPersona(Model model) {
        model.addAttribute("persona", personaService.findOne());
        return "persona-generada";
    }
}
