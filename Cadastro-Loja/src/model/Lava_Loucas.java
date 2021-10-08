package model;

/**
 * Cria classe Laca_Loucas herdando da classe produto, com gets e sets
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */

public class Lava_Loucas extends Produto {
	
	private int qtdServico;
	private float peso;
	private float voltagem;
	private float consumodeEnergia;


	public Lava_Loucas(int qtdServico, float peso, float voltagem, float consumodeEnergia) {

		this.qtdServico = qtdServico;
		this.peso = peso;
		this.voltagem = voltagem;
		this.consumodeEnergia = consumodeEnergia;
	}
	
	public Lava_Loucas(String nome, int quantidadeemEstoque, String garantia, String descriacao,
			String marca, float preco, String id, int qtdServico, float peso, float voltagem, float consumodeEnergia) {
		
		this.setNome(nome);
		this.setQuantidadeemEstoque(quantidadeemEstoque);
		this.setGarantia(garantia);
		this.setDescricao(descriacao);
		this.setMarca(marca);
		this.setPreco(preco);
		this.setId(id);
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

	public float getConsumodeEnergia() {
		return consumodeEnergia;
	}

	public void setConsumodeEnergia(int consumodeEnergia) {
		this.consumodeEnergia = consumodeEnergia;
	}

}
