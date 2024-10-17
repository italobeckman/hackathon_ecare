package br.unitins.hackathon.ecare.repository;

import java.util.List;

import br.unitins.hackathon.ecare.model.Adm;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class AdmRepository implements PanacheRepository<Adm>{
    public List<Adm> findByNome(String nome) {
        return find("SELECT e FROM UserAdm e WHERE e.nome LIKE ?1", "%" + nome + "%").list();
    }
}
