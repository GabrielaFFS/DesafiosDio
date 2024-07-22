package dominio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dominio.modelo.Usuario;

@Repository
public interface repositorio extends JpaRepository<Usuario, Long> {
    
    boolean existsByNumeroConta(String numero);

    boolean existsByNumeroCartao(String numero);
}