package control;

import model.*;
  
public class ControlDados {
	private Dados dados = new Dados();
	  
	public ControlDados() {
		dados.addDados();
	}
  
  // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	public boolean inserirEditarCliente(String[] dadosCliente) {
		if(!dadosCliente[2].matches("[0-9]+") || !dadosCliente[3].matches("[0-9]+") || 
				!dadosCliente[4].matches("[0-9]+")) {
			return false;
		} else {
			/*
			 * cliente a = new Cliente(dadosCliente[1], dadosCliente[2],
			 * 				 * Integer.parseInt(dadosCliente[3]), Integer.parseInt(dadosCliente[4]), new
			 * Telefone(Integer.parseInt(dadosCliente[5]),
			 * Integer.parseInt(dadosCliente[6]))); d.inserirEditarAluno(a,
			 * Integer.parseInt(dadosCliente[0]));
			 * 				 */
			return true;
			}
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
			if(!dadosFuncionario[2].matches("[0-9]+") || !dadosFuncionario[3].matches("[0-9]+") || 
					!dadosFuncionario[6].matches("[0-9]+")) {
				return false;
			} else {
					//Funcionario p = new Funcionario(dadosFuncionario[1], Double.parseDouble(dadosFuncionario[2]), 
					//		Integer.parseInt(dadosFuncionario[3]), Integer.parseInt(dadosFuncionario[4]), 
					//		new Telefone(Integer.parseInt(dadosFuncionario[5]), Integer.parseInt(dadosFuncionario[6])));
					//dados.inserirEditaFuncionario(p, Integer.parseInt(dadosFuncionario[0]));
					return true;
			}
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
			if(!dadosGeladeira[2].matches("[0-9]+") || !dadosGeladeira[3].matches("[0-9]+") || 
					!dadosGeladeira[4].matches("[0-9]+")) {
				return false;
			} else {
				/*
				 * cliente a = new Cliente(dadosCliente[1], dadosCliente[2],
				 * 				 * Integer.parseInt(dadosCliente[3]), Integer.parseInt(dadosCliente[4]), new
				 * Telefone(Integer.parseInt(dadosCliente[5]),
				 * Integer.parseInt(dadosCliente[6]))); d.inserirEditarAluno(a,
				 * Integer.parseInt(dadosCliente[0]));
				 * 				 */
				return true;
				}
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
			if(!dadosMicroondas[2].matches("[0-9]+") || !dadosMicroondas[3].matches("[0-9]+") || 
					!dadosMicroondas[4].matches("[0-9]+")) {
				return false;
			} else {
				/*
				 * Microondas a = new Microondas(dadosMicroondas[1], dadosMicroondas[2],
				 * 				 * Integer.parseInt(dadosMicroondas[3]), Integer.parseInt(dadosMicroondas[4]), new
				 * Telefone(Integer.parseInt(dadosMicroondas[5]),
				 * Integer.parseInt(dadosMicroondas[6]))); d.inserirEditarAluno(a,
				 * Integer.parseInt(dadosMicroondas[0]));
				 * 				 */
				return true;
				}
			}
		
		public boolean removerMicroondas(int i) {
			String MicroondasRemovido = dados.getMicroondas()[i].getNome();

			if(i == (dados.getQtdGeladeiras() - 1)) { // O Microondas a ser removido está no final do array
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
			if(!dadosLavaLoucas[2].matches("[0-9]+") || !dadosLavaLoucas[3].matches("[0-9]+") || 
					!dadosLavaLoucas[4].matches("[0-9]+")) {
				return false;
			} else {
				/*
				 * LavaLoucas a = new LavaLoucas(dadosLavaLoucas[1], dadosLavaLoucas[2],
				 * 				 * Integer.parseInt(dadosLavaLoucas[3]), Integer.parseInt(dadosLavaLoucas[4]), new
				 * Telefone(Integer.parseInt(dadosLavaLoucas[5]),
				 * Integer.parseInt(dadosLavaLoucas[6]))); d.inserirEditarAluno(a,
				 * Integer.parseInt(dadosLavaLoucas[0]));
				 * 				 */
				return true;
				}
			}
		
		public boolean removerLavaLoucas(int i) {
			String LavaLoucasRemovido = dados.getLavaLoucas()[i].getNome();

			if(i == (dados.getQtdGeladeiras() - 1)) { // O LavaLoucas a ser removido está no final do array
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
			if(!dadosMesa[2].matches("[0-9]+") || !dadosMesa[3].matches("[0-9]+") || 
					!dadosMesa[4].matches("[0-9]+")) {
				return false;
			} else {
				/*
				 * Mesa a = new Mesa(dadosMesa[1], dadosMesa[2],
				 * 				 * Integer.parseInt(dadosMesa[3]), Integer.parseInt(dadosMesa[4]), new
				 * Telefone(Integer.parseInt(dadosMesa[5]),
				 * Integer.parseInt(dadosMesa[6]))); d.inserirEditarAluno(a,
				 * Integer.parseInt(dadosMesa[0]));
				 * 				 */
				return true;
				}
			}
		
		public boolean removerMesa(int i) {
			String MesaRemovido = dados.getMesa()[i].getNome();

			if(i == (dados.getQtdGeladeiras() - 1)) { // O Mesa a ser removido está no final do array
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
			if(!dadosCadeira[2].matches("[0-9]+") || !dadosCadeira[3].matches("[0-9]+") || 
					!dadosCadeira[4].matches("[0-9]+")) {
				return false;
			} else {
				/*
				 * Cadeira a = new Cadeira(dadosCadeira[1], dadosCadeira[2],
				 * 				 * Integer.parseInt(dadosCadeira[3]), Integer.parseInt(dadosCadeira[4]), new
				 * Telefone(Integer.parseInt(dadosCadeira[5]),
				 * Integer.parseInt(dadosCadeira[6]))); d.inserirEditarAluno(a,
				 * Integer.parseInt(dadosCadeira[0]));
				 * 				 */
				return true;
				}
			}
		
		public boolean removerCadeira(int i) {
			String CadeiraRemovido = dados.getCadeira()[i].getNome();

			if(i == (dados.getQtdGeladeiras() - 1)) { // O Cadeira a ser removido está no final do array
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
			if(!dadosArmario[2].matches("[0-9]+") || !dadosArmario[3].matches("[0-9]+") || 
					!dadosArmario[4].matches("[0-9]+")) {
				return false;
			} else {
				/*
				 * Armario a = new Armario(dadosArmario[1], dadosArmario[2],
				 * 				 * Integer.parseInt(dadosArmario[3]), Integer.parseInt(dadosArmario[4]), new
				 * Telefone(Integer.parseInt(dadosArmario[5]),
				 * Integer.parseInt(dadosArmario[6]))); d.inserirEditarAluno(a,
				 * Integer.parseInt(dadosArmario[0]));
				 * 				 */
				return true;
				}
			}
		
		public boolean removerArmario(int i) {
			String ArmarioRemovido = dados.getArmario()[i].getNome();

			if(i == (dados.getQtdGeladeiras() - 1)) { // O Armario a ser removido está no final do array
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
	