package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TelaCompraFinalizada implements ActionListener {
	private JFrame janela;
	private JLabel mensagem;
	private JButton butao;
	
	public void mostrarTela(){
		
		janela = new JFrame("Finalizar Compra");
		mensagem = new JLabel("Compra Finalizada !");
		butao = new JButton("OK");
		
		mensagem.setFont(new Font("Calibri", Font.BOLD, 16));
		mensagem.setBounds(70, 10, 250, 30);
		butao.setBounds(100, 60, 80, 30);
		janela.setSize(300,150);
		
		janela.setVisible(true);
		janela.add(butao);
		janela.add(mensagem);
		janela.setLayout(null);
		
		butao.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == butao) {
			janela.dispose();
		}
		
	}
}
