package control;

import model.*;

public class ControlArmario {

	private Armario[] armario;
	private int qtdArmarios;

	public ControlArmario(ControlDados dados) {
		armario = dados.getArmario();
		qtdArmarios = dados.getQtdArmario();

	}
	
	// Armazena os nomes em um vetor de string
	public String[] getNomeArmario() {
		String[] s = new String[qtdArmarios];
		for (int i = 0; i < qtdArmarios; i++) {
			s[i] = armario[i].getNome();
		}

		return s;
	}

}
