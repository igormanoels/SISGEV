package com.sisgev.model;

public class Tributos {
	private float icms = 18f;
	private float pis = 0.65f;
	private float cofins = 0.3f;
	
	public float gerarTributacao(float valor) {
		return calcIcms(valor) + calcPis(valor) + calcCofins(valor);
	}
	
	private float calcIcms(float valor) {
		return valor * icms;
	}
	
	private float calcPis(float valor) {
		return valor * pis;
	}
	
	private float calcCofins(float valor) {
		return valor * cofins;
	}
}
