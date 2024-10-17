package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.exame.ExameRequestDTO;
import br.unitins.hackathon.ecare.model.Exame;
import br.unitins.hackathon.ecare.repository.ExameRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ExameServiceImpl implements ExameService {
    @Inject
    public ExameRepository exameRepository;

    @Override
    public Exame findById(Long id) {
        return exameRepository.findById(id);
    }

    @Override
    public List<Exame> findByNome(String nome) {
        return exameRepository.findByNome(nome);
    }

    @Override
    public List<Exame> findAll() {
        return exameRepository.findAll().list();
    }

    @Override
    @Transactional
    public Exame create(ExameRequestDTO dto) {
        Exame exame = new Exame();
        exame.setDescricao(dto.descricao());
        exame.setData(dto.data());
        exame.setExameRealizado(dto.exameRealizado());
        exameRepository.persist(exame);
        return exame;
    }


    @Override
    @Transactional
    public void delete(Long id) {
        exameRepository.deleteById(id);
    }

}
