package com.localization.localization.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "cidade")
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cod_cidade")
    private Long codCidade;
    @Column(name = "nom_cidade")
    private String nome;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Estado estado;

    public Cidade(){}

    public Cidade(Long codCidade, String nome, Estado estado) {
        this.codCidade = codCidade;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Long codCidade) {
        this.codCidade = codCidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return codCidade.equals(cidade.codCidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCidade);
    }
}
