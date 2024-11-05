package com.sisgev.model.empresa.financeiro;

public class Pagamento {
	
	private int formaPagamento;
	private float totalPagamento;
	private float totalTributos;
	
	Tributos tributos = new Tributos();
	
	public Pagamento () {
		this.formaPagamento = 0;
		this.totalPagamento = 0.0f;
		this.totalTributos = 0.0f;
	}
	
	public void gerarPagamento(String...str) {
		this.totalPagamento = Float.parseFloat(str[0]);
		this.formaPagamento = Integer.parseInt(str[1]);
		gerarTributacao();
	}
	
	private void gerarTributacao() {
		this.totalTributos = tributos.calcularTributacao(this.totalPagamento);
	}
	
	

}
