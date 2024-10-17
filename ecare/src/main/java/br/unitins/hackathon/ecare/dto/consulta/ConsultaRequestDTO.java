package br.unitins.hackathon.ecare.dto.consulta;

import java.time.LocalDate;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaRequestDTO;
import br.unitins.hackathon.ecare.model.Adm;
import br.unitins.hackathon.ecare.model.Consulta;

public record ConsultaRequestDTO (
    String descricao,
    LocalDate data,
    Adm medico
)
{

    public static Consulta valueOf(ConsultaRequestDTO dto){
        Consulta consulta = new Consulta();

        consulta.setDescricao(dto.descricao());
        consulta.setData(dto.data());
        consulta.setMedico(dto.medico());
        return consulta;
    } 
}
