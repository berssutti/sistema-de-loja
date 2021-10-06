package model;

/**
 * Cria classe Cliente com gets e sets
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
public class Cliente {

	private String nome;
	private String cpf;
	private String rg;
	private Telefone numero;
	private String[] carrinho =  new String[50];
	private int qtdProdutosCarrinho = 2;


	public Cliente(String nome, String cpf, String rg, Telefone numero, String[] carrinho) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.numero = numero;
		this.carrinho = carrinho;
	}
	
	public Cliente(String nome, String cpf, String rg, Telefone numero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.numero = numero;
	}
	
	public void addCarrinho(String produto, int posicao) {
		
		this.carrinho[posicao] = produto;
		qtdProdutosCarrinho++;
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
	
	public String[] getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(String[] carrinho) {
		this.carrinho = carrinho;
	}

	public int getQtdProdutosCarrinho() {
		return qtdProdutosCarrinho;
	}

	public void setQtdProdutosCarrinho(int qtdProdutosCarrinho) {
		this.qtdProdutosCarrinho = qtdProdutosCarrinho;
	}

}
