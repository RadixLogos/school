package com.extensionista.school.dtos;

public class SituacaoAlunoDTO {
    private String materia;
    private Double media;
    private String nomeAluno;
    public SituacaoAlunoDTO(String materia, Double media, String nomeAluno) {
        this.materia = materia;
        this.media = media;
        this.nomeAluno = nomeAluno;
    }

    public String getMateria() { return materia; }
    public Double getMedia() { return media; }

    public String getNomeAluno() {
        return nomeAluno;
    }
}
