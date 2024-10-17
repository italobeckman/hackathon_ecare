package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaRequestDTO;
import br.unitins.hackathon.ecare.model.Consulta;
import br.unitins.hackathon.ecare.repository.ConsultaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
@ApplicationScoped
public class ConsultaServiceImpl implements ConsultaService {
    
    @Inject
    public ConsultaRepository consultaRepository;

    @Override
    public Consulta findById(Long id) {
        return consultaRepository.findById(id);
    }

    @Override
    public List<Consulta> findByNome(String nome) {
        return consultaRepository.findByNome(nome);
    }

    @Override
    public List<Consulta> findAll() {
        return consultaRepository.findAll().list();
    }

    @Override
    @Transactional
    public Consulta create(ConsultaRequestDTO dto) {
        Consulta consulta = new Consulta();
        consulta.setDescricao(dto.descricao());
        consulta.setData(dto.data());
        consulta.setMedico(dto.medico());

        consultaRepository.persist(consulta);
        return consulta;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        consultaRepository.deleteById(id);
    }
}
