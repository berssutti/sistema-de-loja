package control;

import model.*;

public class ControlFuncionario {
	
	
	private Funcionario[] funcionario;
	private int qtdFuncionarios;
	
	public ControlFuncionario(ControlDados dados) {
		this.funcionario = dados.getFuncionario();
		this.qtdFuncionarios = dados.getQtdFuncionarios();
	}
	
	// Armazena os nomes em um vetor de string
	public String[] getNomeFuncionario() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = funcionario[i].getNome();
		}

		return s;
	}	

}
