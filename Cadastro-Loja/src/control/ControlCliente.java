package control;

import model.*;

public class ControlCliente {

	private Cliente[] cliente;
	private int qtdClientes;

	/*
	 * public ControlCliente() { dados.addDados(); }
	 */
	public ControlCliente(ControlDados dados) {
		cliente = dados.getCliente();
		qtdClientes = dados.getQtdCliente();

	}

	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = cliente[i].getNome();
		}

		return s;
	}


//	public int getQtd() {
//		return qtdClientes;
//	}

//	public void setQtd(int qtdClientes) {
//		this.qtdClientes = qtdClientes;
//	}

//	public String getNome(int i) {
//		return cliente[i].getNome();
//	}

//	public String getCPF(int i) {
//		String numCPF = String.valueOf(cliente[i].getCpf());
//		return numCPF;
//	}

//	public String getRG(int i) {
//		String numRG = String.valueOf(cliente[i].getRg());
//		return numRG;
//	}

//	public Telefone getTelefone(int i) {
//		return cliente[i].getNumero();
//	}

//	public void setQtdClientes(int qtdClientes) {
//		this.qtdClientes = qtdClientes;
//	}

	/*
	 * public Dados getDados() { return dados; } public void setDados(Dados dados) {
	 * this.dados = dados; }
	 * 
	 * public Cliente[] getCliente() { return this.dados.getCliente(); }
	 * 
	 * public int getQtdCliente() { return this.dados.getQtdClientes(); }
	 */

}
