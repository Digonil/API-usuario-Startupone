package API.Usuario.startupone.aplicacao.service;

import API.Usuario.startupone.aplicacao.dto.CadastroUsuariosDto;
import API.Usuario.startupone.aplicacao.dto.ListagemUsuariosDto;
import API.Usuario.startupone.dominio.Usuario;
import API.Usuario.startupone.infra.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;
    @Autowired
    ModelMapper modelMapper;

    public Page<ListagemUsuariosDto> obterUsuarios(Pageable paginacao) {
        return repository.findAll(paginacao)
                .map(usuario -> modelMapper.map(usuario, ListagemUsuariosDto.class));
    }

    public ListagemUsuariosDto ObterPorId(Long id) {
        Usuario usuario = repository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(usuario, ListagemUsuariosDto.class);

    }

    public CadastroUsuariosDto criarUsuario(CadastroUsuariosDto dto) {
        System.out.println(dto);
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        System.out.println(usuario);
        repository.save(usuario);
        return modelMapper.map(usuario, CadastroUsuariosDto.class);


    }

    public CadastroUsuariosDto atualizarUsuario(Long id, CadastroUsuariosDto dto) {
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        usuario.setId(id);
        usuario = repository.save(usuario);
        return modelMapper.map(usuario, CadastroUsuariosDto.class);
    }

    public void excluirUsuario(Long id) {
        repository.deleteById(id);
    }


}
