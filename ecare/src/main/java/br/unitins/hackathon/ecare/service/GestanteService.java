package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.model.Gestante;
import br.unitins.hackathon.ecare.dto.gestante.GestanteRequestDTO;

public interface GestanteService {
    Gestante findById(Long id);

    List<Gestante> findByNome(String nome);

    List<Gestante> findAll();

    Gestante create(GestanteRequestDTO dto);

    void delete(Long id);
}
