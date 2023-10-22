package med.voll.api.domain.medico;

import jakarta.persistence.Enumerated;

public record DadosListagemMedico(Long id, String nome, String email, String crm,
                                  @Enumerated Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
