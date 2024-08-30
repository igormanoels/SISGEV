package com.sisgev.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Estoque 
{
	private List<Produto> produtosList;
	
	public Estoque() {
		this.produtosList = new ArrayList<>();
	}
	
	public void cadastrarProduto(String...strProduto) throws IllegalArgumentException {
		boolean verificar = verificaExistencia(Integer.parseInt(strProduto[0]));
		if(verificar == false) {
			produtosList.add(new Produto(strProduto[0], strProduto[1], strProduto[2], strProduto[3], strProduto[4], strProduto[5]));
		} 
		else throw new IllegalArgumentException("O produto já está cadastrado no sistema.");
	}
	
	public void adcionarProduto(int cod, int quant) throws IllegalArgumentException {
		boolean verificar = verificaExistencia(cod);
		if(verificar == true) {
			for (Produto p : produtosList) {
				if (p.getCodigoBarras() == cod) {
					int quantAtual = p.getQuantidade();
					p.setQuantidade(quantAtual += quant);
				}
			}
		} 
		else throw new IllegalArgumentException("O produto ainda não está cadastrado no sistema.");
	}
	
	public void removerProduto(int cod) throws IllegalArgumentException {
		boolean verificar = verificaExistencia(cod);
		if (verificar == true) {
			for (Produto p : produtosList) if(p.getCodigoBarras() == cod) produtosList.remove(p);
		} 
		else throw new IllegalArgumentException("O código informado não pertence a um produto cadastrado");
	}
	
	public void relatorioEstoque() throws IllegalArgumentException {
		if (produtosList.isEmpty() == false) {
			File arquivo = new File("C:/Program Files/SISGEV/relatorioEstoque.txt");
			try (BufferedWriter escreva = new BufferedWriter( new FileWriter(arquivo))) {
				for (Produto p : produtosList) {
					escreva.write(p.toString());
					escreva.newLine();
				}
			} catch (Exception e) {
				throw new IllegalArgumentException(e);
			}
		} else throw new IllegalArgumentException("A lista de produtos está vazia, não há produtos cadastrados no sistema.");
	}
	
	private boolean verificaExistencia(int cod) {
		for (Produto p : produtosList) 
			if (p.getCodigoBarras() == cod) return true;
		return false;
	}
		
}