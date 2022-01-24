package com.localization.localization.Dto;

import com.localization.localization.Entities.Estado;

import java.io.Serializable;

public class EstadoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long cod_Estado;
    private Long cod_Pais;
    private String sgl_Estado;
    private String nome_Estado;

    public EstadoDto(Estado obj) {
        this.cod_Estado = obj.getCodEstado();
        this.cod_Pais = obj.getCodPais();
        this.sgl_Estado = obj.getSglEstado();
        this.nome_Estado = obj.getNomeEstado();
    }

    public Long getCod_Estado() {
        return cod_Estado;
    }

    public void setCod_Estado(Long cod_Estado) {
        this.cod_Estado = cod_Estado;
    }

    public Long getCod_Pais() {
        return cod_Pais;
    }

    public void setCod_Pais(Long cod_Pais) {
        this.cod_Pais = cod_Pais;
    }

    public String getSgl_Estado() {
        return sgl_Estado;
    }

    public void setSgl_Estado(String sgl_Estado) {
        this.sgl_Estado = sgl_Estado;
    }

    public String getNome_Estado() {
        return nome_Estado;
    }

    public void setNome_Estado(String nome_Estado) {
        this.nome_Estado = nome_Estado;
    }

}
