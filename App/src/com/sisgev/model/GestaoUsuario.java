package com.sisgev.model;

import java.util.ArrayList;
import java.util.List;

public class GestaoUsuario {
	private List<Usuario> usuarios;
	
	
	public GestaoUsuario() {
		this.usuarios = new ArrayList<>();
	}
	
	
	public void cadastrarUsuario(String...str) {
		usuarios.add(new Usuario(str));
	}
	
	
	public void removerUsuario(String registro) throws IllegalArgumentException {
		short registroBuscado = Short.parseShort(registro);
		if (!usuarios.isEmpty()) {
			for (Usuario u : usuarios) {
				if (u.getNumRegistro() ==  registroBuscado) {
					usuarios.remove(u);
					return;
				}
			}
			throw new IllegalArgumentException("O registro informado não foi localizado");
		} else throw new IllegalArgumentException("A lista de usuários está vazia");
	}
	
	
	public void atualizarUsuario(String...str) throws IllegalArgumentException{
		short registroBuscado = Short.parseShort(str[0]);
		if (!usuarios.isEmpty()) {
			for (Usuario u : usuarios) {
				if (u.getNumRegistro() ==  registroBuscado) {
					u.setNumRegistro(registroBuscado);
					u.setNome(str[1]);
					u.setSenha(str[2]);
					u.setEmail(str[3]);
					return;
				}
			}	
			throw new IllegalArgumentException("Usuário não localizado");
		} else throw new IllegalArgumentException("A lista de usuários está vazia");	
	}
}
