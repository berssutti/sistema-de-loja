package control;

import model.*;

public class ControlLavaLoucas {

		private Lava_Loucas[] lavaLoucas;
		private int qtdLavaLoucass;


		public ControlLavaLoucas(ControlDados dados) {
			lavaLoucas = dados.getlavaLoucas();
			qtdLavaLoucass = dados.getQtdlavaLoucas();

		}

		// Armazena os nomes em um vetor de string
		public String[] getNomeLavaLoucas() {
			String[] s = new String[qtdLavaLoucass];
			for (int i = 0; i < qtdLavaLoucass; i++) {
				s[i] = lavaLoucas[i].getNome();
			}

			return s;
		}
	
}
