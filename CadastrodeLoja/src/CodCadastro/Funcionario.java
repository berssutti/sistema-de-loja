package CodCadastro;

public class Funcionario implements CRUD{

	private String nome;
	private String cpf;
	private String rg;
	private String cargo;
	private float salario;
	private Telefone ddd;
	private Telefone numero;
	
	
	public Funcionario(String n, String c, String r, String cg, float sal, Telefone regn, Telefone num) {
		
		nome = n;
		cpf = c;
		rg = r;
		cargo = cg;
		salario = sal;
		ddd = regn;
		numero = num;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Telefone getDdd() {
		return ddd;
	}

	public void setDdd(Telefone ddd) {
		this.ddd = ddd;
	}

	public Telefone getNumero() {
		return numero;
	}

	public void setNumero(Telefone numero) {
		this.numero = numero;
	}


}
