package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaConfirmacao implements ActionListener {
	
	private JFrame janela;
	private JLabel perguntaCliente;
	private JLabel perguntaProduto;
	private JButton comprarProduto;
	private JButton naoComprarProduto;
	int opcao;
	
	public void mostrarTela(int opcao) {
		
		this.opcao = opcao;
		
		janela = new JFrame("Confirmação");
		perguntaCliente = new JLabel("Deseja selecionar esse cliente ?");
		perguntaProduto =  new JLabel("Deseja selecionar esse produto ?");
		comprarProduto = new JButton("Sim");
		naoComprarProduto = new JButton("Não");
		
		perguntaCliente.setFont(new Font("Calibri", Font.BOLD, 16));
		perguntaCliente.setBounds(70, 10, 250, 30);
		perguntaProduto.setFont(new Font("Calibri", Font.BOLD, 16));
		perguntaProduto.setBounds(70, 10, 250, 30);
		comprarProduto.setBounds(50, 60, 100, 30);
		naoComprarProduto.setBounds(190, 60, 100, 30);
		
		if(opcao == 1)
			janela.add(perguntaCliente);
			
		if (opcao == 2) 
			janela.add(perguntaProduto);
		
		janela.add(comprarProduto);
		janela.add(naoComprarProduto);
		janela.setLayout(null);
		janela.setSize(350, 150);
		janela.setVisible(true); 
		
		comprarProduto.addActionListener(this);
		naoComprarProduto.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Sim, vai para os produtos
		if(e.getSource() == comprarProduto && opcao == 1) {
			new TelaComprarProduto().mostrarDados();
		}
		//Sim, finaliza a compra
		if(e.getSource() == comprarProduto && opcao == 2) {
			new TelaCompraFinalizada().mostrarTela();
		}
		
		
		//Não
		if(e.getSource() == naoComprarProduto) 
			janela.dispose();

	}

}
