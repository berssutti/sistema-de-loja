package control;

import model.*;
  
public class ControlDados {
	private Dados dados = new Dados();
	  
	public ControlDados() {
		dados.addDados();
	}
  
  // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	public boolean inserirEditarCliente(String[] dadosCliente) {
		//if (dadosCliente[2].length() > 11  || dadosCliente[3].length() > 8 || dadosCliente[4].length() > 3 || dadosCliente[5].length() > 9 ||
		//		dadosCliente[2].length() < 11  || dadosCliente[3].length() < 8 || dadosCliente[4].length() < 3 || dadosCliente[5].length() < 9) {
			//return false;		
		//} else {
			Cliente c = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3], new
			Telefone(dadosCliente[4], dadosCliente[5])); 
			dados.inserirEditarCliente(c, Integer.parseInt(dadosCliente[0]));
			  				 
			return true;
		//}
		
	}

	
		public boolean removerCliente(int i) {
			String clienteRemovido = dados.getCliente()[i].getNome();

			if(i == (dados.getQtdClientes() - 1)) { // O cliente a ser removido está no final do array
				dados.setQtdClientes(dados.getQtdClientes() - 1);
				dados.getCliente()[dados.getQtdClientes()] = null;
				return true;
			} else { // o cliente a ser removido está no meio do array
				int cont = 0;
				while(dados.getCliente()[cont].getNome().compareTo(clienteRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdClientes() - 1; j++) {
					dados.getCliente()[j] = null;
					dados.getCliente()[j] = dados.getCliente()[j+1];
				}
				dados.getCliente()[dados.getQtdClientes()] = null;
				dados.setQtdClientes(dados.getQtdClientes() - 1);
				return true;
			}
		}
		
		
		public boolean inserirEditarFuncionario(String[] dadosFuncionario) {
			//if(!dadosFuncionario[2].matches("[0-9]+") || !dadosFuncionario[3].matches("[0-9]+") || 
			//		!dadosFuncionario[6].matches("[0-9]+")) {
			//	return false;
			//} else {
				Funcionario p = new Funcionario(dadosFuncionario[1], dadosFuncionario[2],
						dadosFuncionario[3],dadosFuncionario[4],Float.parseFloat(dadosFuncionario[5]), 
						new Telefone(dadosFuncionario[6],dadosFuncionario[7]));
					dados.inserirEditarFuncionario(p, Integer.parseInt(dadosFuncionario[0]));
					return true;
			//}
		}
		
		public boolean removerFuncionario(int i) {
			String funcionarioRemovido = dados.getFuncionario()[i].getNome();
			
			if(i == (dados.getQtdAFuncionarios() - 1)) { // O funcionario a ser removido está no final do array
				dados.setQtdAFuncionarios(dados.getQtdAFuncionarios() - 1);
				dados.getFuncionario()[dados.getQtdAFuncionarios()] = null;
				return true;
			} else { // o funcionario a ser removido está no meio do array
				int cont = 0;
				while(dados.getFuncionario()[cont].getNome().compareTo(funcionarioRemovido) != 0)
					cont++;
				//Rotina swap
				for(int j = cont; j < dados.getQtdAFuncionarios() - 1; j++) {
					dados.getFuncionario()[j] = null;
					dados.getFuncionario()[j] = dados.getFuncionario()[j+1];
				}
				dados.getFuncionario()[dados.getQtdAFuncionarios()] = null;
				dados.setQtdAFuncionarios(dados.getQtdAFuncionarios() - 1);
				return true;
			
			}
		}
		
		
		public boolean inserirEditarGeladeira(String[] dadosGeladeira) {
		//	if(!dadosGeladeira[2].matches("[0-9]+") || !dadosGeladeira[3].matches("[0-9]+") || 
		//			!dadosGeladeira[4].matches("[0-9]+")) {
		//		return false;
		//	} else {
				
				  Geladeira a = new Geladeira(dadosGeladeira[1], Integer.parseInt(dadosGeladeira[2]),
				  				  dadosGeladeira[3], dadosGeladeira[4], dadosGeladeira[5], Float.parseFloat(dadosGeladeira[6]),
				  				  dadosGeladeira[7], Float.parseFloat(dadosGeladeira[8]), Float.parseFloat(dadosGeladeira[9]),
				  				  Float.parseFloat(dadosGeladeira[10]),Float.parseFloat(dadosGeladeira[11]));
				  dados.inserirEditarGeladeira(a,Integer.parseInt(dadosGeladeira[0]));	  				 
				  return true;
		//		}
		}
		
		public boolean removerGeladeira(int i) {
			String GeladeiraRemovida = dados.getGeladeira()[i].getNome();

			if(i == (dados.getQtdGeladeiras() - 1)) { // O Geladeira a ser removido está no final do array
				dados.setQtdGeladeiras(dados.getQtdGeladeiras() - 1);
				dados.getGeladeira()[dados.getQtdGeladeiras()] = null;
				return true;
			} else { // o Geladeira a ser removido está no meio do array
				int cont = 0;
				while(dados.getGeladeira()[cont].getNome().compareTo(GeladeiraRemovida) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdGeladeiras() - 1; j++) {
					dados.getGeladeira()[j] = null;
					dados.getGeladeira()[j] = dados.getGeladeira()[j+1];
				}
				dados.getGeladeira()[dados.getQtdGeladeiras()] = null;
				dados.setQtdGeladeiras(dados.getQtdGeladeiras() - 1);
				return true;
			}
		}
		
		public boolean inserirEditarMicroondas(String[] dadosMicroondas) {
		//	if(!dadosMicroondas[2].matches("[0-9]+") || !dadosMicroondas[3].matches("[0-9]+") || 
		//			!dadosMicroondas[4].matches("[0-9]+")) {
		//		return false;
		//	} else {
			  Microondas a = new Microondas(dadosMicroondas[1], Integer.parseInt(dadosMicroondas[2]),
	  				  dadosMicroondas[3], dadosMicroondas[4], dadosMicroondas[5], Float.parseFloat(dadosMicroondas[6]),
	  				  dadosMicroondas[7], Float.parseFloat(dadosMicroondas[8]), Float.parseFloat(dadosMicroondas[9]),
	  				  Float.parseFloat(dadosMicroondas[10]),Float.parseFloat(dadosMicroondas[11]), Float.parseFloat(dadosMicroondas[12]));
			  dados.inserirEditarMicroondas(a,Integer.parseInt(dadosMicroondas[0]));	  				 
			  return true;
			//	}
		}
		
		public boolean removerMicroondas(int i) {
			String MicroondasRemovido = dados.getMicroondas()[i].getNome();

			if(i == (dados.getQtdMicroondas() - 1)) { // O Microondas a ser removido está no final do array
				dados.setQtdMicroondas(dados.getQtdMicroondas() - 1);
				dados.getMicroondas()[dados.getQtdMicroondas()] = null;
				return true;
			} else { // o Microondas a ser removido está no meio do array
				int cont = 0;
				while(dados.getMicroondas()[cont].getNome().compareTo(MicroondasRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdMicroondas() - 1; j++) {
					dados.getMicroondas()[j] = null;
					dados.getMicroondas()[j] = dados.getMicroondas()[j+1];
				}
				dados.getMicroondas()[dados.getQtdMicroondas()] = null;
				dados.setQtdMicroondas(dados.getQtdMicroondas() - 1);
				return true;
			}
		}
		
		public boolean inserirEditarLavaLoucas(String[] dadosLavaLoucas) {
			//if(!dadosLavaLoucas[2].matches("[0-9]+") || !dadosLavaLoucas[3].matches("[0-9]+") || 
			//		!dadosLavaLoucas[4].matches("[0-9]+")) {
			//	return false;
			//} else {
				 Lava_Loucas a = new Lava_Loucas(dadosLavaLoucas[1], Integer.parseInt(dadosLavaLoucas[2]),
		  				  dadosLavaLoucas[3], dadosLavaLoucas[4], dadosLavaLoucas[5], Float.parseFloat(dadosLavaLoucas[6]),
		  				  dadosLavaLoucas[7], Integer.parseInt(dadosLavaLoucas[8]), Float.parseFloat(dadosLavaLoucas[9]),
		  				  Float.parseFloat(dadosLavaLoucas[10]),Float.parseFloat(dadosLavaLoucas[11]));
				 dados.inserirEditarLavaLoucas(a,Integer.parseInt(dadosLavaLoucas[0]));
				 return true;
		}
			//}
		
		public boolean removerLavaLoucas(int i) {
			String LavaLoucasRemovido = dados.getLavaLoucas()[i].getNome();

			if(i == (dados.getQtdlavaLoucas() - 1)) { // O LavaLoucas a ser removido está no final do array
				dados.setQtdlavaLoucas(dados.getQtdlavaLoucas() - 1);
				dados.getLavaLoucas()[dados.getQtdlavaLoucas()] = null;
				return true;
			} else { // o LavaLoucas a ser removido está no meio do array
				int cont = 0;
				while(dados.getLavaLoucas()[cont].getNome().compareTo(LavaLoucasRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdlavaLoucas() - 1; j++) {
					dados.getLavaLoucas()[j] = null;
					dados.getLavaLoucas()[j] = dados.getLavaLoucas()[j+1];
				}
				dados.getLavaLoucas()[dados.getQtdlavaLoucas()] = null;
				dados.setQtdlavaLoucas(dados.getQtdlavaLoucas() - 1);
				return true;
			}
		}
		
		public boolean inserirEditarMesa(String[] dadosMesa) {
			//if(!dadosMesa[2].matches("[0-9]+") || !dadosMesa[3].matches("[0-9]+") || 
			//		!dadosMesa[4].matches("[0-9]+")) {
			//	return false;
			//} else {
			Mesa a = new Mesa(dadosMesa[1], Integer.parseInt(dadosMesa[2]),
		  				  dadosMesa[3], dadosMesa[4], dadosMesa[5], Float.parseFloat(dadosMesa[6]),
		  				  dadosMesa[7], dadosMesa[8], Float.parseFloat(dadosMesa[9]),
		  				  dadosMesa[10],dadosMesa[11], Float.parseFloat(dadosMesa[12]));
			dados.inserirEditarMesa(a, Integer.parseInt(dadosMesa[0]));
			return true;
			//	}
		}
		
		public boolean removerMesa(int i) {
			String MesaRemovido = dados.getMesa()[i].getNome();

			if(i == (dados.getQtdMesas() - 1)) { // O Mesa a ser removido está no final do array
				dados.setQtdMesas(dados.getQtdMesas() - 1);
				dados.getMesa()[dados.getQtdMesas()] = null;
				return true;
			} else { // o Mesa a ser removido está no meio do array
				int cont = 0;
				while(dados.getMesa()[cont].getNome().compareTo(MesaRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdMesas() - 1; j++) {
					dados.getMesa()[j] = null;
					dados.getMesa()[j] = dados.getMesa()[j+1];
				}
				dados.getMesa()[dados.getQtdMesas()] = null;
				dados.setQtdMesas(dados.getQtdMesas() - 1);
				return true;
			}
		}
		
		public boolean inserirEditarCadeira(String[] dadosCadeira) {
			//if(!dadosCadeira[2].matches("[0-9]+") || !dadosCadeira[3].matches("[0-9]+") || 
			//		!dadosCadeira[4].matches("[0-9]+")) {
			//	return false;
			//} else {
			Cadeira a = new Cadeira(dadosCadeira[1], Integer.parseInt(dadosCadeira[2]),
		  				  dadosCadeira[3], dadosCadeira[4], dadosCadeira[5], Float.parseFloat(dadosCadeira[6]),
		  				  dadosCadeira[7], dadosCadeira[8],dadosCadeira[9],
		  				 Float.parseFloat(dadosCadeira[10]), Float.parseFloat(dadosCadeira[11]));
			dados.inserirEditarCadeira(a, Integer.parseInt(dadosCadeira[0]));
			return true;
				//}
			
		}
		
		public boolean removerCadeira(int i) {
			String CadeiraRemovido = dados.getCadeira()[i].getNome();

			if(i == (dados.getQtdCadeiras() - 1)) { // O Cadeira a ser removido está no final do array
				dados.setQtdCadeiras(dados.getQtdCadeiras() - 1);
				dados.getCadeira()[dados.getQtdCadeiras()] = null;
				return true;
			} else { // o Cadeira a ser removido está no meio do array
				int cont = 0;
				while(dados.getCadeira()[cont].getNome().compareTo(CadeiraRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdCadeiras() - 1; j++) {
					dados.getCadeira()[j] = null;
					dados.getCadeira()[j] = dados.getCadeira()[j+1];
				}
				dados.getCadeira()[dados.getQtdCadeiras()] = null;
				dados.setQtdCadeiras(dados.getQtdCadeiras() - 1);
				return true;
			}
		}
		
		public boolean inserirEditarArmario(String[] dadosArmario) {
			//if(!dadosArmario[2].matches("[0-9]+") || !dadosArmario[3].matches("[0-9]+") || 
			//		!dadosArmario[4].matches("[0-9]+")) {
			//	return false;
			//} else {
			Armario a = new Armario(dadosArmario[1], Integer.parseInt(dadosArmario[2]),
		  				  dadosArmario[3], dadosArmario[4], dadosArmario[5], Float.parseFloat(dadosArmario[6]),
		  				  dadosArmario[7], Integer.parseInt(dadosArmario[8]), dadosArmario[9],
		  				  dadosArmario[10], dadosArmario[11], Integer.parseInt(dadosArmario[12]));
			dados.inserirEditarArmario(a, Integer.parseInt(dadosArmario[0]));
			return true;
			//	}
		}
		
		public boolean removerArmario(int i) {
			String ArmarioRemovido = dados.getArmario()[i].getNome();

			if(i == (dados.getQtdArmarios() - 1)) { // O Armario a ser removido está no final do array
				dados.setQtdArmarios(dados.getQtdArmarios() - 1);
				dados.getArmario()[dados.getQtdArmarios()] = null;
				return true;
			} else { // o Armario a ser removido está no meio do array
				int cont = 0;
				while(dados.getArmario()[cont].getNome().compareTo(ArmarioRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < dados.getQtdArmarios() - 1; j++) {
					dados.getArmario()[j] = null;
					dados.getArmario()[j] = dados.getArmario()[j+1];
				}
				dados.getArmario()[dados.getQtdArmarios()] = null;
				dados.setQtdArmarios(dados.getQtdArmarios() - 1);
				return true;
			}
		}
		
		
		
		public Dados getDados() {
			return dados;
		}

		public void setDados(Dados dados) {
			this.dados = dados;
		}

		public Cliente[] getCliente() {
			return this.dados.getCliente();
		}
			
		public int getQtdCliente() {
			return this.dados.getQtdClientes();
		}
			
		public Funcionario[] getFuncionario() {
			return this.dados.getFuncionario();
		}
		
		public int getQtdFuncionarios() {
			return this.dados.getQtdAFuncionarios();
		}
		 
		public Microondas[] getMicroondas() {
			return this.dados.getMicroondas();
		}
		
		public int getQtdMicroondas() {
			return this.dados.getQtdMicroondas();
		}
		
		public Geladeira[] getGeladeira() {
			return this.dados.getGeladeira();
		}
		
		public int getQtdGeladeira() {
			return this.dados.getQtdGeladeiras();
		}
		
		public Lava_Loucas[] getlavaLoucas() {
			return this.dados.getLavaLoucas();
		}
		
		public int getQtdlavaLoucas() {
			return this.dados.getQtdlavaLoucas();
		}
		
		public Mesa[] getMesa() {
			return this.dados.getMesa();
		}
		
		public int getQtdMesa() {
			return this.dados.getQtdMesas();
		}
		
		public Cadeira[] getCadeira() {
			return this.dados.getCadeira();
		}
		
		public int getQtdCadeira() {
			return this.dados.getQtdCadeiras();
		}
		
		public Armario[] getArmario() {
			return this.dados.getArmario();
		}
		
		public int getQtdArmario() {
			return this.dados.getQtdArmarios();
		}

  }
	