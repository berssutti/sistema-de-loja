package model;

/**
 * Cria classe Funcionario com gets e sets
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */

public class Funcionario{

	private String nome;
	private String cpf;
	private String rg;
	private String cargo;
	private float salario;
	private Telefone numero;

	
	public Funcionario(String nome, String cpf, String rg, String cargo, float salario, Telefone numero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cargo = cargo;
		this.salario = salario;
		this.numero = numero;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Telefone getNumero() {
		return numero;
	}

	public void setNumero(Telefone numero) {
		this.numero = numero;
	}


}
