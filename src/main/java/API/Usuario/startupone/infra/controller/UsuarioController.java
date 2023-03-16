package API.Usuario.startupone.infra.controller;

import API.Usuario.startupone.aplicacao.dto.CadastroUsuariosDto;
import API.Usuario.startupone.aplicacao.dto.ListagemUsuariosDto;
import API.Usuario.startupone.aplicacao.service.UsuarioService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<CadastroUsuariosDto> criarUsuario(@RequestBody @Valid CadastroUsuariosDto dto) {
        CadastroUsuariosDto usuario = service.criarUsuario(dto);
        return ResponseEntity.ok().body(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CadastroUsuariosDto> atualizar(@PathVariable @NotNull Long id, @RequestBody @Valid CadastroUsuariosDto dto) {
        CadastroUsuariosDto atualizado = service.atualizarUsuario(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ListagemUsuariosDto> remover(@PathVariable @NotNull Long id) {
        service.excluirUsuario(id);
        return ResponseEntity.noContent().build();
    }


}
