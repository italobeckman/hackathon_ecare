package br.unitins.hackathon.ecare.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Gestante extends DefaultEntity {

    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataPrevistaParto;



    @OneToOne
    @JoinColumn(name = "gestante_id")
    private Telefone telefone;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestante_id")
    private List<Consulta> consultas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestante_id")
    private List<Exame> exames;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestante_id")
    private List<Vacina> vacinas;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataPrevistaParto() {
        return dataPrevistaParto;
    }

    public void setDataPrevistaParto(LocalDate dataPrevistaParto) {
        this.dataPrevistaParto = dataPrevistaParto;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    
}
