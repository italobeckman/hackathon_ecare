package br.unitins.hackathon.ecare.dto.vacina;

import java.time.LocalDate;

import br.unitins.hackathon.ecare.model.Vacina;

public record VacinaRequestDTO (
    String descricao,
    LocalDate data,
    Boolean statusRealizada,
    Long gestante
)
{
    public static Vacina valueOf(VacinaRequestDTO dto){
        Vacina telefone = new Vacina();

        telefone.setDescricao(dto.descricao());
        telefone.setData(dto.data());
        telefone.setStatusRealizada(dto.statusRealizada());
        return telefone;
    } 
}
