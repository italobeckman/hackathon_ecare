package br.unitins.hackathon.ecare.dto.gestante;

import java.time.LocalDate;
import java.util.List;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaResponseDTO;
import br.unitins.hackathon.ecare.dto.exame.ExameResponseDTO;
import br.unitins.hackathon.ecare.dto.vacina.VacinaResponseDTO;
import br.unitins.hackathon.ecare.model.Gestante;
import br.unitins.hackathon.ecare.model.Telefone;

public record GestanteResponseDTO(
    Long id, 
    String nome,
    String cpf,
    LocalDate dataNascimento,
    LocalDate dataPrevistaParto,
    Telefone telefone,
    List<ConsultaResponseDTO> consultas,
    List<ExameResponseDTO> exames,
    List<VacinaResponseDTO> vacinas
    
    ) {
        public static GestanteResponseDTO valueOf(Gestante gestante) {
            return new GestanteResponseDTO(
                gestante.getId(), 
                gestante.getNome(),
                gestante.getCpf(),
                gestante.getDataNascimento(),
                gestante.getDataPrevistaParto(),
                gestante.getTelefone(),
        
                gestante.getConsultas().stream()
                    .map(ConsultaResponseDTO::valueOf)
                    .toList(),
        
                gestante.getExames().stream()
                    .map(ExameResponseDTO::valueOf)
                    .toList(),
        
                gestante.getVacinas().stream()
                    .map(VacinaResponseDTO::valueOf)
                    .toList()
            );
        }
}
