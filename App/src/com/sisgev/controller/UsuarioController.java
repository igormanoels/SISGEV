package com.sisgev.controller;

import java.util.ArrayList;
import java.util.List;

import com.sisgev.model.empresa.Usuario;

public class UsuarioController {

    private List<Usuario> usuarios;

    
    public UsuarioController() {
    	this.usuarios = new ArrayList<>();
	}
    
    // Cadastra o usuário e retorna pra view,criar um alert
    public String cadastrarUsuario(String...str) {
    	try {
        	this.usuarios.add(new Usuario(str));
        	return "Usuário cadastrado com sucesso!";
		} catch (Exception e) {
			return "Erro: " + e;
		}
    }

    // Remove o usuário e retorna pra view, criar um alert
    public String removerUsuario(String registro){
    	try {
    		short reg = Short.parseShort(registro);
        	if (!(this.usuarios.isEmpty())) {
    			for (Usuario u : usuarios) {
    				if (u.getNumRegistro() == reg) usuarios.remove(u);
    				return "Usuário removido com sucesso";
    			}
    			return "Usuário não encontrado.";
    		} else {
    			return "A lista de usuários está vazia.";
    		}
		} catch (Exception e) {
			return "Erro: " + e;
		}
    }

    // Atualiza o usuário e retorna pra view, criar um alert
    public String atualizarUsuario(String...str){
    	Usuario attUsuario = new Usuario(str);
    	try {
			if (!(this.usuarios.isEmpty())) {
				for (Usuario u : usuarios) {
					if (u.getNumRegistro() == attUsuario.getNumRegistro()) {
						u = attUsuario;
						return "Usuário atualizado com sucesso!";
					}
				}
				return "Usuário não localizado.";
			} else {
				return "A lista de usuários está vazia.";
			}
		} catch (Exception e) {
			return "Erro: " + e;
		}
    }

    // Retorna o toString do objeto localizado a partir do registro, retornar na tela
    public String procurarUsuario(String registro){
    	try {
			short reg = Short.parseShort(registro);
			if (!(this.usuarios.isEmpty())) {
				for (Usuario u : usuarios) {
					if (u.getNumRegistro() == reg) {
						return u.toString();
					}
				}
				return "Usuário não localizado.";
			} else {
				return "A lista de usuário está vazia.";
			}
		} catch (Exception e) {
			return "Erro: " + e;
		}
    }
}
