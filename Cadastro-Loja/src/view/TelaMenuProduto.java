package view;
/**
 * Implementa uma interface para mostrar os tipos de produtos cadastrados no sistema
 * @autor Bernardo Pissutti
 * @versio 1.0
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import control.*;

public class TelaMenuProduto implements ActionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadeira;
	private JButton mesa;
	private JButton armario;
	private JButton microondas;
	private JButton geladeira;
	private JButton lavaLoucas;
	public static ControlDados dados = new ControlDados();
	
	public void mostrarProdutos() {
	
	
		janela = new JFrame("Produtos");
		titulo = new JLabel("Tipos De Produtos Cadastrados");
		cadeira = new JButton("Cadeira");
		mesa = new JButton("Mesa");
		armario = new JButton("Armario");
		microondas = new JButton("microondas");
		geladeira = new JButton("geladeira");
		lavaLoucas = new JButton("Lava Louças");
		
		titulo.setFont(new Font("Calibri", Font.BOLD, 18));
		titulo.setBounds(90, 10, 250, 40);
		cadeira.setBounds(130, 50, 135, 20);
		mesa.setBounds(130, 80, 135, 20);
		armario.setBounds(130, 110, 135, 20);
		geladeira.setBounds(130, 140, 135, 20);
		microondas.setBounds(130, 170, 135, 20);
		lavaLoucas.setBounds(130, 200, 135, 20);
		
		janela.setLayout(null);
		
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
			new TelaProduto().mostrarProdutos(dados,1);
		
		//Mostra tela do produto
		if(e.getSource() == mesa)
			new TelaProduto().mostrarProdutos(dados,2);
		
		//Mostra tela do produto
		if(e.getSource() == armario)
			new TelaProduto().mostrarProdutos(dados,3);
		
		//Mostra tela do produto
		if(e.getSource() == geladeira)
			new TelaProduto().mostrarProdutos(dados,4);
		
		//Mostra tela do produto
		if(e.getSource() == microondas)
			new TelaProduto().mostrarProdutos(dados,5);
		
		//Mostra tela do produto
		if(e.getSource() == lavaLoucas)
			new TelaProduto().mostrarProdutos(dados,6);
		
	}
	
	

}
