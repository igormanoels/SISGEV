package com.sisgev.model.empresa;

public class Usuario {
	
	private short numRegistro;
	private String nome;
	private String senha;
	private String email;
	
	public Usuario(String...str) {
		this.numRegistro = Short.parseShort(str[0]);
		this.nome = str[1];
		this.senha = str[2];
		this.email = str[3];
	}

	public short getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(short numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome +"\nEmail: " + this.email;
	}
	
}
