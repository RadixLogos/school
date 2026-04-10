package com.extensionista.school.service;

import com.extensionista.school.dtos.SituacaoAlunoDTO;
import com.extensionista.school.entities.Nota;
import com.extensionista.school.repositories.NotaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {

    private final NotaRepository repository;

    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Nota salvar(Nota n) { return repository.save(n); }
    @Transactional(readOnly = true)
    public List<Nota> listar() { return repository.findAll(); }

    @Transactional(readOnly = true)
    public List<SituacaoAlunoDTO> mediasPorAluno(Long alunoId) {
        List<SituacaoAlunoDTO> listaSituacaoAlunoDTOS = new ArrayList<>();
        listaSituacaoAlunoDTOS = repository.calcularMediaPorMateria(alunoId);;
        listaSituacaoAlunoDTOS.forEach(a ->{
            if(a.getMedia() <= 6){
                a.setSituacao("Reprovado");
            }else {
                a.setSituacao("Aprovado");
            }
        });
        return listaSituacaoAlunoDTOS;
    }
}