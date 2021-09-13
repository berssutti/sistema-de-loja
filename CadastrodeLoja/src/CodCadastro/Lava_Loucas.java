package CodCadastro;

public class Lava_Loucas extends Produto implements CRUD {
	
	private int qtdServico;
	private float peso;
	private float voltagem;
	private String descricao;
	private float consumodeEnergia;


	public Lava_Loucas(int qtdServico, float peso, float voltagem, String descricao, float consumodeEnergia) {
		super();
		this.qtdServico = qtdServico;
		this.peso = peso;
		this.voltagem = voltagem;
		this.descricao = descricao;
		this.consumodeEnergia = consumodeEnergia;
	}


	public String toString() {
		return "Nome do pruduto: " + getNome() + ", descricao: " + getDescricao() + ", preco: " + getPreco();
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
