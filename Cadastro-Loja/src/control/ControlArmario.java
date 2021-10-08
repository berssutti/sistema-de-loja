package control;

/**
 * Controla a classe Armario
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */

import model.*;

public class ControlArmario {

	private Armario[] armario;
	private int qtdArmarios;
	

	public ControlArmario(ControlDados dados) {
		armario = dados.getArmario();
		qtdArmarios = dados.getQtdArmario();

	}
	
	/**
	 * Armazena os nomes em um vetor de String
	 * @return String, um vetor de string com os nomes
	 */
	public String[] getNomeArmario() {
		String[] s = new String[qtdArmarios];
		for (int i = 0; i < qtdArmarios; i++) {
			s[i] = armario[i].getNome();
		}

		return s;
	}

}
