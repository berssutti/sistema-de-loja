package control;

import model.*;

public class ControlArmario {

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
