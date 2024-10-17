package com.sisgev.model;

public class Endereco {
	
	private String rua;
	private short numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String complemento;

	public Endereco(String...str) {
		this.rua = str[0];
		this.numero = Short.parseShort(str[1]);
		this.cep = str[2];
		this.bairro = str[3];
		this.cidade = str[4];
		this.estado = str[5];
		this.complemento = str[6];
	}
	
	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public short getNumero() {
		return this.numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		return "RUA: " + this.rua + ", Nº " + this.numero 
				+ "\nCEP: " + this.cep + " - BAIRRO: " + this.bairro
				+ "\nCOMPLEMENTO: " + this.complemento
				+ "\nCIDADE: " + this.cidade + " - ESTADO: " + this.estado;
	}
	
}
