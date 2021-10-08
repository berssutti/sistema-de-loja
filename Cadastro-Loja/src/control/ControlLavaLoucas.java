package control;
/**
 * Controla a classe Lava_Loucas
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;

public class ControlLavaLoucas {

	private Lava_Loucas[] lavaLoucas;
	private int qtdLavaLoucass;


	public ControlLavaLoucas(ControlDados dados) {
		lavaLoucas = dados.getlavaLoucas();
		qtdLavaLoucass = dados.getQtdlavaLoucas();

	}
	/**
	 * Armazena os nomes em um vetor de String
	 * @param null
	 * @return s, um vetor de string com os nomes
	 */
	public String[] getNomeLavaLoucas() {
		String[] s = new String[qtdLavaLoucass];
		for (int i = 0; i < qtdLavaLoucass; i++) {
			s[i] = lavaLoucas[i].getNome();
		}

		return s;
	}

}
