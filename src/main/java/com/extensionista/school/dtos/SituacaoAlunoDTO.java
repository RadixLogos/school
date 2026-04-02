package com.extensionista.school.dtos;

public class SituacaoAlunoDTO {
    private String materia;
    private Double media;

    public SituacaoAlunoDTO(String materia, Double media) {
        this.materia = materia;
        this.media = media;
    }

    public String getMateria() { return materia; }
    public Double getMedia() { return media; }
}
