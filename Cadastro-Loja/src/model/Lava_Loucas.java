package model;

public class Lava_Loucas extends Produto {
	
	private int qtdServico;
	private float peso;
	private float voltagem;
	private String descricao;
	private float consumodeEnergia;


	public Lava_Loucas(int qtdServico, float peso, float voltagem, float consumodeEnergia) {
		super();
		this.qtdServico = qtdServico;
		this.peso = peso;
		this.voltagem = voltagem;
		this.consumodeEnergia = consumodeEnergia;
	}
	
	public Lava_Loucas(String nome, int quantidadeemEstoque, String garantia, String descriacao,
			String Marca, float preco, String id, int qtdServico, float peso, float voltagem, float consumodeEnergia) {
		super();
		this.qtdServico = qtdServico;
		this.peso = peso;
		this.voltagem = voltagem;
		this.consumodeEnergia = consumodeEnergia;
	}
	
	
	public int getQtdServico() {
		return qtdServico;
	}

	public void setQtdServico(int qtdServico) {
		this.qtdServico = qtdServico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getConsumodeEnergia() {
		return consumodeEnergia;
	}

	public void setConsumodeEnergia(int consumodeEnergia) {
		this.consumodeEnergia = consumodeEnergia;
	}

}
