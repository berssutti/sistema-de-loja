package control;

import model.*;

public class ControlCliente {

	private Cliente[] cliente;
	private int qtdClientes;

	public ControlCliente(ControlDados dados) {
		cliente = dados.getCliente();
		qtdClientes = dados.getQtdCliente();

	}
	
	// Armazena os nomes em um vetor de string
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = cliente[i].getNome();
		}

		return s;
	}

}
