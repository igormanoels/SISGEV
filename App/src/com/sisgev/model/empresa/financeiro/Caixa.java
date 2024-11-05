package com.sisgev.model.empresa.financeiro;

public class Caixa {
	
	private double saldoCaixa = 0.0d;
	private int numeroVendas = 0;
	
	public void sacarDoCaixa(String valor) {
		this.saldoCaixa = this.saldoCaixa - (Integer.parseInt(valor));
	}
	
	public void depositarNoCaixa(String valor) {
		this.saldoCaixa = this.saldoCaixa + (Integer.parseInt(valor));
	} 
	
	public String relatorioCaixa() {
		return "Saldo em caixa: R$ " + this.saldoCaixa + "\nNúmero de Vendas: " + this.numeroVendas;
	}
	
	public void registrarVenda() {
		this.numeroVendas += 1;
	}

}
