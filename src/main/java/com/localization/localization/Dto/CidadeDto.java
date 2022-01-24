package com.localization.localization.Dto;

import com.localization.localization.Entities.Cidade;

import java.io.Serializable;

public class CidadeDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome_estado;
    private String nome;

    public CidadeDto(){}

    public CidadeDto(Cidade obj) {
        this.nome_estado = obj.getEstado().getNomeEstado();
        this.nome = obj.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }
}
