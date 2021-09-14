package CodCadastro;

public class Cliente implements CRUD {

	private String nome;
	private String cpf;
	private String rg;
	private Telefone numero;

	
	public Cliente(String nome, String cpf, String rg, Telefone numero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.numero = numero;
	}

	public String toString() {
		return "Nome do cliente: " + getNome() + ", cpf: " + getCpf() + ", " + getNumero() ;
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
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Telefone getNumero() {
		return numero;
	}


	public void setNumero(Telefone numero) {
		this.numero = numero;
	}

}
