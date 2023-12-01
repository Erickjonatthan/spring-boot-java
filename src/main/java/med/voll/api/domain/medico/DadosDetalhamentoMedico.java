package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String telefone, String crm, Especialidade especialidade, String email, Endereco endereco) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade(), medico.getEmail(), medico.getEndereco() );
    }
}
