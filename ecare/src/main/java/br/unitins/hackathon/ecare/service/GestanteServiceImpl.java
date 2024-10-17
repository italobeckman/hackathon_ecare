package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaRequestDTO;
import br.unitins.hackathon.ecare.dto.exame.ExameRequestDTO;
import br.unitins.hackathon.ecare.dto.gestante.GestanteRequestDTO;
import br.unitins.hackathon.ecare.dto.vacina.VacinaRequestDTO;
import br.unitins.hackathon.ecare.model.Gestante;
import br.unitins.hackathon.ecare.repository.GestanteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
@ApplicationScoped
public class GestanteServiceImpl implements GestanteService {
    @Inject
    public GestanteRepository gestanteRepository;

    @Override
    public Gestante findById(Long id) {
        return gestanteRepository.findById(id);
    }

    @Override
    public List<Gestante> findByNome(String nome) {
        return gestanteRepository.findByNome(nome);
    }

    @Override
    public List<Gestante> findAll() {
        return gestanteRepository.findAll().list();
    }

    @Override
    @Transactional
    public Gestante create(GestanteRequestDTO dto) {
        Gestante gestante = new Gestante();
        gestante.setNome(dto.nome());
        gestante.setCpf(dto.cpf());
        gestante.setDataNascimento(dto.dataNascimento());
        gestante.setDataPrevistaParto(dto.dataPrevistaParto());

        gestante.setConsultas(dto.consultas().stream().map(ConsultaRequestDTO::valueOf).toList());
        gestante.setExames(dto.exames().stream().map(ExameRequestDTO::valueOf).toList());
        gestante.setVacinas(dto.vacinas().stream().map(VacinaRequestDTO::valueOf).toList());
        gestanteRepository.persist(gestante);
        return gestante;
    }


    @Override
    @Transactional
    public void delete(Long id) {
        gestanteRepository.deleteById(id);
    }
}

