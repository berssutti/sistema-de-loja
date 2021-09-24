package control;

import model.*;

public class ControlArmario {

	//private Dados dados = new Dados();
	private Armario[] armario;
	private int qtdArmarios;

	/*
	 * public ControlArmario() { dados.addDados(); }
	 */
	public ControlArmario(ControlDados dados) {
		armario = dados.getArmario();
		qtdArmarios = dados.getQtdArmario();

	}

	public String[] getNomeArmario() {
		String[] s = new String[qtdArmarios];
		for (int i = 0; i < qtdArmarios; i++) {
			s[i] = armario[i].getNome();
		}

		return s;
	}

	/*
	 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	 * public boolean inserirEditarArmario(String[] dadosArmario) {
	 * if(!dadosArmario[2].matches("[0-9]+") || !dadosArmario[3].matches("[0-9]+")
	 * || !dadosArmario[4].matches("[0-9]+")) { return false; } else {
	 * 
	 * Aluno a = new Aluno(dadosArmario[1], dadosArmario[2],
	 * Integer.parseInt(dadosArmario[3]), Integer.parseInt(dadosArmario[4]), new
	 * Telefone(Integer.parseInt(dadosArmario[5]),
	 * Integer.parseInt(dadosArmario[6]))); d.inserirEditarAluno(a,
	 * Integer.parseInt(dadosArmario[0]));
	 * 
	 * return true; } }
	 * 
	 * public boolean removerArmario(int i) { String ArmarioRemovido =
	 * dados.getArmario()[i].getNome(); String aux;
	 * 
	 * if(i == (dados.getQtdArmarios() - 1)) { // O aluno a ser removido está no
	 * final do array dados.setQtdArmarios(dados.getQtdArmarios() - 1);
	 * dados.getArmario()[dados.getQtdArmarios()] = null; return true; } else { // o
	 * aluno a ser removido está no meio do array int cont = 0;
	 * while(dados.getArmario()[cont].getNome().compareTo(ArmarioRemovido) != 0) {
	 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdArmarios() - 1;
	 * j++) { dados.getArmario()[j] = null; dados.getArmario()[j] =
	 * dados.getArmario()[j+1]; } dados.getArmario()[dados.getQtdArmarios()] = null;
	 * dados.setQtdArmarios(dados.getQtdArmarios() - 1); return true; } }
	 */
	public int getQtd() {
		return qtdArmarios;
	}

	public void setQtd(int qtdArmarios) {
		this.qtdArmarios = qtdArmarios;
	}

	public String getNome(int i) {
		return armario[i].getNome();
	}


	public void setQtdArmarios(int qtdArmarios) {
		this.qtdArmarios = qtdArmarios;
	}

	/*
	 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
	 * this.dados = dados; }
	 * 
	 * public Armario[] getArmario() { return this.dados.getArmario(); }
	 * 
	 * public int getQtdArmario() { return this.dados.getQtdArmarios(); }
	 */

}
