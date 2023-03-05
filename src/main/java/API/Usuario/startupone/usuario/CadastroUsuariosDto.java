package API.Usuario.startupone.usuario;

import API.Usuario.startupone.endereco.DadosEnderecoDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CadastroUsuariosDto(
        @NotBlank
        String nome,
        @NotBlank
        String sobrenome,
        @Email
        String email,
        @NotBlank
        String rg,
        @NotBlank
        String cpf,
        @NotBlank
        String telefoneResidencial,
        @NotBlank
        String telefoneCelular,
        @Valid
        DadosEnderecoDto endereco) {
}


