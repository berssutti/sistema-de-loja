package control;
/**
 * Controla a classe Funcionario
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;

public class ControlFuncionario {
	
	
	private Funcionario[] funcionario;
	private int qtdFuncionarios;
	
	public ControlFuncionario(ControlDados dados) {
		this.funcionario = dados.getFuncionario();
		this.qtdFuncionarios = dados.getQtdFuncionarios();
	}
	
	/**
	 * Armazena os nomes em um vetor de String
	 * @param null
	 * @return s, um vetor de string com os nomes
	 */
	public String[] getNomeFuncionario() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = funcionario[i].getNome();
		}

		return s;
	}	

}
