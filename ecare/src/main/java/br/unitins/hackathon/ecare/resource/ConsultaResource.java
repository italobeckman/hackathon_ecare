package br.unitins.hackathon.ecare.resource;

import java.util.List;

import br.unitins.hackathon.ecare.dto.consulta.ConsultaRequestDTO;
import br.unitins.hackathon.ecare.model.Consulta;
import br.unitins.hackathon.ecare.service.ConsultaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/Consultas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConsultaResource {

    @Inject
    public ConsultaService consultaService;

    @GET
    @Path("/{id}")
    public Consulta findById(@PathParam("id") Long id) {
        return consultaService.findById(id);
    }

    @GET
    @Path("/search/{nome}")
    public List<Consulta> findByNome(@PathParam("nome") String nome) {
        return consultaService.findByNome(nome);
    }

    @GET
    public List<Consulta> findAll() {
        return consultaService.findAll();
    }

    @POST
    public Consulta create(ConsultaRequestDTO consulta) {

        return consultaService.create(consulta);
    }


    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        consultaService.delete(id);
    }
}