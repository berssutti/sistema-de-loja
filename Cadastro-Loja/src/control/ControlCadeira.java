package control;

import model.*;


public class ControlCadeira {
	
	//private Dados dados = new Dados();
		private Cadeira[] cadeira;
		private int qtdCadeiras;

		/*
		 * public ControlCadeira() { dados.addDados(); }
		 */
		public ControlCadeira(ControlDados dados) {
			cadeira = dados.getCadeira();
			qtdCadeiras = dados.getQtdCadeira();

		}

		public String[] getNomeCadeira() {
			String[] s = new String[qtdCadeiras];
			for (int i = 0; i < qtdCadeiras; i++) {
				s[i] = cadeira[i].getNome();
			}

			return s;
		}

		/*
		 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
		 * public boolean inserirEditarCadeira(String[] dadosCadeira) {
		 * if(!dadosCadeira[2].matches("[0-9]+") || !dadosCadeira[3].matches("[0-9]+")
		 * || !dadosCadeira[4].matches("[0-9]+")) { return false; } else {
		 * 
		 * Aluno a = new Aluno(dadosCadeira[1], dadosCadeira[2],
		 * Integer.parseInt(dadosCadeira[3]), Integer.parseInt(dadosCadeira[4]), new
		 * Telefone(Integer.parseInt(dadosCadeira[5]),
		 * Integer.parseInt(dadosCadeira[6]))); d.inserirEditarAluno(a,
		 * Integer.parseInt(dadosCadeira[0]));
		 * 
		 * return true; } }
		 * 
		 * public boolean removerCadeira(int i) { String CadeiraRemovido =
		 * dados.getCadeira()[i].getNome(); String aux;
		 * 
		 * if(i == (dados.getQtdCadeiras() - 1)) { // O aluno a ser removido está no
		 * final do array dados.setQtdCadeiras(dados.getQtdCadeiras() - 1);
		 * dados.getCadeira()[dados.getQtdCadeiras()] = null; return true; } else { // o
		 * aluno a ser removido está no meio do array int cont = 0;
		 * while(dados.getCadeira()[cont].getNome().compareTo(CadeiraRemovido) != 0) {
		 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdCadeiras() - 1;
		 * j++) { dados.getCadeira()[j] = null; dados.getCadeira()[j] =
		 * dados.getCadeira()[j+1]; } dados.getCadeira()[dados.getQtdCadeiras()] = null;
		 * dados.setQtdCadeiras(dados.getQtdCadeiras() - 1); return true; } }
		 */
		public int getQtd() {
			return qtdCadeiras;
		}

		public void setQtd(int qtdCadeiras) {
			this.qtdCadeiras = qtdCadeiras;
		}

		public String getNome(int i) {
			return cadeira[i].getNome();
		}

		public void setQtdCadeiras(int qtdCadeiras) {
			this.qtdCadeiras = qtdCadeiras;
		}

		/*
		 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
		 * this.dados = dados; }
		 * 
		 * public Cadeira[] getCadeira() { return this.dados.getCadeira(); }
		 * 
		 * public int getQtdCadeira() { return this.dados.getQtdCadeiras(); }
		 */
}
