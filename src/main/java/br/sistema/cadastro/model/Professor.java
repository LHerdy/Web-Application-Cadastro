package br.sistema.cadastro.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Professor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	
	@OneToOne(mappedBy="professor", cascade = {CascadeType.ALL})
	private Disciplina disciplina;
	
	//Construtor 
	
	public Professor() {
		
	}
	
	public Professor(String nome) {
		this.setNome(nome);
		this.setDisciplina(disciplina);
	}
	
	//MÉTODOS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
