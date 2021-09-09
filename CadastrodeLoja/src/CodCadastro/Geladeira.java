package CodCadastro;

public class Geladeira extends Produto implements CRUD {
	
	private float volume;
	private float peso;
	private float voltagem;
	private float consumodeEnergia;
	
	public Geladeira(float v, float p, float volts, float ce) {
		volume = v;
		peso = p;
		voltagem = volts;
		consumodeEnergia = ce;
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
