package br.sistema.cadastro.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turma {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String nome;
	
	
	@OneToMany(mappedBy = "turma")
	private Set<Aluno> alunos;

	// Construtor

	public Turma(String nome) {
		this.setNome(nome);
	}
	
	public Turma() {
		
	}

	// Métodos
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Aluno> getAluno() {
		return alunos;
	}

	public void setAluno(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
}
