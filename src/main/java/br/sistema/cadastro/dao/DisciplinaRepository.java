package br.sistema.cadastro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sistema.cadastro.model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer>{

}
