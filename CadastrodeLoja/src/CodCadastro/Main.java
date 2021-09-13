package CodCadastro;

import java.util.*;

public class Main {
	
	
	static Cliente cliente;
	static Funcionario funcionario;
	static Telefone tel1;
	static Telefone tel2;
	static Armario armario;
	static Geladeira geladeira;
	static Mesa mesa;
	static Microondas microondas;
	static Cadeira cadeira;
	static Lava_Loucas lavaLoucas;
	
	
	
	public static void main(String[] args) {
		
		tel1 = new Telefone();
		tel2 = new Telefone();
		tel1.setDdd("061");
		tel1.setNumero("982557940");
		tel2.setDdd("061");
		tel2.setNumero("93425432");
		cliente = new Cliente("Bernardo Pissutti","06649667137","3556711",tel1);
		funcionario = new Funcionario("Moody Chaves Pissutti","98908902245","8994218","Atendente", 2000, tel2);
		armario = new Armario(10, "209x10", "Gamer", "madeira", 4);
		armario.setNome("Armario");
		armario.setDescricao("Para jogos");
		armario.setGarantia("1 ano");
		armario.setId("1118890");
		armario.setMarca("IKEA");
		armario.setPreco(398f);
		armario.setQuantidadeemEstoque(12);
		geladeira = new Geladeira(25.3f, 288f, 34f, 45f);
		geladeira.setNome("Geladeira");
		geladeira.setDescricao("Para jogos");
		geladeira.setGarantia("1 ano");
		geladeira.setId("1718890");
		geladeira.setMarca("IKEA");
		geladeira.setPreco(398f);
		geladeira.setQuantidadeemEstoque(12);
		mesa = new Mesa("20x29", 24, "Gamer", "madeira", 90.6f);
		mesa.setNome("Mesa");
		mesa.setDescricao("Para jogos");
		mesa.setGarantia("1 ano");
		mesa.setId("1118860");
		mesa.setMarca("IKEA");
		mesa.setPreco(398f);
		mesa.setQuantidadeemEstoque(12);
		microondas = new Microondas(34.4f,36.5f,90.0f,190.0f,43.5f);
		microondas.setNome("Microondas");
		microondas.setDescricao("Para jogos");
		microondas.setGarantia("1 ano");
		microondas.setId("4456767");
		microondas.setMarca("IKEA");
		microondas.setPreco(398f);
		microondas.setQuantidadeemEstoque(12);
		cadeira = new Cadeira("34x40", "gamer", 45.6f, 89.4f);
		cadeira.setNome("Cadeira");
		cadeira.setDescricao("Para jogos");
		cadeira.setGarantia("1 ano");
		cadeira.setId("1108890");
		cadeira.setMarca("IKEA");
		cadeira.setPreco(398f);
		cadeira.setQuantidadeemEstoque(12);
		lavaLoucas = new Lava_Loucas(24, 45f,53f,"lava loucas sujas",34);
		lavaLoucas.setNome("Lava loucas");
		lavaLoucas.setDescricao("Para jogos");
		lavaLoucas.setGarantia("1 ano");
		lavaLoucas.setId("1116890");
		lavaLoucas.setMarca("IKEA");
		lavaLoucas.setPreco(398f);
		lavaLoucas.setQuantidadeemEstoque(12);
		
		System.out.println(cliente.toString());
		System.out.println(funcionario.toString());
		System.out.println(armario.toString());
		System.out.println(microondas.toString());
		System.out.println(geladeira.toString());
		System.out.println(mesa.toString());
		System.out.println(cadeira.toString());
		System.out.println(lavaLoucas.toString());
		
	}

}
