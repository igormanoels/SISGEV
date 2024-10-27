package com.sisgev.model;

import java.time.LocalDate;

public class Fornecedor extends Empresa {
	
	private LocalDate ultimaCompra;
	private int numeroCompras;
	
	public Fornecedor() {}

	public LocalDate getUltimaCompra() {
		return ultimaCompra;
	}

	public void setUltimaCompra(LocalDate ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}

	public int getNumeroCompras() {
		return numeroCompras;
	}

	public void setNumeroCompras(int numeroCompras) {
		this.numeroCompras = numeroCompras;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
