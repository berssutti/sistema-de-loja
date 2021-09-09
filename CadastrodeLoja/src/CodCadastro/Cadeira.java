package CodCadastro;

public class Cadeira extends Produto implements CRUD {
	
	
	private float medidas;
	private String tipo;
	private float peso;
	private float pesoSuportavel;
	
	
	public Cadeira(float med, String t, float p, float ps) {
		medidas = med;
		tipo = t;
		peso = p;
		pesoSuportavel	= ps;
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
