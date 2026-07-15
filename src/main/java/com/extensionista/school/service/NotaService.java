package com.extensionista.school.service;

import com.extensionista.school.dtos.SituacaoAlunoDTO;
import com.extensionista.school.entities.Aluno;
import com.extensionista.school.entities.Nota;
import com.extensionista.school.entities.User;
import com.extensionista.school.repositories.AlunoRepository;
import com.extensionista.school.repositories.NotaRepository;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {

    private final NotaRepository repository;
    private final AlunoRepository alunoRepository;

    public NotaService(NotaRepository repository, AlunoRepository alunoRepository) {
        this.repository = repository;
        this.alunoRepository = alunoRepository;
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

    @Transactional(readOnly = true)
    public List<SituacaoAlunoDTO> minhasMedias(User user) {

        Aluno aluno = alunoRepository.findByUser(user.getId());
        if(aluno == null){
            throw new UsernameNotFoundException("Usuario não encontrado");
        }
        List<SituacaoAlunoDTO> listaSituacaoAlunoDTOS = repository.calcularMediaPorMateria(aluno.getId());
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