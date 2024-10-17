package br.unitins.hackathon.ecare.resource;

import java.util.List;

import br.unitins.hackathon.ecare.dto.exame.ExameRequestDTO;
import br.unitins.hackathon.ecare.model.Exame;
import br.unitins.hackathon.ecare.service.ExameService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/Exames")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExameResource {

    @Inject
    public ExameService exameService;

    @GET
    @Path("/{id}")
    public Exame findById(@PathParam("id") Long id) {
        return exameService.findById(id);
    }

    @GET
    @Path("/search/{nome}")
    public List<Exame> findByNome(@PathParam("nome") String nome) {
        return exameService.findByNome(nome);
    }

    @GET
    public List<Exame> findAll() {
        return exameService.findAll();
    }

    @POST
    public Exame create(ExameRequestDTO exame) {

        return exameService.create(exame);
    }


    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        exameService.delete(id);
    }
}