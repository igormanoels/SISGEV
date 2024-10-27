package com.sisgev.model;

public class Empresa {
	
	private String nome;
    private String cnpj;
    private String telefone;
    private Endereco endereco;
    
    public Empresa() {}
    
    public String getNome() {
		return nome;
	}
    
    public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() { 
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
    @Override
    public String toString() {
    	return "CNPJ:" + this.cnpj + "\n" + this.nome + " - Telefone: " + this.telefone;
    }

}
