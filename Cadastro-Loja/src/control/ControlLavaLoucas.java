package control;

import model.*;

public class ControlLavaLoucas {
	//private Dados dados = new Dados();
		private Lava_Loucas[] lavaLoucas;
		private int qtdLavaLoucass;

		/*
		 * public ControlLavaLoucas() { dados.addDados(); }
		 */
		public ControlLavaLoucas(ControlDados dados) {
			lavaLoucas = dados.getlavaLoucas();
			qtdLavaLoucass = dados.getQtdlavaLoucas();

		}

		public String[] getNomeLavaLoucas() {
			String[] s = new String[qtdLavaLoucass];
			for (int i = 0; i < qtdLavaLoucass; i++) {
				s[i] = lavaLoucas[i].getNome();
			}

			return s;
		}

		/*
		 * // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
		 * public boolean inserirEditarLavaLoucas(String[] dadosLavaLoucas) {
		 * if(!dadosLavaLoucas[2].matches("[0-9]+") || !dadosLavaLoucas[3].matches("[0-9]+")
		 * || !dadosLavaLoucas[4].matches("[0-9]+")) { return false; } else {
		 * 
		 * Aluno a = new Aluno(dadosLavaLoucas[1], dadosLavaLoucas[2],
		 * Integer.parseInt(dadosLavaLoucas[3]), Integer.parseInt(dadosLavaLoucas[4]), new
		 * Telefone(Integer.parseInt(dadosLavaLoucas[5]),
		 * Integer.parseInt(dadosLavaLoucas[6]))); d.inserirEditarAluno(a,
		 * Integer.parseInt(dadosLavaLoucas[0]));
		 * 
		 * return true; } }
		 * 
		 * public boolean removerLavaLoucas(int i) { String LavaLoucasRemovido =
		 * dados.getLavaLoucas()[i].getNome(); String aux;
		 * 
		 * if(i == (dados.getQtdLavaLoucass() - 1)) { // O aluno a ser removido está no
		 * final do array dados.setQtdLavaLoucass(dados.getQtdLavaLoucass() - 1);
		 * dados.getLavaLoucas()[dados.getQtdLavaLoucass()] = null; return true; } else { // o
		 * aluno a ser removido está no meio do array int cont = 0;
		 * while(dados.getLavaLoucas()[cont].getNome().compareTo(LavaLoucasRemovido) != 0) {
		 * cont++; } //Rotina swap for(int j = cont; j < dados.getQtdLavaLoucass() - 1;
		 * j++) { dados.getLavaLoucas()[j] = null; dados.getLavaLoucas()[j] =
		 * dados.getLavaLoucas()[j+1]; } dados.getLavaLoucas()[dados.getQtdLavaLoucass()] = null;
		 * dados.setQtdLavaLoucass(dados.getQtdLavaLoucass() - 1); return true; } }
		 */
		public int getQtd() {
			return qtdLavaLoucass;
		}

		public void setQtd(int qtdLavaLoucass) {
			this.qtdLavaLoucass = qtdLavaLoucass;
		}

		public String getNome(int i) {
			return lavaLoucas[i].getNome();
		}


		public void setQtdLavaLoucass(int qtdLavaLoucass) {
			this.qtdLavaLoucass = qtdLavaLoucass;
		}

		/*
		 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
		 * this.dados = dados; }
		 * 
		 * public LavaLoucas[] getLavaLoucas() { return this.dados.getLavaLoucas(); }
		 * 
		 * public int getQtdLavaLoucas() { return this.dados.getQtdLavaLoucass(); }
		 */
}
