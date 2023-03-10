package API.Usuario.startupone.controller;

import API.Usuario.startupone.dto.ListagemUsuariosDto;
import API.Usuario.startupone.service.UsuarioService;
import API.Usuario.startupone.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @GetMapping()
    public Page<ListagemUsuariosDto> listar(@PageableDefault(size = 10) Pageable paginacao) {
        return service.obterUsuarios(paginacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListagemUsuariosDto> listarPorId(@PathVariable @NotNull Long id) {
        ListagemUsuariosDto dto = service.ObterPorId(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<ListagemUsuariosDto> criarUsuario(@RequestBody @Valid ListagemUsuariosDto dto, UriComponentsBuilder uriBuilder) {
        ListagemUsuariosDto usuario = service.criarUsuario(dto);
        URI endereco = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(endereco).body(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ListagemUsuariosDto> atualizar(@PathVariable @NotNull Long id, @RequestBody @Valid ListagemUsuariosDto dto) {
        ListagemUsuariosDto atualizado = service.atualizarUsuario(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ListagemUsuariosDto> remover(@PathVariable @NotNull Long id) {
        service.excluirUsuario(id);
        return ResponseEntity.noContent().build();
    }


}
