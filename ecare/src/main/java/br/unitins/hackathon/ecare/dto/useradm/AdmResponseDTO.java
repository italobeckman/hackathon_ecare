package br.unitins.hackathon.ecare.dto.useradm;

import br.unitins.hackathon.ecare.model.Adm;

public record AdmResponseDTO(
    Long id,
    String nome,
    String crm_coren,
    String especialidade
){
    

    public static AdmResponseDTO valueOf(Adm user) {
        return new AdmResponseDTO(
            user.getId(), 
            user.getNome(),
            user.getCrmCoren(),
            user.getEspecialidade()
        );
    }
}
