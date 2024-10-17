package br.unitins.hackathon.ecare.repository;

import java.util.List;

import br.unitins.hackathon.ecare.model.Vacina;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class VacinaRepository implements PanacheRepository<Vacina>{
    public List<Vacina> findByNome(String nome) {
        return find("SELECT e FROM Vacina e WHERE e.nome LIKE ?1", "%" + nome + "%").list();
    }
}
