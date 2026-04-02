package com.extensionista.school.controllers;

import com.extensionista.school.entities.Professor;
import com.extensionista.school.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @PostMapping
    public Professor criar(@RequestBody Professor p) { return service.salvar(p); }

    @GetMapping
    public List<Professor> listar() { return service.listar(); }
}
