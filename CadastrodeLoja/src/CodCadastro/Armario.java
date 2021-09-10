package CodCadastro;

public class Armario extends Produto implements CRUD {

	private int qrdGaveta;
	private float medidas;
	private String tipo;
	private String material;
	private int qtdPorta;


	public Armario(int qrdGaveta, float medidas, String tipo, String material, int qtdPorta) {
		super();
		this.qrdGaveta = qrdGaveta;
		this.medidas = medidas;
		this.tipo = tipo;
		this.material = material;
		this.qtdPorta = qtdPorta;
	}


	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ler() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}
	
	
	public int getQrdGaveta() {
		return qrdGaveta;
	}


	public void setQrdGaveta(int qrdGaveta) {
		this.qrdGaveta = qrdGaveta;
	}


	public float getMedidas() {
		return medidas;
	}


	public void setMedidas(float medidas) {
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
