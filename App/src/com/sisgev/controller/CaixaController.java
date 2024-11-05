package com.sisgev.controller;

import com.sisgev.model.empresa.financeiro.Caixa;

public class CaixaController {
	
	Caixa caixa = new Caixa();
	
	public String sacarDoCaixa(String valor) {
		try {
			return caixa.sacarDoCaixa(valor);			
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
	public String depositarNoCaixa(String valor) {
		try {
			return caixa.depositarNoCaixa(valor);
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}

	public String relatorioCaixa() {
		try {
			return caixa.relatorioCaixa();
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
	public void registrarVenda() {
		caixa.registrarVenda();
	}
	
}
