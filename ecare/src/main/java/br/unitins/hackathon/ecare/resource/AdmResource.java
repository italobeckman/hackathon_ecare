package br.unitins.hackathon.ecare.resource;

import java.util.List;

import br.unitins.hackathon.ecare.dto.useradm.AdmRequestDTO;
import br.unitins.hackathon.ecare.model.Adm;
import br.unitins.hackathon.ecare.service.AdmService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/Adms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdmResource {

    @Inject
    public AdmService AdmService;

    @GET
    @Path("/{id}")
    public Adm findById(@PathParam("id") Long id) {
        return AdmService.findById(id);
    }

    @GET
    @Path("/search/{nome}")
    public List<Adm> findByNome(@PathParam("nome") String nome) {
        return AdmService.findByNome(nome);
    }

    @GET
    public List<Adm> findAll() {
        return AdmService.findAll();
    }

    @POST
    public Adm create(AdmRequestDTO userAdm) {

        return AdmService.create(userAdm);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        AdmService.delete(id);
    }
}