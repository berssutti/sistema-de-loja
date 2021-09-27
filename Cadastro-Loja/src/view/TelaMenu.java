package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import control.ControlDados;

public class TelaMenu implements ActionListener{

	private static JFrame janela = new JFrame("Sistema Loja");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionario");
	private static JButton produto = new JButton("Produto");
	public static ControlDados dados = new ControlDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Calibri", Font.BOLD, 20));
		titulo.setBounds(140, 10, 150, 30);
		cliente.setBounds(140, 50, 120, 30);
		funcionario.setBounds(140, 100, 120, 30);
		produto.setBounds(140, 150, 120, 30);
	
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(produto);
		
		janela.setSize(400, 300);
		//janela.getContentPane().setBackground(new Color(147,112,219));
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		produto.addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cliente)
			new TelaCliente().mostrarDados(dados);
		
		 if(e.getSource() == funcionario) 
			new TelaFuncionario().mostrarDados(dados);
		 
		 if(e.getSource() == produto) 
			new TelaMenuProduto().mostrarProdutos();
		 
	}

}
