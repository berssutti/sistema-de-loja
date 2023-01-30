package view;
/**
 * Implementa uma interface para confirmar a escolha do cliente e produto
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021]
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.*; 
import model.*;
public class TelaConfirmacao implements ActionListener {
	
	private JFrame janela;
	private JLabel perguntaCliente;
	private JLabel perguntaProduto;
	private JButton comprarProduto;
	private JButton naoComprarProduto;
	private int clienteSelecionado;
	private int opcao;
	private int produtoSelecionado;
	private int controlSelecionado;
	private ControlDados dados; 
	private Produto produtoComprado;
	private int tipoProduto;
	
	/**
	 * Confirma o cliente ou o produto selecionado 
	 * @param opcao, representa se o usuário está escolhendo um produto ou cliente
	 * (1) cliente
	 * (2) produto
	 * @param clienteSelecionado, representa a posição do cliente escolhido no JList
	 */
	public void mostrarTela(int opcao, int clienteSelecionado, ControlDados dados ) {
		this.dados = dados;
		this.clienteSelecionado = clienteSelecionado;
		this.opcao = opcao;
		
		janela = new JFrame("Confirmação");
		perguntaCliente = new JLabel("Deseja selecionar o cliente " + dados.getCliente()[clienteSelecionado].getNome() + " ?");
		
		switch(controlSelecionado) {
			case 1:
				produtoComprado = dados.getCadeira()[produtoSelecionado];
				perguntaProduto =  new JLabel("Deseja selecionar esse produto " + dados.getCadeira()[produtoSelecionado].getNome() + " ?");
				tipoProduto = 1;
				break;
			case 2:
				produtoComprado = dados.getMesa()[produtoSelecionado];
				perguntaProduto =  new JLabel("Deseja selecionar esse produto " + dados.getMesa()[produtoSelecionado].getNome() + " ?");
				tipoProduto = 2;
				break;		
			case 3:
				produtoComprado = dados.getArmario()[produtoSelecionado];
				perguntaProduto =  new JLabel("Deseja selecionar esse produto " + dados.getArmario()[produtoSelecionado].getNome() + " ?");
				tipoProduto = 3;
				break;
			case 4:
				produtoComprado = dados.getGeladeira()[produtoSelecionado];
				perguntaProduto =  new JLabel("Deseja selecionar esse produto " + dados.getGeladeira()[produtoSelecionado].getNome() + " ?");
				tipoProduto = 4;
				break;
			case 5:
				produtoComprado = dados.getMicroondas()[produtoSelecionado];
				perguntaProduto =  new JLabel("Deseja selecionar esse produto " + dados.getMicroondas()[produtoSelecionado].getNome() + " ?");
				tipoProduto = 5;
				break;
			case 6:
				produtoComprado = dados.getlavaLoucas()[produtoSelecionado];
				perguntaProduto =  new JLabel("Deseja selecionar esse produto " + dados.getlavaLoucas()[produtoSelecionado].getNome() + " ?");
				tipoProduto = 6;
				break;
		}
		
		comprarProduto = new JButton("Sim");
		naoComprarProduto = new JButton("Não");
		perguntaCliente.setFont(new Font("Calibri", Font.BOLD, 16));
		perguntaCliente.setBounds(50, 10, 250, 30);
		
		if(perguntaProduto != null) {
			perguntaProduto.setFont(new Font("Calibri", Font.BOLD, 16));
			perguntaProduto.setBounds(50, 10, 350, 30);
		}
		
		comprarProduto.setBounds(50, 60, 100, 30);
		naoComprarProduto.setBounds(190, 60, 100, 30);
		
		if(opcao == 1) {
			janela.add(perguntaCliente);
			janela.setSize(360, 150);
		}
			
		if (opcao == 2) {
			janela.add(perguntaProduto);
			janela.setSize(400, 150);
		}
		janela.add(comprarProduto);
		janela.add(naoComprarProduto);
		janela.setLayout(null);
		janela.setVisible(true); 
		
		comprarProduto.addActionListener(this);
		naoComprarProduto.addActionListener(this);
		
	}
	
	/**
	 * Confirma o produto selecionado
	 * @param opcao, representa se o usuário está escolhendo um produto ou cliente
	 * (1) cliente
	 * (2) produto
	 * @param clienteSelecionado, presenta a posição do cliente escolhido na JList
	 * @param produtoSelecionado, presenta a posição do produto escolhido na JList
	 * @param controlSelecionado, representa o tipo de produto selecionado na TelaComprarProduto
	 */
	public void mostrarTela(int opcao, int clienteSelecionado, int produtoSelecionado, int controlSelecionado , ControlDados dados) {
		this.produtoSelecionado = produtoSelecionado;
		this.controlSelecionado = controlSelecionado;
		this.mostrarTela(opcao, clienteSelecionado,dados);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Sim, vai para os produtos
		if(e.getSource() == comprarProduto && opcao == 1) {
			
			janela.dispose();
			new TelaComprarProduto().mostrarDados(clienteSelecionado,dados);
		}
		
		//Sim, finaliza a compra
		if(e.getSource() == comprarProduto && opcao == 2) {
			dados.getCliente()[clienteSelecionado].addCarrinho(produtoComprado.getNome(),
					dados.getCliente()[clienteSelecionado].getQtdProdutosCarrinho());
			janela.dispose();
			
			new TelaQtdCompras().mostrarTela(produtoSelecionado, tipoProduto, dados);
				
		}
		
		//Não
		if(e.getSource() == naoComprarProduto) 
			janela.dispose();

	}

}
