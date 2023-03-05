package API.Usuario.startupone.usuario;

import API.Usuario.startupone.endereco.DadosEnderecoDto;
import API.Usuario.startupone.endereco.Endereco;
import jakarta.validation.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Embedded;

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


