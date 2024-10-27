package com.sisgev.model;

public class Cliente 
{
	private String cpf;
	private String nome;
	private Endereco endereco;
	
	// Construtores da classe
	public Cliente(String...str) {
		this.cpf = str[0];
		this.nome = str[1];
		this.endereco = new Endereco(str[2],str[3],str[4],str[5],str[6],str[7],str[8]);
	}
	
	// Getters and Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "\nNOME: " + this.nome + " - CPF: " + this.cpf 
				+ "\n" + endereco.toString();
	}

}
