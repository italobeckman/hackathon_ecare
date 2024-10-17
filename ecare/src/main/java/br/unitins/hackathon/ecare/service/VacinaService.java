package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.vacina.VacinaRequestDTO;
import br.unitins.hackathon.ecare.model.Vacina;

public interface VacinaService {
    Vacina findById(Long id);

    List<Vacina> findByNome(String nome);

    List<Vacina> findAll();

    Vacina create(VacinaRequestDTO dto);

    Vacina update(Long id, VacinaRequestDTO dto);

    void delete(Long id); 
}
