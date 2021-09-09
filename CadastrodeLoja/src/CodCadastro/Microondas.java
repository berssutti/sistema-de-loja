package CodCadastro;

public class Microondas extends Produto implements CRUD{
	
	private float volume;
	private float peso;
	private float voltagem;
	private float potencia;
	private float consumodeEnergia;
	
	

	public Microondas(float vol, float p, float volts, float pot, float ce) {
		
		volume = vol;
		peso = p;
		voltagem = volts;
		potencia = pot;
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

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}


	public float getConsumodeEnergia() {
		return consumodeEnergia;
	}

	public void setConsumodeEnergia(int consumodeEnergia) {
		this.consumodeEnergia = consumodeEnergia;
	}

}
