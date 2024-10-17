package br.unitins.hackathon.ecare.dto.gestante;

import java.time.LocalDate;
import java.util.List;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaRequestDTO;
import br.unitins.hackathon.ecare.dto.exame.ExameRequestDTO;
import br.unitins.hackathon.ecare.dto.vacina.VacinaRequestDTO;
import br.unitins.hackathon.ecare.model.Telefone;
import jakarta.validation.Valid;

public record GestanteRequestDTO (
    String cpf,
    String nome,
    LocalDate dataNascimento,
    LocalDate dataPrevistaParto,
    Telefone telefone,
    @Valid
    List<ConsultaRequestDTO> consultas,

    @Valid
    List<ExameRequestDTO> exames,

    @Valid
    List<VacinaRequestDTO> vacinas
)
{}
