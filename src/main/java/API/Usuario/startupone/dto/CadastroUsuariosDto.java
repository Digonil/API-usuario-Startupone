package API.Usuario.startupone.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CadastroUsuariosDto {
    @NotBlank
    String nome;
    @NotBlank
    String sobrenome;
    @Email
    String email;
    @NotBlank
    String rg;
    @NotBlank
    String cpf;
    @NotBlank
    String telefoneResidencial;
    @NotBlank
    String telefoneCelular;
    @Valid
    DadosEnderecoDto endereco;
}


