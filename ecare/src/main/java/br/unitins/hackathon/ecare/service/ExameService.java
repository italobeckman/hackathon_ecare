package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.exame.ExameRequestDTO;
import br.unitins.hackathon.ecare.model.Exame;

public interface ExameService {
    Exame findById(Long id);

    List<Exame> findByNome(String nome);

    List<Exame> findAll();

    Exame create(ExameRequestDTO dto);

    void delete(Long id); 
}
