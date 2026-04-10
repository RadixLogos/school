package com.extensionista.school.dtos;

public class SituacaoAlunoDTO {
    private String materia;
    private Double media;
    private String nomeAluno;
    private String situacao;
    public SituacaoAlunoDTO(String materia, Double media, String nomeAluno) {
        this.materia = materia;
        this.media = media;
        this.nomeAluno = nomeAluno;
    }

    public String getMateria() { return materia; }
    public Double getMedia() { return media; }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
}
