package com.extensionista.school.service;

import com.extensionista.school.entities.Materia;
import com.extensionista.school.repositories.MateriaRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MateriaService {

    private final MateriaRepository repository;

    public MateriaService(MateriaRepository repository) {
        this.repository = repository;
    }

    public Materia salvar(Materia m) { return repository.save(m); }
    public List<Materia> listar() { return repository.findAll(); }
}
