package com.extensionista.school.dtos;

import com.extensionista.school.entities.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDTO {
    private Long id;
    private String nome;
    private List<MateriaDTO> materias = new ArrayList<>();
    public ProfessorDTO() {
    }

    public ProfessorDTO( String nome) {
        this.nome = nome;

    }

    public static Professor converterDTOEntidade(ProfessorDTO professorDTO){
        var professor = new Professor(professorDTO.getId(), professorDTO.getNome());

        professor.setMaterias(professorDTO.getMaterias().stream().map(MateriaDTO::converterDtoEntidade).toList());
        return professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<MateriaDTO> getMaterias() {
        return materias;
    }
}
