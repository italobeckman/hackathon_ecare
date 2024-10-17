package br.unitins.hackathon.ecare.dto.exame;

import java.time.LocalDate;

import br.unitins.hackathon.ecare.model.Exame;

public record ExameResponseDTO(
    Long id,
    String descricao,
    boolean exameRealizado,
    LocalDate data
){
    

    public static ExameResponseDTO valueOf(Exame exame) {
        return new ExameResponseDTO(
            exame.getId(), 
            exame.getDescricao(),
            exame.getExameRealizado(),
            exame.getData()
        );
    }
}
