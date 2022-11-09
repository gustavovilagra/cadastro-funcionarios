package model;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date aniversario;
	private int idade;
	private String cargo;
	
	
	public Pessoa() {
		
	}


	public Pessoa(String nome, Date aniversario, int idade, String cargo) {
		super();
		this.nome = nome;
		this.aniversario = aniversario;
		this.idade = idade;
		this.cargo = cargo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getAniversario() {
		return aniversario;
	}


	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", aniversario=" + aniversario + ", idade=" + idade + ", cargo=" + cargo + "]";
	}
	
}
