package API.Usuario.startupone.dominio;

import API.Usuario.startupone.aplicacao.dto.DadosEnderecoDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private String logradouro;

    private String numero;
    private String complemento;

    private String bairro;

    private String cidade;

    private String cep;
    private String uf;

    public Endereco(DadosEnderecoDto endereco) {
        this.logradouro = endereco.getLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getBairro();
        this.cep = endereco.getBairro();
        this.uf = endereco.getUf();
    }
}
