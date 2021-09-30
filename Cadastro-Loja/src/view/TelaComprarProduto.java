package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ControlDados;

public class TelaComprarProduto implements ActionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadeira;
	private JButton mesa;
	private JButton armario;
	private JButton microondas;
	private JButton geladeira;
	private JButton lavaLoucas;
	public static ControlDados dados = new ControlDados();
	
	public void mostrarDados() {
		
		janela = new JFrame("Produtos");
		titulo = new JLabel("Escolha um opção para ver os produtos");
		cadeira = new JButton("Cadeira");
		mesa = new JButton("Mesa");
		armario = new JButton("Armario");
		microondas = new JButton("microondas");
		geladeira = new JButton("geladeira");
		lavaLoucas = new JButton("Lava Louças");
		
		janela.setLayout(null);
		
		titulo.setFont(new Font("Calibri", Font.BOLD, 16));
		titulo.setBounds(60, 10, 350, 40);
		cadeira.setBounds(130, 50, 135, 20);
		mesa.setBounds(130, 80, 135, 20);
		armario.setBounds(130, 110, 135, 20);
		geladeira.setBounds(130, 140, 135, 20);
		microondas.setBounds(130, 170, 135, 20);
		lavaLoucas.setBounds(130, 200, 135, 20);
		
		janela.add(titulo);
		janela.add(cadeira);
		janela.add(mesa);
		janela.add(armario);
		janela.add(microondas);
		janela.add(geladeira);
		janela.add(lavaLoucas);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
		cadeira.addActionListener(this);
		mesa.addActionListener(this);
		armario.addActionListener(this);
		microondas.addActionListener(this);
		geladeira.addActionListener(this);
		lavaLoucas.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Mostra tela do produto
				if(e.getSource() == cadeira)
					new TelaEscolherProduto().mostrarProdutos(dados,1);
				
				//Mostra tela do produto
				if(e.getSource() == mesa)
					new TelaEscolherProduto().mostrarProdutos(dados,2);
				
				//Mostra tela do produto
				if(e.getSource() == armario)
					new TelaEscolherProduto().mostrarProdutos(dados,3);
				
				//Mostra tela do produto
				if(e.getSource() == geladeira)
					new TelaEscolherProduto().mostrarProdutos(dados,4);
				
				//Mostra tela do produto
				if(e.getSource() == microondas)
					new TelaEscolherProduto().mostrarProdutos(dados,5);
				
				//Mostra tela do produto
				if(e.getSource() == lavaLoucas)
					new TelaEscolherProduto().mostrarProdutos(dados,6);
		
	}
}
