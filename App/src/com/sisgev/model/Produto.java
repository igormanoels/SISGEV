package com.sisgev.model;

public class Produto 
{
	private int codigoBarras;
	private String nome;
	private String marca;
	private float preco;
	private String validade;
	
	// Construtores da classe
	public Produto() {}
	
	public Produto(String...strProduto) {
		this.codigoBarras = Integer.parseInt(strProduto[0]);
		this.nome = strProduto[1];
		this.marca = strProduto[2];
		this.preco= Float.parseFloat(strProduto[3]);
		this.validade = strProduto[4];
	}

	
	// Getters and Setters
	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float precoUnitario) {
		this.preco= precoUnitario;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	// To String
	@Override
	public String toString() {
		return "Produto: " + nome + ", Marca: " + marca + ", Preço: " + preco;
	}
	
}
