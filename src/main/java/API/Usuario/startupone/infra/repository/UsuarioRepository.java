package API.Usuario.startupone.infra.repository;

import API.Usuario.startupone.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
