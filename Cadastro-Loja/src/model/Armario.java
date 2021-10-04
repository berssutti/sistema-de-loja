package model;

public class Armario extends Produto {

	private int qrdGaveta;
	private String medidas;
	private String tipo;
	private String material;
	private int qtdPorta;


	public Armario(int qrdGaveta, String medidas, String tipo, String material, int qtdPorta) {
		super();
		this.qrdGaveta = qrdGaveta;
		this.medidas = medidas;
		this.tipo = tipo;
		this.material = material;
		this.qtdPorta = qtdPorta;
	}
	
	public Armario(String nome, int quantidadeemEstoque, String garantia, String descriacao,
			String Marca, float preco, String id, int qrdGaveta, String medidas, String tipo, String material, int qtdPorta) {
		super();
		this.qrdGaveta = qrdGaveta;
		this.medidas = medidas;
		this.tipo = tipo;
		this.material = material;
		this.qtdPorta = qtdPorta;
	}

	
	public int getQrdGaveta() {
		return qrdGaveta;
	}


	public void setQrdGaveta(int qrdGaveta) {
		this.qrdGaveta = qrdGaveta;
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


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public int getQtdPorta() {
		return qtdPorta;
	}


	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta = qtdPorta;
	}

}
