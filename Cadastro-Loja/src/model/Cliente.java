package model;

import java.util.*;

public class Cliente {

	private String nome;
	private String cpf;
	private String rg;
	private Telefone numero;
	private List<Produto> carrinho;


	public Cliente(String nome, String cpf, String rg, Telefone numero, List<Produto> carrinho) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.numero = numero;
		this.carrinho = carrinho;
	}
	
	public void addCarrinho(Produto produto) {
		this.carrinho.add(produto);
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

	public Telefone getNumero() {
		return numero;
	}

	public void setNumero(Telefone numero) {
		this.numero = numero;
	}
	
	public List<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<Produto> carrinho) {
		this.carrinho = carrinho;
	}

}
