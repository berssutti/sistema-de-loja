package model;


public class Dados {
	
	static Cliente cliente[];
	private int qtdClientes = 0;
	static Funcionario funcionario[];
	private int qtdAFuncionarios = 0;
	static Telefone telefone[];
	private int qtdTelefones = 0;
	static Armario armario[];
	private int qtdArmarios = 0;
	static Geladeira geladeira[];
	private int qtdGeladeiras = 0;
	static Mesa mesa[];
	private int qtdMesas = 0;
	static Microondas microondas[];
	private int qtdMicroondas = 0;
	static Cadeira cadeira[];
	private int qtdCadeiras = 0;
	static Lava_Loucas lavaLoucas[];
	private int qtdlavaLoucas = 0;
	
	
	public void addDados() {

		for(int i = 0; i < 5; i++) {
			telefone[i] = new Telefone(Integer.toString((i+1)*100),Integer.toString((i+1)*1000000));
			cliente[i] = new Cliente("Cliente"+i, "CPF"+i, "RG"+i, telefone[i]);
			funcionario[i] = new Funcionario("Funcionario"+i, "CPF"+ i*2, "RG"+i*2, "Atendente",333.50f, telefone[i]);
			armario[i] = new Armario(10, "209x10", "Gamer", "madeira", 4);
			armario[i].setNome("Armario");
			armario[i].setDescricao("Para jogos");
			armario[i].setGarantia("1 ano");
			armario[i].setId("1118890");
			armario[i].setMarca("IKEA");
			armario[i].setPreco(398f);
			armario[i].setQuantidadeemEstoque(12);
			geladeira[i] = new Geladeira(25.3f, 288f, 34f, 45f);
			geladeira[i].setNome("Geladeira");
			geladeira[i].setDescricao("Para jogos");
			geladeira[i].setGarantia("1 ano");
			geladeira[i].setId("1718890");
			geladeira[i].setMarca("IKEA");
			geladeira[i].setPreco(398f);
			geladeira[i].setQuantidadeemEstoque(12);
			microondas[i] = new Microondas(34.4f,36.5f,90.0f,190.0f,43.5f);
			microondas[i].setNome("Microondas");
			microondas[i].setDescricao("Para jogos");
			microondas[i].setGarantia("1 ano");
			microondas[i].setId("4456767");
			microondas[i].setMarca("IKEA");
			microondas[i].setPreco(398f);
			microondas[i].setQuantidadeemEstoque(12);
			cadeira[i] = new Cadeira("34x40", "gamer", 45.6f, 89.4f);
			cadeira[i].setNome("Cadeira");
			cadeira[i].setDescricao("Para jogos");
			cadeira[i].setGarantia("1 ano");
			cadeira[i].setId("1108890");
			cadeira[i].setMarca("IKEA");
			cadeira[i].setPreco(398f);
			cadeira[i].setQuantidadeemEstoque(12);
			lavaLoucas[i] = new Lava_Loucas(24, 45f,53f,"lava loucas sujas",34);
			lavaLoucas[i].setNome("Lava loucas");
			lavaLoucas[i].setDescricao("Para jogos");
			lavaLoucas[i].setGarantia("1 ano");
			lavaLoucas[i].setId("1116890");
			lavaLoucas[i].setMarca("IKEA");
			lavaLoucas[i].setPreco(398f);
			lavaLoucas[i].setQuantidadeemEstoque(12);
			mesa[i] = new Mesa("20x29", 24, "Gamer", "madeira", 90.6f);
			mesa[i].setNome("Mesa");
			mesa[i].setDescricao("Para jogos");
			mesa[i].setGarantia("1 ano");
			mesa[i].setId("1118860");
			mesa[i].setMarca("IKEA");
			mesa[i].setPreco(398f);
			mesa[i].setQuantidadeemEstoque(12);
		}
		
		qtdClientes = 5;
		qtdAFuncionarios = 5;
		qtdTelefones = 5;
		qtdArmarios = 5;
		qtdGeladeiras = 5;
		qtdMesas = 5;
		qtdMicroondas = 5;
		qtdCadeiras = 5;
		qtdlavaLoucas = 5;
	}


	public static Cliente[] getCliente() {
		return cliente;
	}


	public static void setCliente(Cliente[] cliente) {
		Dados.cliente = cliente;
	}


	public int getQtdClientes() {
		return qtdClientes;
	}


	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}


	public static Funcionario[] getFuncionario() {
		return funcionario;
	}


	public static void setFuncionario(Funcionario[] funcionario) {
		Dados.funcionario = funcionario;
	}


	public int getQtdAFuncionarios() {
		return qtdAFuncionarios;
	}


	public void setQtdAFuncionarios(int qtdAFuncionarios) {
		this.qtdAFuncionarios = qtdAFuncionarios;
	}


	public static Telefone[] getTelefone() {
		return telefone;
	}


	public static void setTelefone(Telefone[] telefone) {
		Dados.telefone = telefone;
	}


	public int getQtdTelefones() {
		return qtdTelefones;
	}


	public void setQtdTelefones(int qtdTelefones) {
		this.qtdTelefones = qtdTelefones;
	}


	public static Armario[] getArmario() {
		return armario;
	}


	public static void setArmario(Armario[] armario) {
		Dados.armario = armario;
	}


	public int getQtdArmarios() {
		return qtdArmarios;
	}


	public void setQtdArmarios(int qtdArmarios) {
		this.qtdArmarios = qtdArmarios;
	}


	public static Geladeira[] getGeladeira() {
		return geladeira;
	}


	public static void setGeladeira(Geladeira[] geladeira) {
		Dados.geladeira = geladeira;
	}


	public int getQtdGeladeiras() {
		return qtdGeladeiras;
	}


	public void setQtdGeladeiras(int qtdGeladeiras) {
		this.qtdGeladeiras = qtdGeladeiras;
	}


	public static Mesa[] getMesa() {
		return mesa;
	}


	public static void setMesa(Mesa[] mesa) {
		Dados.mesa = mesa;
	}


	public int getQtdMesas() {
		return qtdMesas;
	}


	public void setQtdMesas(int qtdMesas) {
		this.qtdMesas = qtdMesas;
	}


	public static Microondas[] getMicroondas() {
		return microondas;
	}


	public static void setMicroondas(Microondas[] microondas) {
		Dados.microondas = microondas;
	}


	public int getQtdMicroondas() {
		return qtdMicroondas;
	}


	public void setQtdMicroondas(int qtdMicroondas) {
		this.qtdMicroondas = qtdMicroondas;
	}


	public static Cadeira[] getCadeira() {
		return cadeira;
	}


	public static void setCadeira(Cadeira[] cadeira) {
		Dados.cadeira = cadeira;
	}


	public int getQtdCadeiras() {
		return qtdCadeiras;
	}


	public void setQtdCadeiras(int qtdCadeiras) {
		this.qtdCadeiras = qtdCadeiras;
	}


	public static Lava_Loucas[] getLavaLoucas() {
		return lavaLoucas;
	}


	public static void setLavaLoucas(Lava_Loucas[] lavaLoucas) {
		Dados.lavaLoucas = lavaLoucas;
	}


	public int getQtdlavaLoucas() {
		return qtdlavaLoucas;
	}


	public void setQtdlavaLoucas(int qtdlavaLoucas) {
		this.qtdlavaLoucas = qtdlavaLoucas;
	}
	
}
