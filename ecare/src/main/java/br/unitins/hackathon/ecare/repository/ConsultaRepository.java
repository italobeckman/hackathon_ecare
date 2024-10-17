package br.unitins.hackathon.ecare.repository;

import java.util.List;

import br.unitins.hackathon.ecare.model.Consulta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsultaRepository implements PanacheRepository<Consulta>{
    public List<Consulta> findByNome(String nome) {
        return find("SELECT e FROM Consulta e WHERE e.nome LIKE ?1", "%" + nome + "%").list();
    }
}
