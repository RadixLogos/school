package com.extensionista.school.service;

import com.extensionista.school.entities.Professor;
import com.extensionista.school.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public Professor salvar(Professor p) { return repository.save(p); }
    public List<Professor> listar() { return repository.findAll(); }
}
