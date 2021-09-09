package CodCadastro;

public class Carrinho {
	
	private Produto compras[];
	private float preçoTotal;
	
	
	public Carrinho(Produto comp[], float pt) {
		
		compras = comp;
		preçoTotal = pt;
	}

	
	public Produto[] getCompras() {
		return compras;
	}

	public void setCompras(Produto[] compras) {
		this.compras = compras;
	}

	public float getPreçoTotal() {
		return preçoTotal;
	}

	public void setPreçoTotal(float preçoTotal) {
		this.preçoTotal = preçoTotal;
	}


}
