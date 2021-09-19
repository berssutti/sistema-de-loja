package model;

public abstract class Produto {
	
	private	String nome;
	private int quantidadeemEstoque;
	private	String garantia;
	private	String descricao;
	private	String marca;
	private	float preco;
	private	String id;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidadeemEstoque() {
		return quantidadeemEstoque;
	}


	public void setQuantidadeemEstoque(int quantidadeemEstoque) {
		this.quantidadeemEstoque = quantidadeemEstoque;
	}


	public String getGarantia() {
		return garantia;
	}


	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

}
