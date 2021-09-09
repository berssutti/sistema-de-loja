package CodCadastro;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	
	public Telefone(String regn, String num) {
		ddd = regn;
		numero = num;
	}

	
	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
