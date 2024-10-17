package br.unitins.hackathon.ecare.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Vacina extends DefaultEntity {
    private String descricao;
    private LocalDate data;
    private Boolean statusRealizada;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Boolean getStatusRealizada() {
        return statusRealizada;
    }
    public void setStatusRealizada(Boolean statusRealizada) {
        this.statusRealizada = statusRealizada;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    

    
}
