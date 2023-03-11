package API.Usuario.startupone.usuario;

import API.Usuario.startupone.endereco.Endereco;
import jakarta.validation.constraints.Email;
import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "usuarios")
@Getter
@Setter
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
    @Email
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
