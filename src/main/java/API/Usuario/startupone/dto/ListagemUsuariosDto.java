package API.Usuario.startupone.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public record ListagemUsuariosDto(
        Long id,
        String nome,
        String sobrenome,
        String email,
        String rg,
        String cpf,
        String telefoneResidencial,
        String telefoneCelular,
        DadosEnderecoDto endereco) {
}


