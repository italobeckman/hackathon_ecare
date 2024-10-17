package br.unitins.hackathon.ecare.dto.vacina;

import java.time.LocalDate;

import br.unitins.hackathon.ecare.model.Vacina;

public record VacinaResponseDTO(
    Long id,
    String descricao,
    Boolean statusRealizada,
    LocalDate data
){
    

    public static VacinaResponseDTO valueOf(Vacina vacina) {
        return new VacinaResponseDTO(
            vacina.getId(), 
            vacina.getDescricao(),
            vacina.getStatusRealizada(),
            vacina.getData()
        );
    }
}
