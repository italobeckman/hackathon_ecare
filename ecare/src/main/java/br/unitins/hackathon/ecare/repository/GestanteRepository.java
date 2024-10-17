package br.unitins.hackathon.ecare.repository;

import java.util.List;

import br.unitins.hackathon.ecare.model.Gestante;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GestanteRepository implements PanacheRepository<Gestante>{
    public List<Gestante> findByNome(String nome){
        return find("UPPER(nome) LIKE ?1", "%" + nome.toUpperCase() + "%").list();
    }
}
