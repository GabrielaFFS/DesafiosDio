package servidor.impl; 
    
    import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import me.dio.service.exception.BusinessException;
import me.dio.service.exception.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.Optional.ofNullable;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    
    import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import static java.util.Optional.ofNullable;

@Service
public class UsuarioServiceImpl {

    private static final Long ID_USUARIO_IMUTAVEL = 1L;

    private final RepositorioUsuario repositorioUsuario;

    public UsuarioServiceImpl(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Transactional(readOnly = true)
    public List<Usuario> encontrarTodos() {
        return this.repositorioUsuario.findAll();
    }

    @Transactional(readOnly = true)
    public Usuario encontrarPorId(Long id) {
        return this.repositorioUsuario.findById(id).orElseThrow(NaoEncontradoException::new);
    }

    @Transactional
    public Usuario criar(Usuario usuarioParaCriar) {
        ofNullable(usuarioParaCriar).orElseThrow(() -> new ExcecaoNegocio("O usuário para criar não deve ser nulo."));
        ofNullable(usuarioParaCriar.getConta()).orElseThrow(() -> new ExcecaoNegocio("A conta do usuário não deve ser nula."));
        ofNullable(usuarioParaCriar.getCartao()).orElseThrow(() -> new ExcecaoNegocio("O cartão do usuário não deve ser nulo."));

        this.validarIdMutavel(usuarioParaCriar.getId(), "criado");
        if (repositorioUsuario.existsByNumeroConta(usuarioParaCriar.getConta().getNumero())) {
            throw new ExcecaoNegocio("Este número de conta já existe.");
        }
        if (repositorioUsuario.existsByNumeroCartao(usuarioParaCriar.getCartao().getNumero())) {
            throw new ExcecaoNegocio("Este número de cartão já existe.");
        }
        return this.repositorioUsuario.save(usuarioParaCriar);
    }

    @Transactional
    public Usuario atualizar(Long id, Usuario usuarioParaAtualizar) {
        this.validarIdMutavel(id, "atualizado");
        Usuario usuarioDb = this.encontrarPorId(id);
        if (!usuarioDb.getId().equals(usuarioParaAtualizar.getId())) {
            throw new ExcecaoNegocio("Os IDs de atualização devem ser iguais.");
        }

        usuarioDb.setNome(usuarioParaAtualizar.getNome());
        usuarioDb.setConta(usuarioParaAtualizar.getConta());
        usuarioDb.setCartao(usuarioParaAtualizar.getCartao());
        usuarioDb.setElementos(usuarioParaAtualizar.getElementos());
        usuarioDb.setNovidades(usuarioParaAtualizar.getNovidades());

        return this.repositorioUsuario.save(usuarioDb);
    }

    @Transactional
    public void deletar(Long id) {
        this.validarIdMutavel(id, "deletado");
        Usuario usuarioDb = this.encontrarPorId(id);
        this.repositorioUsuario.delete(usuarioDb);
    }

    private void validarIdMutavel(Long id, String operacao) {
        if (ID_USUARIO_IMUTAVEL.equals(id)) {
            throw new ExcecaoNegocio("Usuário com ID %d não pode ser %s.".formatted(ID_USUARIO_IMUTAVEL, operacao));
        }
    }
}
