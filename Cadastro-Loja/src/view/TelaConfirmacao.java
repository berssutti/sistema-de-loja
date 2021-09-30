package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import control.*;

public class TelaConfirmacao implements ActionListener {
	
	private JFrame janela;
	private JLabel pergunta;
	private JButton comprarProduto;
	private JButton naoComprarProduto;
	private ControlDados dados;
	
	public void mostrarTela() {
		janela = new JFrame("Confirmação");
		pergunta = new JLabel("Deseja selecionar esse cliente ?");
		comprarProduto = new JButton("Sim");
		naoComprarProduto = new JButton("Não");
		
		pergunta.setFont(new Font("Calibri", Font.BOLD, 16));
		pergunta.setBounds(70, 10, 250, 30);
		comprarProduto.setBounds(50, 60, 100, 30);
		naoComprarProduto.setBounds(190, 60, 100, 30);
		
		janela.add(pergunta);
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
		
		//Sim
		if(e.getSource() == comprarProduto) {
			new TelaComprarProduto().inserirEditar(1, dados, this, 0);
		}

		
		//Não
		if(e.getSource() == naoComprarProduto) 
			janela.dispose();

	}

}
