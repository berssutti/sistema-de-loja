package control;
/**
 * Controla a classe Mesa
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;

public class ControlMesa {

	private Mesa[] mesa;
	private int qtdMesas;

	public ControlMesa(ControlDados dados) {
		mesa = dados.getMesa();
		qtdMesas = dados.getQtdMesa();

	}
	/**
	 * Armazena os nomes em um vetor de String
	 * @param null
	 * @return s, um vetor de string com os nomes
	 */
	public String[] getNomeMesa() {
		String[] s = new String[qtdMesas];
		for (int i = 0; i < qtdMesas; i++) {
			s[i] = mesa[i].getNome();
		}

		return s;
	}
	
}
