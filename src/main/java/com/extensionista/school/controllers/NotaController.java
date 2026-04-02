package com.extensionista.school.controllers;

import com.extensionista.school.entities.Nota;
import com.extensionista.school.service.NotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {

    private final NotaService service;

    public NotaController(NotaService service) {
        this.service = service;
    }

    @PostMapping
    public Nota criar(@RequestBody Nota n) { return service.salvar(n); }

    @GetMapping
    public List<Nota> listar() { return service.listar(); }
}