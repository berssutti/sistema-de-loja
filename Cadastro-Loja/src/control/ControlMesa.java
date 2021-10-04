package control;

import model.*;

public class ControlMesa {

	private Mesa[] mesa;
	private int qtdMesas;

	public ControlMesa(ControlDados dados) {
		mesa = dados.getMesa();
		qtdMesas = dados.getQtdMesa();

	}

	// Armazena os nomes em um vetor de string
	public String[] getNomeMesa() {
		String[] s = new String[qtdMesas];
		for (int i = 0; i < qtdMesas; i++) {
			s[i] = mesa[i].getNome();
		}

		return s;
	}
	
}
