package API.Usuario.startupone.service;

import API.Usuario.startupone.dto.CadastroUsuariosDto;
import API.Usuario.startupone.dto.ListagemUsuariosDto;
import API.Usuario.startupone.usuario.Usuario;
import API.Usuario.startupone.usuario.UsuarioRepository;
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

    public CadastroUsuariosDto criarUsuario(ListagemUsuariosDto dto) {
        Usuario usuario = modelMapper.map(dto, Usuario.class);
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
