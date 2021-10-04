package control;

import model.*;

public class ControlMicroondas {

	
	private Microondas[] microondas;
	private int qtdMicroondas;

	public ControlMicroondas(ControlDados dados) {
		microondas = dados.getMicroondas();
		qtdMicroondas = dados.getQtdMicroondas();

	}

	// Armazena os nomes em um vetor de string
	public String[] getNomeMicroondas() {
		String[] s = new String[qtdMicroondas];
		for (int i = 0; i < qtdMicroondas; i++) {
			s[i] = microondas[i].getNome();
		}

		return s;
	}

}
