package com.sisgev.model.empresa.financeiro;

public class Caixa {
	
	private double saldoCaixa = 0.0d;
	private int numeroVendas = 0;
	
	public String sacarDoCaixa(String valor) {
		if (Double.parseDouble(valor) <= this.saldoCaixa) {
			this.saldoCaixa = this.saldoCaixa - (Double.parseDouble(valor));
			return "Saque efetuado!";
		} else {
			return "O saldo é inferior ao solicitado.";
		}
	}
	
	public String depositarNoCaixa(String valor) {
		this.saldoCaixa = this.saldoCaixa + (Integer.parseInt(valor));
		return "Saque efetuado!";
	} 
	
	public String relatorioCaixa() {
		return "Saldo em caixa: R$ " + this.saldoCaixa + "\nNúmero de Vendas: " + this.numeroVendas;
	}
	
	public void registrarVenda() {
		this.numeroVendas += 1;
	}

}
