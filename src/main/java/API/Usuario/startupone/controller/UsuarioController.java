package API.Usuario.startupone.controller;

import API.Usuario.startupone.usuario.ListagemUsuariosDto;
import API.Usuario.startupone.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

//    @GetMapping
//    public Page<ListagemUsuariosDto> listarUsuarios(@PageableDefault(size = 10, sort = {"nome"})Pageable paginacao){
//        return repository.findAll(paginacao).map(ListagemUsuariosDto::new);
//    }
}
