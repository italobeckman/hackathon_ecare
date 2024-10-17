package br.unitins.hackathon.ecare.resource;

import java.util.List;

import br.unitins.hackathon.ecare.dto.gestante.GestanteRequestDTO;
import br.unitins.hackathon.ecare.model.Gestante;
import br.unitins.hackathon.ecare.service.GestanteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/Gestantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GestanteResource {

    @Inject
    public GestanteService gestanteService;

    @GET
    @Path("/{id}")
    public Gestante findById(@PathParam("id") Long id) {
        return gestanteService.findById(id);
    }

    @GET
    @Path("/search/{nome}")
    public List<Gestante> findByNome(@PathParam("nome") String nome) {
        return gestanteService.findByNome(nome);
    }

    @GET
    public List<Gestante> findAll() {
        return gestanteService.findAll();
    }

    @POST
    public Gestante create(GestanteRequestDTO gestante) {

        return gestanteService.create(gestante);
    }


    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        gestanteService.delete(id);
    }
}