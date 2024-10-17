package br.unitins.hackathon.ecare.service;

import java.util.List;

import br.unitins.hackathon.ecare.dto.vacina.VacinaRequestDTO;
import br.unitins.hackathon.ecare.model.Gestante;
import br.unitins.hackathon.ecare.model.Vacina;
import br.unitins.hackathon.ecare.repository.VacinaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class VacinaServiceImpl implements VacinaService {
    @Inject
    public VacinaRepository vacinaRepository;

    @Inject
    public GestanteService gestanteService;

    @Override
    public Vacina findById(Long id) {
        return vacinaRepository.findById(id);
    }

    @Override
    public List<Vacina> findAll() {
        return vacinaRepository.findAll().list();
    }

    @Override
    @Transactional
    public Vacina create(VacinaRequestDTO dto) {
        Vacina vacina = new Vacina();
        vacina.setDescricao(dto.descricao());
        vacina.setData(dto.data());
        vacina.setStatusRealizada(dto.statusRealizada());
        Gestante gestante = gestanteService.findById(dto.gestante());
        gestante.getVacinas().add(vacina);
        vacinaRepository.persist(vacina);
        return vacina;
    }

    @Override
    @Transactional
    public Vacina update(Long id, VacinaRequestDTO dto) {
        Vacina vacina = vacinaRepository.findById(id);

        

        return vacina;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        vacinaRepository.deleteById(id);
    }

    @Override
    public List<Vacina> findByNome(String nome) {
        return vacinaRepository.findByNome(nome);
    }
}
