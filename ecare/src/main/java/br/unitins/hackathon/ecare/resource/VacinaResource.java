package br.unitins.hackathon.ecare.resource;

import java.util.List;

import br.unitins.hackathon.ecare.dto.vacina.VacinaRequestDTO;
import br.unitins.hackathon.ecare.model.Vacina;
import br.unitins.hackathon.ecare.service.VacinaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/Vacinas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VacinaResource {

    @Inject
    public VacinaService vacinaService;

    @GET
    @Path("/{id}")
    public Vacina findById(@PathParam("id") Long id) {
        return vacinaService.findById(id);
    }

    @GET
    @Path("/search/{nome}")
    public List<Vacina> findByNome(@PathParam("nome") String nome) {
        return vacinaService.findByNome(nome);
    }

    @GET
    public List<Vacina> findAll() {
        return vacinaService.findAll();
    }

    @POST
    public Vacina create(VacinaRequestDTO vacina) {

        return vacinaService.create(vacina);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id, VacinaRequestDTO vacina) {
        vacinaService.update(id, vacina);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        vacinaService.delete(id);
    }
}