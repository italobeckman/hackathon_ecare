package br.unitins.hackathon.ecare.repository;

import java.util.List;

import br.unitins.hackathon.ecare.model.Exame;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class ExameRepository implements PanacheRepository<Exame>{
    public List<Exame> findByNome(String nome) {
        return find("SELECT e FROM Exame e WHERE e.nome LIKE ?1", "%" + nome + "%").list();
    }
}
