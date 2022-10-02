package br.com.fuctura.projetoescola.entidade;

public abstract class Pessoa {
	
	//Attributes: 
	protected String nome;
	protected String cpf;
	protected Endereco endereco;

	
	//Constructor: 
	
	public Pessoa(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	//Getters and Setters:
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	//Methods:
	public abstract void imprimir();

}
