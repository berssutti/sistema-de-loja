package control;

import model.*;

public class ControlFuncionario {
	
	//private Dados dados = new Dados();
	
	private Funcionario[] funcionario;
	private int qtdFuncionarios;
	
	/*
	 * public ControlFuncionario() { dados.addDados(); }
	 */
	public ControlFuncionario(ControlDados dados) {
		this.funcionario = dados.getFuncionario();
		this.qtdFuncionarios = dados.getQtdFuncionarios();
	}

	public String[] getNomeFuncionario() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = funcionario[i].getNome();
		}

		return s;
	}

	/*
	 * public boolean inserirEditarFuncionario(String[] dadosFuncionario) {
	 * if(!dadosFuncionario[2].matches("[0-9]+") ||
	 * !dadosFuncionario[3].matches("[0-9]+") ||
	 * !dadosFuncionario[6].matches("[0-9]+")) { return false; } else {
	 * //Funcionario p = new Funcionario(dadosFuncionario[1],
	 * Double.parseDouble(dadosFuncionario[2]), //
	 * Integer.parseInt(dadosFuncionario[3]), Integer.parseInt(dadosFuncionario[4]),
	 * // new Telefone(Integer.parseInt(dadosFuncionario[5]),
	 * Integer.parseInt(dadosFuncionario[6]))); //dados.inserirEditaFuncionario(p,
	 * Integer.parseInt(dadosFuncionario[0])); return true; } }
	 * 
	 * public boolean removerFuncionario(int i) { String funcionarioRemovido =
	 * dados.getFuncionario()[i].getNome(); String aux;
	 * 
	 * if(i == (dados.getQtdAFuncionarios() - 1)) { // O funcionari a ser removido
	 * está no final do array dados.setQtdAFuncionarios(dados.getQtdAFuncionarios()
	 * - 1); dados.getFuncionario()[dados.getQtdAFuncionarios()] = null; return
	 * true; } else { // o prof a ser removido está no meio do array int cont = 0;
	 * while(dados.getFuncionario()[cont].getNome().compareTo(funcionarioRemovido)
	 * != 0) cont++; //Rotina swap for(int j = cont; j < dados.getQtdAFuncionarios()
	 * - 1; j++) { dados.getFuncionario()[j] = null; dados.getFuncionario()[j] =
	 * dados.getFuncionario()[j+1]; }
	 * dados.getFuncionario()[dados.getQtdAFuncionarios()] = null;
	 * dados.setQtdAFuncionarios(dados.getQtdAFuncionarios() - 1); return true;
	 * 
	 * } }
	 */
	public int getQtd() {
		return qtdFuncionarios;
	}

	public void setQtd(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public String getNome(int i) {		
		return funcionario[i].getNome();
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(funcionario[i].getCpf());
		return numCPF;
	}

	public String getRG(int i) {
		String numRG = String.valueOf(funcionario[i].getRg());
		return numRG;
	}

	public Telefone getNumTel(int i) {
		return funcionario[i].getNumero();
	}

	public void setQtdFuncionario(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public double getSalario (int i) {
		return funcionario[i].getSalario();
	}
	
	/*
	 * public Dados getDados() { return dados; }
	 * 
	 * public void setDados(Dados dados) { this.dados = dados; }
	 * 
	 * public int getQtdFuncionarios() { return this.dados.getQtdAFuncionarios(); }
	 * 
	 * public Funcionario[] getFuncionario() { return this.dados.getFuncionario(); }
	 */

}
