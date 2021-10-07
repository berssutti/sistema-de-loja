package control;
/**
 * Controla a classe Cadeira
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;

public class ControlCadeira {
	
	private Cadeira[] cadeira;
	private int qtdCadeiras;

	public ControlCadeira(ControlDados dados) {
		cadeira = dados.getCadeira();
		qtdCadeiras = dados.getQtdCadeira();

	}
	
	/**
	 * Armazena os nomes em um vetor de String
	 * @param null
	 * @return s, um vetor de string com os nomes
	 */
	public String[] getNomeCadeira() {
		String[] s = new String[qtdCadeiras];
		for (int i = 0; i < qtdCadeiras; i++) {
			s[i] = cadeira[i].getNome();
		}

		return s;
	}

}
