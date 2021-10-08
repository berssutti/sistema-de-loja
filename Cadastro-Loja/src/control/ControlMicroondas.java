package control;
/**
 * Controla a classe Microondas
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;

public class ControlMicroondas {

	private Microondas[] microondas;
	private int qtdMicroondas;

	public ControlMicroondas(ControlDados dados) {
		microondas = dados.getMicroondas();
		qtdMicroondas = dados.getQtdMicroondas();

	}
	/**
	 * Armazena os nomes em um vetor de String
	 * @param null
	 * @return s, um vetor de string com os nomes
	 */
	public String[] getNomeMicroondas() {
		String[] s = new String[qtdMicroondas];
		for (int i = 0; i < qtdMicroondas; i++) {
			s[i] = microondas[i].getNome();
		}

		return s;
	}

}
