package com.extensionista.school.controllers;


import com.extensionista.school.dtos.AlunoDTO;
import com.extensionista.school.dtos.SituacaoAlunoDTO;
import com.extensionista.school.entities.Aluno;
import com.extensionista.school.service.AlunoService;
import com.extensionista.school.service.NotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;
    private final NotaService notaService;

    public AlunoController(AlunoService service, NotaService notaService) {
        this.service = service;
        this.notaService = notaService;
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno a) { return service.salvar(a); }

    @GetMapping
    public List<AlunoDTO> listar() { return service.listar(); }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) { return service.buscar(id); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }

    // ENDPOINT SITUAÇÃO DO ALUNO
    @GetMapping("/{id}/situacao")
    public List<SituacaoAlunoDTO> situacao(@PathVariable Long id) {
        return notaService.mediasPorAluno(id);
    }
}
