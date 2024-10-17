package br.unitins.hackathon.ecare.dto.consulta;

import java.time.LocalDate;

import br.unitins.hackathon.ecare.model.Consulta;
import br.unitins.hackathon.ecare.model.Adm;

public record ConsultaResponseDTO(
    Long id,
    String descricao,
    Adm medico,
    LocalDate data
){
    

    public static ConsultaResponseDTO valueOf(Consulta consulta) {
        return new ConsultaResponseDTO(
            consulta.getId(), 
            consulta.getDescricao(),
            consulta.getMedico(),
            consulta.getData()
        );
    }
}
