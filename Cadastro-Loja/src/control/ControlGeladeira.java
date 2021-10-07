package control;
/**
 * Controla a classe Geladeira
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;


public class ControlGeladeira {
	
	private Geladeira[] geladeira;
	private int qtdGeladeiras;
	
	public ControlGeladeira(ControlDados dados) {
		geladeira = dados.getGeladeira();
		qtdGeladeiras = dados.getQtdGeladeira();
	
	}
	
	/**
	 * Armazena os nomes em um vetor de String
	 * @param null
	 * @return s, um vetor de string com os nomes
	 */
	public String[] getNomeGeladeira() {
		String[] s = new String[qtdGeladeiras];
		for (int i = 0; i < qtdGeladeiras; i++) {
			s[i] = geladeira[i].getNome();
		}
	
		return s;
	}

}
