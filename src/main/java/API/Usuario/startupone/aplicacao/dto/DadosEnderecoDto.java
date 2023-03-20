package API.Usuario.startupone.aplicacao.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@Embeddable
public class DadosEnderecoDto {


    private String logradouro;

    private String numero;
    private String complemento;

    private String bairro;

    private String cidade;

    private String cep;

    private String uf;
}
