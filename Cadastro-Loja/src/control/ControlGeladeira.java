package control;

import model.*;


public class ControlGeladeira {
	
	
		private Geladeira[] geladeira;
		private int qtdGeladeiras;

		public ControlGeladeira(ControlDados dados) {
			geladeira = dados.getGeladeira();
			qtdGeladeiras = dados.getQtdGeladeira();

		}

		// Armazena os nomes em um vetor de string
		public String[] getNomeGeladeira() {
			String[] s = new String[qtdGeladeiras];
			for (int i = 0; i < qtdGeladeiras; i++) {
				s[i] = geladeira[i].getNome();
			}

			return s;
		}
	
}
