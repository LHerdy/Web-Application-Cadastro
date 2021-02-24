package br.sistema.cadastro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sistema.cadastro.model.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
