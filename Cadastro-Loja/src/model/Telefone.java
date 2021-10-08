package model;

/**
 * Cria classe Telefone que está assiciada com as classes Cliente e Funcionario
 * @author Bernardo Pissutti
 * @version 1.0 [Out 2021]
 */

public class Telefone {
	
	private String ddd;
	private String numero;

	
	public Telefone() {
		
	}
	
	public Telefone(String ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}
	

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
