package CodCadastro;

public class Armario extends Produto implements CRUD {

	private int qrdGaveta;
	private float medidas;
	private String tipo;
	private String material;
	private int qtdPorta;
	
	
	public Armario(int qg, int qp, float med, String t, String mat ) {
		qrdGaveta = qg;
		qtdPorta = qp;
		medidas = med;
		tipo = t;
		material = mat;
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
