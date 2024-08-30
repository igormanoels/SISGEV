package com.sisgev.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque 
{
	private List<Produto> produtosList;
	private int quantidade;
	
	public Estoque() {
		this.produtosList = new ArrayList<>();
	}
	
	public void cadastrarProduto(String...strProduto) throws IllegalArgumentException {
		boolean verificar = verificaExistencia(Integer.parseInt(strProduto[0]));
		if(verificar == false) {
			produtosList.add(new Produto(strProduto[0], strProduto[1], strProduto[2], strProduto[3], strProduto[4]));
			this.quantidade = Integer.parseInt(strProduto[5]);
		} else {
			throw new IllegalArgumentException("O produto já está cadastrado no sistema.");
		}
	}
	
	public void adcionarProduto() {
		
	}
	
	public void removerProduto() {
		
	}
	
	public void relatorioEstoque() {
		
	}
	
	private boolean verificaExistencia(int cod) {
		for (Produto p : produtosList) {
			if (p.getCodigoBarras() == cod) return true;
		}
		return false;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}