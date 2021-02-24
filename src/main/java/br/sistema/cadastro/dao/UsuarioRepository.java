package br.sistema.cadastro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.sistema.cadastro.model.Usuario;

@Component
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
