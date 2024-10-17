package br.unitins.hackathon.ecare.dto.exame;

import java.time.LocalDate;

import br.unitins.hackathon.ecare.dto.exame.ExameRequestDTO;
import br.unitins.hackathon.ecare.model.Exame;

public record ExameRequestDTO (
    String descricao,
    LocalDate data,
    Boolean exameRealizado
)
{

    public static Exame valueOf(ExameRequestDTO dto){
        Exame exame = new Exame();

        exame.setDescricao(dto.descricao());
        exame.setData(dto.data());
        exame.setExameRealizado(dto.exameRealizado());
        return exame;
    } 
}
