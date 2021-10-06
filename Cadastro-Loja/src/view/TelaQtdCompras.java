package view;
/**
 * Implementa uma interface para o usuario digitar a quantidade de produtos ele irá comprar
 * @author Bernardo Pissutti
 * @version 1.0
 */
import control.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaQtdCompras implements ActionListener{
	
	private JFrame janela;
	private JTextField qtdCompras;
	private JLabel perguntaCompras;
	private JButton butao;
	private ControlDados dados = new ControlDados(); 
	int tipoProduto;
	int resultado;
	int produtoSelecionado;
	/**
	 * Pergunta ao usuário quantas unidades do produto o usuário quer comprar, e diminui da quantidade em estoque do produto comprado
	 * @param produtoSelecionado
	 * @param tipoProduto
	 * @return void
	 */
	public void mostrarTela(int produtoSelecionado,int tipoProduto){
		this.produtoSelecionado = produtoSelecionado;
		this.tipoProduto = tipoProduto;
		
		janela = new JFrame("Quantidade Produtos");
		perguntaCompras = new JLabel("Quantas unidades deseja comprar ?");
		qtdCompras = new JTextField(200);
		butao = new JButton("OK");
		
		perguntaCompras.setBounds(50, 10, 350, 30);
		qtdCompras.setBounds(115, 60, 70, 25);
		butao.setBounds(250, 80, 70, 30);
		perguntaCompras.setFont(new Font("Calibri", Font.BOLD, 16));
		
		
		janela.setLayout(null);
		janela.add(perguntaCompras);
		janela.add(qtdCompras);
		janela.add(butao);
		janela.setSize(350,150);
		janela.setVisible(true);
		
		butao.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(tipoProduto == 1) { // cadeira
			dados.getCadeira()[produtoSelecionado].setQuantidadeemEstoque(dados.getCadeira()[produtoSelecionado].getQuantidadeemEstoque() -
					Integer.parseInt( qtdCompras.getText()));
			janela.dispose();
		}
		if(tipoProduto == 2) { // mesa
			dados.getMesa()[produtoSelecionado].setQuantidadeemEstoque(dados.getMesa()[produtoSelecionado].getQuantidadeemEstoque() -
					Integer.parseInt( qtdCompras.getText()));
			janela.dispose();
		}
		if(tipoProduto == 3) { // armario
			dados.getArmario()[produtoSelecionado].setQuantidadeemEstoque(dados.getArmario()[produtoSelecionado].getQuantidadeemEstoque() -
					Integer.parseInt( qtdCompras.getText()));
			janela.dispose();
		}
		if(tipoProduto == 4) { // geladeira
			dados.getGeladeira()[produtoSelecionado].setQuantidadeemEstoque(dados.getGeladeira()[produtoSelecionado].getQuantidadeemEstoque() -
					Integer.parseInt( qtdCompras.getText()));
			janela.dispose();
		}
		if(tipoProduto == 5) { // microondas
			dados.getMicroondas()[produtoSelecionado].setQuantidadeemEstoque(dados.getMicroondas()[produtoSelecionado].getQuantidadeemEstoque() -
					Integer.parseInt( qtdCompras.getText()));
			janela.dispose();
		}
		if(tipoProduto == 6) { // lava louças
			dados.getlavaLoucas()[produtoSelecionado].setQuantidadeemEstoque(dados.getlavaLoucas()[produtoSelecionado].getQuantidadeemEstoque() -
					Integer.parseInt( qtdCompras.getText()));
			janela.dispose();
		}
		
		JOptionPane.showMessageDialog(null, "Compra finalizada com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
}
