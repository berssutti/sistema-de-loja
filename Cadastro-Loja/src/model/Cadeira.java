package model;
/**
 * Cria classe Cadeira herdando da classe produto, com gets e sets
 * @author Bernardo Pissutti
 * @vesion 1.0 [Out 2021]
 */
public class Cadeira extends Produto {
	
	
	private String medidas;
	private String tipo;
	private float peso;
	private float pesoSuportavel;
	
	
	public Cadeira(String medidas, String tipo, float peso, float pesoSuportavel) {
		this.medidas = medidas;
		this.tipo = tipo;
		this.peso = peso;
		this.pesoSuportavel = pesoSuportavel;
	}
	
	public Cadeira(String nome, int quantidadeemEstoque, String garantia, String descriacao,
			String marca, float preco, String id, String medidas, String tipo, float peso, float pesoSuportavel) {
		this.setNome(nome);
		this.setQuantidadeemEstoque(quantidadeemEstoque);
		this.setGarantia(garantia);
		this.setDescricao(descriacao);
		this.setMarca(marca);
		this.setPreco(preco);
		this.setId(id);
		this.medidas = medidas;
		this.tipo = tipo;
		this.peso = peso;
		this.pesoSuportavel = pesoSuportavel;
		
	}
	
	
	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPesoSuportavel() {
		return pesoSuportavel;
	}

	public void setPesoSuportavel(float pesoSuportavel) {
		this.pesoSuportavel = pesoSuportavel;
	}

}
