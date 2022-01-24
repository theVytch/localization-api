package com.localization.localization.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "estado")
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cod_estado")
    private Long codEstado;
    @Column(name = "cod_pais")
    private Long codPais;
    @Column(name = "sgl_estado")
    private String sglEstado;
    @Column(name = "nom_estado")
    private String nomeEstado;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();

    public Estado(){}

    public Estado(Long codEstado, Long codPais, String sglEstado, String nomeEstado) {
        this.codEstado = codEstado;
        this.codPais = codPais;
        this.sglEstado = sglEstado;
        this.nomeEstado = nomeEstado;
    }

    public Long getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(Long codEstado) {
        this.codEstado = codEstado;
    }

    public Long getCodPais() {
        return codPais;
    }

    public void setCodPais(Long codPais) {
        this.codPais = codPais;
    }

    public String getSglEstado() {
        return sglEstado;
    }

    public void setSglEstado(String sglEstado) {
        this.sglEstado = sglEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return codEstado.equals(estado.codEstado) && Objects.equals(codPais, estado.codPais) && Objects.equals(sglEstado, estado.sglEstado) && Objects.equals(nomeEstado, estado.nomeEstado) && Objects.equals(cidades, estado.cidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEstado);
    }
}
