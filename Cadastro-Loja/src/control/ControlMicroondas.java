package control;

import model.*;

public class ControlMicroondas {

	//private Dados dados = new Dados();
	private Microondas[] microondas;
	private int qtdMicroondas;

	/*
	 * public ControlMicroondas() { dados.addDados(); }
	 */
	public ControlMicroondas(ControlDados dados) {
		microondas = dados.getMicroondas();
		qtdMicroondas = dados.getQtdMicroondas();

	}

	public String[] getNomeMicroondas() {
		String[] s = new String[qtdMicroondas];
		for (int i = 0; i < qtdMicroondas; i++) {
			s[i] = microondas[i].getNome();
		}

		return s;
	}

	/*
	 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	 * public boolean inserirEditarMicroondas(String[] dadosMicroondas) {
	 * if(!dadosMicroondas[2].matches("[0-9]+") || !dadosMicroondas[3].matches("[0-9]+")
	 * || !dadosMicroondas[4].matches("[0-9]+")) { return false; } else {
	 * 
	 * Aluno a = new Aluno(dadosMicroondas[1], dadosMicroondas[2],
	 * Integer.parseInt(dadosMicroondas[3]), Integer.parseInt(dadosMicroondas[4]), new
	 * Telefone(Integer.parseInt(dadosMicroondas[5]),
	 * Integer.parseInt(dadosMicroondas[6]))); d.inserirEditarAluno(a,
	 * Integer.parseInt(dadosMicroondas[0]));
	 * 
	 * return true; } }
	 * 
	 * public boolean removerMicroondas(int i) { String MicroondasRemovido =
	 * dados.getMicroondas()[i].getNome(); String aux;
	 * 
	 * if(i == (dados.getQtdMicroondass() - 1)) { // O aluno a ser removido está no
	 * final do array dados.setQtdMicroondass(dados.getQtdMicroondass() - 1);
	 * dados.getMicroondas()[dados.getQtdMicroondass()] = null; return true; } else { // o
	 * aluno a ser removido está no meio do array int cont = 0;
	 * while(dados.getMicroondas()[cont].getNome().compareTo(MicroondasRemovido) != 0) {
	 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdMicroondass() - 1;
	 * j++) { dados.getMicroondas()[j] = null; dados.getMicroondas()[j] =
	 * dados.getMicroondas()[j+1]; } dados.getMicroondas()[dados.getQtdMicroondass()] = null;
	 * dados.setQtdMicroondass(dados.getQtdMicroondass() - 1); return true; } }
	 */
	public int getQtd() {
		return qtdMicroondas;
	}

	public void setQtd(int qtdMicroondass) {
		this.qtdMicroondas = qtdMicroondass;
	}

	public String getNome(int i) {
		return microondas[i].getNome();
	}

	public void setQtdMicroondass(int qtdMicroondass) {
		this.qtdMicroondas = qtdMicroondass;
	}

	/*
	 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
	 * this.dados = dados; }
	 * 
	 * public Microondas[] getMicroondas() { return this.dados.getMicroondas(); }
	 * 
	 * public int getQtdMicroondas() { return this.dados.getQtdMicroondass(); }
	 */
}
