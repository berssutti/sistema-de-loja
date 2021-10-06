package model;

/**
 * Cria classe Geladeira herdando da classe produto, com gets e sets
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */

public class Geladeira extends Produto {
	
	private float volume;
	private float peso;
	private float voltagem;
	private float consumodeEnergia;

	public Geladeira(float volume, float peso, float voltagem, float consumodeEnergia) {
		super();
		this.volume = volume;
		this.peso = peso;
		this.voltagem = voltagem;
		this.consumodeEnergia = consumodeEnergia;
		
	}

	public Geladeira(String nome, int quantidadeemEstoque, String garantia, String descriacao,
			String Marca, float preco, String id, float volume, float peso, float voltagem, float consumodeEnergia) {
		super();
		this.volume = volume;
		this.peso = peso;
		this.voltagem = voltagem;
		this.consumodeEnergia = consumodeEnergia;
		
	}


	public float getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
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
