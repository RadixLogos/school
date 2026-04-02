package com.extensionista.school.dtos;

public class AlunoDTO {

    private Long id;
    private String nome;

    public AlunoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // getters
}
