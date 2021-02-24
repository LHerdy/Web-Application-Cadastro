package br.sistema.cadastro.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Aluno {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String serie; 
	private int faltas;

	
	@ManyToOne(cascade = {CascadeType.ALL})	
	private Turma turma;

	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Turno turno;
	
	public Aluno() {
	}
	
	public Aluno(int id, String nome, String serie, int faltas, Turma turma, Turno turno) {
		this.id = id;
		this.nome = nome;
		this.serie = serie;
		this.faltas = faltas;
		this.turma = turma;
		this.turno = turno;
	}
	
	
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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Turma getTurma() {
		return turma;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public Turno getTurno() {
		return turno;
	}
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", serie=" + serie + ", faltas=" + faltas + ", turma=" + turma
				+ ", periodo=" + turno + "]";
	}
}
