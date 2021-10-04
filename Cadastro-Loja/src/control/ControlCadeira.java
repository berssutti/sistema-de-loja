package control;

import model.*;


public class ControlCadeira {
	
		private Cadeira[] cadeira;
		private int qtdCadeiras;

		public ControlCadeira(ControlDados dados) {
			cadeira = dados.getCadeira();
			qtdCadeiras = dados.getQtdCadeira();

		}
		// Armazena os nomes em um vetor de string
		public String[] getNomeCadeira() {
			String[] s = new String[qtdCadeiras];
			for (int i = 0; i < qtdCadeiras; i++) {
				s[i] = cadeira[i].getNome();
			}

			return s;
		}

}
