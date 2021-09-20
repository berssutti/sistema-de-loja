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
			
		public int getQtdFuncionarios() {
			return this.dados.getQtdAFuncionarios();
		}
			
		public Funcionario[] getFuncionario() {
			return this.dados.getFuncionario();
		}
		  
		

  }
	