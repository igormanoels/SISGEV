package com.sisgev.controller;

import java.util.ArrayList;
import java.util.List;

import com.sisgev.model.cliente.Cliente;

public class ClienteController {
	
	List<Cliente> clientes;
	
	public ClienteController() {
		this.clientes = new ArrayList<>();
	}
	
	public String cadastrarCliente(String...str) {
		try {
			this.clientes.add(new Cliente(str));
			return  "Cliente cadastrado com sucesso!";
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
	public String removerCliente(String cpf) {
		try {
			if (!(this.clientes.isEmpty())) {
				for (Cliente c: clientes){
					if (c.getCpf().equalsIgnoreCase(cpf)) 
						clientes.remove(c);
						return "Cliente removido com sucesso!";
				}
				return "Cliente não localizado, verifique o cpf informado.";
			}
			return "Lista vazia: Não foi possível realizar a operação desejada.";
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
	public String atualizarCliente(String...str) {
		try {
			if (!(this.clientes.isEmpty())) {
				Cliente clienteAtualizado = new Cliente(str);
				for (Cliente c: clientes) {
					if (c.getCpf().equalsIgnoreCase(clienteAtualizado.getCpf())) {
						c = clienteAtualizado;
						return "Cliente atualizado com sucesso!";
					}
				}
				return "Cliente não localizado, verifique o cpf informado.";
			}
			return "Lista vazia: Não foi possível realizar a operação desejada.";
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
	public String listarCliente() {
		try {
			if (!(this.clientes.isEmpty())) {
				for (Cliente c : clientes) {
					// Criar uma função que envia para uma tabela na tela cada cliente					
				}
				return "Listagem completa.";
			}
			return "A lista de cliente não possui cadastros.";
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
	public String listarCliente(String cpf) {
		try {
			if (!(this.clientes.isEmpty())) {
				for (Cliente c : clientes) {
					if (c.getCpf().equalsIgnoreCase(cpf)) {
						return c.toString();
						// Criar uma função que preenche os dados na tela
					}
				}
				return "Cliente não localizado, verifique o cpf informado";
			}
			return "Lista vazia: Não foi possível realizar a operação desejada";
		} catch (Exception e) {
			return "Erro: " + e;
		}
	}
	
}
