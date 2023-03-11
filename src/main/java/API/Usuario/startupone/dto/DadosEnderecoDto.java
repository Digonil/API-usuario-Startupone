package API.Usuario.startupone.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosEnderecoDto {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
}
