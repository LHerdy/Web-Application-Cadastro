package br.sistema.cadastro.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String periodo;
	
	
	@OneToMany(mappedBy = "turno")
	private Set<Aluno> alunos;

	public Turno(String periodo) {
		this.periodo = periodo;
	}
	
	public Turno() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Set<Aluno> getAluno() {
		return alunos;
	}

	public void setAluno(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
}
