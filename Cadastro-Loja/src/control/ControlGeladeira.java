package control;

import model.*;


public class ControlGeladeira {
	
	//private Dados dados = new Dados();
		private Geladeira[] geladeira;
		private int qtdGeladeiras;

		/*
		 * public ControlGeladeira() { dados.addDados(); }
		 */
		public ControlGeladeira(ControlDados dados) {
			geladeira = dados.getGeladeira();
			qtdGeladeiras = dados.getQtdGeladeira();

		}

		public String[] getNomeGeladeira() {
			String[] s = new String[qtdGeladeiras];
			for (int i = 0; i < qtdGeladeiras; i++) {
				s[i] = geladeira[i].getNome();
			}

			return s;
		}

		/*
		 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
		 * public boolean inserirEditarGeladeira(String[] dadosGeladeira) {
		 * if(!dadosGeladeira[2].matches("[0-9]+") || !dadosGeladeira[3].matches("[0-9]+")
		 * || !dadosGeladeira[4].matches("[0-9]+")) { return false; } else {
		 * 
		 * Aluno a = new Aluno(dadosGeladeira[1], dadosGeladeira[2],
		 * Integer.parseInt(dadosGeladeira[3]), Integer.parseInt(dadosGeladeira[4]), new
		 * Telefone(Integer.parseInt(dadosGeladeira[5]),
		 * Integer.parseInt(dadosGeladeira[6]))); d.inserirEditarAluno(a,
		 * Integer.parseInt(dadosGeladeira[0]));
		 * 
		 * return true; } }
		 * 
		 * public boolean removerGeladeira(int i) { String GeladeiraRemovido =
		 * dados.getGeladeira()[i].getNome(); String aux;
		 * 
		 * if(i == (dados.getQtdGeladeiras() - 1)) { // O aluno a ser removido está no
		 * final do array dados.setQtdGeladeiras(dados.getQtdGeladeiras() - 1);
		 * dados.getGeladeira()[dados.getQtdGeladeiras()] = null; return true; } else { // o
		 * aluno a ser removido está no meio do array int cont = 0;
		 * while(dados.getGeladeira()[cont].getNome().compareTo(GeladeiraRemovido) != 0) {
		 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdGeladeiras() - 1;
		 * j++) { dados.getGeladeira()[j] = null; dados.getGeladeira()[j] =
		 * dados.getGeladeira()[j+1]; } dados.getGeladeira()[dados.getQtdGeladeiras()] = null;
		 * dados.setQtdGeladeiras(dados.getQtdGeladeiras() - 1); return true; } }
		 */
		public int getQtd() {
			return qtdGeladeiras;
		}

		public void setQtd(int qtdGeladeiras) {
			this.qtdGeladeiras = qtdGeladeiras;
		}

		public String getNome(int i) {
			return geladeira[i].getNome();
		}
		
		public void setQtdGeladeira(int qtdGeladeiras) {
			this.qtdGeladeiras = qtdGeladeiras;
		}
	
		/*
		 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
		 * this.dados = dados; }
		 * 
		 * public Geladeira[] getGeladeira() { return this.dados.getGeladeira(); }
		 * 
		 * public int getQtdGeladeira() { return this.dados.getQtdGeladeiras(); }
		 */
}
