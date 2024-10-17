package br.unitins.hackathon.ecare.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Exame extends DefaultEntity {
    private String descricao;
    private LocalDate data;
    private Boolean exameRealizado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public Boolean getExameRealizado() {
        return exameRealizado;
    }

    public void setExameRealizado(Boolean exameRealizado) {
        this.exameRealizado = exameRealizado;
    }

    
    
    
}
