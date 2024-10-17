package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.useradm.AdmRequestDTO;
import br.unitins.hackathon.ecare.model.Adm;
import br.unitins.hackathon.ecare.repository.AdmRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AdmImpl implements AdmService {
    @Inject
    public AdmRepository useradmRepository;

    @Override
    public Adm findById(Long id) {
        return useradmRepository.findById(id);
    }

    @Override
    public List<Adm> findByNome(String nome) {
        return useradmRepository.findByNome(nome);
    }

    @Override
    public List<Adm> findAll() {
        return useradmRepository.findAll().list();
    }

    @Override
    @Transactional
    public Adm create(AdmRequestDTO dto) {
        Adm useradm = new Adm();
        useradm.setNome(dto.nome());
        useradm.setCrmCoren(dto.crm_coren());
        useradm.setEspecialidade(dto.especialidade());
        

        useradmRepository.persist(useradm);
        return useradm;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        useradmRepository.deleteById(id);
    }
}
