package model;

import java.util.ArrayList;

public class Funcionario {
	private int cracha;
	private ArrayList<Pessoa>Funcionario;
	private Double salario;
	private int feriasMensais;
	private Pessoa pessoa;
	
	public Funcionario() {
		
	}

	public Funcionario(int cracha, ArrayList<Pessoa> funcionario, Double salario, int feriasMensais, Pessoa pessoa) {
		super();
		this.cracha = cracha;
		Funcionario = funcionario;
		this.salario = salario;
		this.feriasMensais = feriasMensais;
		this.pessoa = pessoa;
	}

	public int getCracha() {
		return cracha;
	}

	public void setCracha(int cracha) {
		this.cracha = cracha;
	}

	public ArrayList<Pessoa> getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(ArrayList<Pessoa> funcionario) {
		Funcionario = funcionario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getFeriasMensais() {
		return feriasMensais;
	}

	public void setFeriasMensais(int feriasMensais) {
		this.feriasMensais = feriasMensais;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Funcionario [cracha=" + cracha + ", Funcionario=" + Funcionario + ", salario=" + salario
				+ ", feriasMensais=" + feriasMensais + ", pessoa=" + pessoa + "]";
	}

}