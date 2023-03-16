package API.Usuario.startupone.endereco;

import API.Usuario.startupone.dto.CadastroUsuariosDto;
import API.Usuario.startupone.dto.DadosEnderecoDto;
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

    @NotBlank
    private String logradouro;
    @NotBlank
    private String numero;
    private String complemento;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String cep;
    @NotBlank
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
