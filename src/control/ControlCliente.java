package control;
/**
 * Controla a classe Cliente
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
import model.*;

public class ControlCliente {

	private Cliente[] cliente;
	private int qtdClientes;

	public ControlCliente(ControlDados dados) {
		cliente = dados.getCliente();
		qtdClientes = dados.getQtdCliente();

	}
	
	/**
	 * Armazena os nomes em um vetor de String
	 * @return String, um vetor de string com os nomes
	 */
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = cliente[i].getNome();
		}

		return s;
	}

}
