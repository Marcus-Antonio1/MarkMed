package mark.med.api.paciente;

import jakarta.validation.constraints.NotNull;
import mark.med.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
