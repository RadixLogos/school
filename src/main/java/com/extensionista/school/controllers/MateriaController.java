package com.extensionista.school.controllers;

import com.extensionista.school.entities.Materia;
import com.extensionista.school.service.MateriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService service;

    public MateriaController(MateriaService service) {
        this.service = service;
    }

    @PostMapping
    public Materia criar(@RequestBody Materia m) { return service.salvar(m); }

    @GetMapping
    public List<Materia> listar() { return service.listar(); }
}
