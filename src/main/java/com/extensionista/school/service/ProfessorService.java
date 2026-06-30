package com.extensionista.school.service;

import com.extensionista.school.dtos.ProfessorResponseDTO;
import com.extensionista.school.entities.Professor;
import com.extensionista.school.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public Professor salvar(Professor p) { return repository.save(p); }
    @Transactional(readOnly = true)
    public List<ProfessorResponseDTO> listar() { return repository.findAll().stream().map(ProfessorResponseDTO::converterEntidadeDTO).toList(); }
}
