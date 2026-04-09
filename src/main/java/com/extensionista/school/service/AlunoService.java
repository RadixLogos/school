package com.extensionista.school.service;

import com.extensionista.school.dtos.AlunoDTO;
import com.extensionista.school.entities.Aluno;
import com.extensionista.school.repositories.AlunoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;


    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    @Transactional(readOnly = true)
    public List<AlunoDTO> listar() {
        return repository.findAll()
                .stream()
                .map(a -> new AlunoDTO(a.getId(), a.getNome()))
                .toList();
    }
    @Transactional(readOnly = true)
    public Aluno buscar(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
