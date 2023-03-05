package API.Usuario.startupone.usuario;

import API.Usuario.startupone.endereco.Endereco;
import lombok.*;

import javax.persistence.*;

@Entity(name = "Usuario")
@Table(name = "TB_USUARIOS")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String email;
    private String rg;
    private String cpf;
    @Column(name = "telefone_residencial")
    private String telefoneResidencial;

    @Column(name = "telefone_celular")
    private String telefoneCelular;
    @Embedded
    private Endereco endereco;
}
