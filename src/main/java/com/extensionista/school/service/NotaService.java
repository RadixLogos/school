package com.extensionista.school.service;

import com.extensionista.school.dtos.SituacaoAlunoDTO;
import com.extensionista.school.entities.Nota;
import com.extensionista.school.repositories.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService {

    private final NotaRepository repository;

    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }

    public Nota salvar(Nota n) { return repository.save(n); }
    public List<Nota> listar() { return repository.findAll(); }

    public List<SituacaoAlunoDTO> mediasPorAluno(Long alunoId) {
        return repository.calcularMediaPorMateria(alunoId);
    }
}