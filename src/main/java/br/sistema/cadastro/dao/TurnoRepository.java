package br.sistema.cadastro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sistema.cadastro.model.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer>{
    
}
