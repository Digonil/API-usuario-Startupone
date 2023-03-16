package API.Usuario.startupone.aplicacao.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embedded;

@Getter
@Setter
@ToString
public class CadastroUsuariosDto {
    @NotBlank
    String nome;
    @NotBlank
    String sobrenome;
    @NotBlank
    @Email
    String email;
    @NotBlank
    String rg;
    @NotBlank
    String cpf;
    String telefoneResidencial;
    @NotBlank
    String telefoneCelular;
    @NotBlank
    @Valid
    @Embedded
    DadosEnderecoDto endereco;
}


