package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaRequestDTO;
import br.unitins.hackathon.ecare.model.Consulta;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public interface ConsultaService {
    Consulta findById(Long id);

    List<Consulta> findByNome(String nome);

    List<Consulta> findAll();

    Consulta create(ConsultaRequestDTO dto);

    void delete(Long id); 
    
}
