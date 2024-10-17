package br.unitins.hackathon.ecare.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Consulta extends DefaultEntity {
    private LocalDate data;
    private String descricao;

    @ManyToOne
    private Adm medico;

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Adm getMedico() {
        return medico;
    }

    public void setMedico(Adm medico) {
        this.medico = medico;
    }
}