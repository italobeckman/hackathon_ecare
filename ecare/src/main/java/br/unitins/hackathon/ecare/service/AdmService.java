package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.useradm.AdmRequestDTO;
import br.unitins.hackathon.ecare.model.Adm;

public interface AdmService {
    Adm findById(Long id);

    List<Adm> findByNome(String nome);

    List<Adm> findAll();

    Adm create(AdmRequestDTO dto);

    void delete(Long id); 
}
