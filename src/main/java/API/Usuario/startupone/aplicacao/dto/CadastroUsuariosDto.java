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

    String nome;

    String sobrenome;

    @Email
    String email;

    String senha;

    String rg;

    String cpf;

    String telefone;

    @Embedded
    DadosEnderecoDto endereco;
}


