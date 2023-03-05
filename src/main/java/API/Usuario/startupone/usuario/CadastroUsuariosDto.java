package API.Usuario.startupone.usuario;

import API.Usuario.startupone.endereco.DadosEnderecoDto;

public record CadastroUsuariosDto(
      
        String nome,
        String sobrenome,
        String email,
        String rg,
        String cpf,
        String telefoneResidencial,
        String telefoneCelular,
        DadosEnderecoDto endereco) {
}


