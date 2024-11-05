package com.sisgev.model.empresa.financeiro;

import java.util.ArrayList;
import java.util.List;

import com.sisgev.model.empresa.logistica.Produto;

public class Vendas {
	
	private Caixa caixa = new Caixa();
	private List<Produto> produtos;
	
	public Vendas() {
		this.produtos = new ArrayList<>();
	}
	
	public void adcionarProduto() {
		
	}
	
	public void removerProduto() {}
	
	public void cancelarCompra() {}
	
	public void finalizarCompra() {
		this.caixa.registrarVenda();
	}
	
	public void imprimirRecibo() {}

}
