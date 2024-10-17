package br.unitins.hackathon.ecare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "adm")
public class Adm extends DefaultEntity {
    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "crm_coren", nullable = false)
    private String crmCoren;

    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrmCoren() {
        return crmCoren;
    }

    public void setCrmCoren(String crmCoren) {
        this.crmCoren = crmCoren;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}