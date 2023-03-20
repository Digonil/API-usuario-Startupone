package API.Usuario.startupone.aplicacao.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListagemUsuariosDto{

    Long id;
    String nome;
    String sobrenome;
    String email;

    String senha;
    String rg;
    String cpf;
    String telefone;
    DadosEnderecoDto endereco;

}



