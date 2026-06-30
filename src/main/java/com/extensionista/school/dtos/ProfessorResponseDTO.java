package com.extensionista.school.dtos;

import com.extensionista.school.entities.Materia;
import com.extensionista.school.entities.Professor;

public record ProfessorResponseDTO(Long id, String nome, String materias) {

    public static ProfessorResponseDTO converterEntidadeDTO(Professor professor){
        StringBuilder sBuild = new StringBuilder();
        String materias = "";
        int posicao = professor.getMaterias().size();
        int i = 1;
        for(Materia m : professor.getMaterias()){
            sBuild.append(m.getNome());
            if(posicao > i){
                sBuild.append(" - ");
            }
            i++;
        }
        materias = sBuild.toString();
        return new ProfessorResponseDTO(professor.getId(), professor.getNome(), materias);
    }
}
