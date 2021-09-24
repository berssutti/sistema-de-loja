package control;

import model.*;

public class ControlMesa {

	//private Dados dados = new Dados();
	private Mesa[] mesa;
	private int qtdMesas;

	/*
	 * public ControlMesa() { dados.addDados(); }
	 */
	public ControlMesa(ControlDados dados) {
		mesa = dados.getMesa();
		qtdMesas = dados.getQtdMesa();

	}

	public String[] getNomeMesa() {
		String[] s = new String[qtdMesas];
		for (int i = 0; i < qtdMesas; i++) {
			s[i] = mesa[i].getNome();
		}

		return s;
	}

	/*
	 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	 * public boolean inserirEditarMesa(String[] dadosMesa) {
	 * if(!dadosMesa[2].matches("[0-9]+") || !dadosMesa[3].matches("[0-9]+")
	 * || !dadosMesa[4].matches("[0-9]+")) { return false; } else {
	 * 
	 * Aluno a = new Aluno(dadosMesa[1], dadosMesa[2],
	 * Integer.parseInt(dadosMesa[3]), Integer.parseInt(dadosMesa[4]), new
	 * Telefone(Integer.parseInt(dadosMesa[5]),
	 * Integer.parseInt(dadosMesa[6]))); d.inserirEditarAluno(a,
	 * Integer.parseInt(dadosMesa[0]));
	 * 
	 * return true; } }
	 * 
	 * public boolean removerMesa(int i) { String MesaRemovido =
	 * dados.getMesa()[i].getNome(); String aux;
	 * 
	 * if(i == (dados.getQtdMesas() - 1)) { // O aluno a ser removido está no
	 * final do array dados.setQtdMesas(dados.getQtdMesas() - 1);
	 * dados.getMesa()[dados.getQtdMesas()] = null; return true; } else { // o
	 * aluno a ser removido está no meio do array int cont = 0;
	 * while(dados.getMesa()[cont].getNome().compareTo(MesaRemovido) != 0) {
	 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdMesas() - 1;
	 * j++) { dados.getMesa()[j] = null; dados.getMesa()[j] =
	 * dados.getMesa()[j+1]; } dados.getMesa()[dados.getQtdMesas()] = null;
	 * dados.setQtdMesas(dados.getQtdMesas() - 1); return true; } }
	 */
	public int getQtd() {
		return qtdMesas;
	}

	public void setQtd(int qtdMesas) {
		this.qtdMesas = qtdMesas;
	}

	public String getNome(int i) {
		return mesa[i].getNome();
	}

	public void setQtdMesas(int qtdMesas) {
		this.qtdMesas = qtdMesas;
	}

	/*
	 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
	 * this.dados = dados; }
	 * 
	 * public Mesa[] getMesa() { return this.dados.getMesa(); }
	 * 
	 * public int getQtdMesa() { return this.dados.getQtdMesas(); }
	 */
}
