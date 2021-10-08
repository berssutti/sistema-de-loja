package view;
/**
 * Implementa uma interface que mostra o menu principal
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021]
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import control.ControlDados;

public class TelaMenu implements ActionListener{

	private JFrame janela = new JFrame("Sistema Loja");
	private JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionario");
	private static JButton produto = new JButton("Produto");
	private static JButton carrinho = new JButton("Carrinho");
	private static JButton buscaCliente = new JButton("Buscar Cliente");
	private static JButton buscaFuncionario = new JButton("Buscar Funcionario");
	private ControlDados dados = new ControlDados();
	/**
	 * Cria a tela do menu do sistema
	 */
	public TelaMenu() {
		titulo.setFont(new Font("Calibri", Font.BOLD, 20));
		titulo.setBounds(140, 10, 150, 30);
		cliente.setBounds(140, 50, 120, 30);
		funcionario.setBounds(140, 100, 120, 30);
		produto.setBounds(140, 150, 120, 30);
		carrinho.setBounds(140, 200, 120, 30);
		buscaFuncionario.setBounds(45, 250, 150, 30);
		buscaCliente.setBounds(200, 250, 150, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(produto);
		janela.add(carrinho);
		janela.add(buscaCliente);
		janela.add(buscaFuncionario);
		
		janela.setSize(400, 360);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	/**
	 * Instacia os ActioListener para os butões do menu
	 * @param args
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		produto.addActionListener(menu);
		carrinho.addActionListener(menu);
		buscaCliente.addActionListener(menu);
		buscaFuncionario.addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cliente)
			new TelaCliente().mostrarDados(dados);
		
		 if(e.getSource() == funcionario) 
			new TelaFuncionario().mostrarDados(dados);
		 
		 if(e.getSource() == produto) 
			new TelaMenuProduto().mostrarProdutos(dados);
		 
		 if(e.getSource() == carrinho) 
			new TelaCarrinho().mostrarDados(dados);
		 
		 if(e.getSource() == buscaCliente)
			new TelaBuscas().mostrarTela(1,dados);
		 
		 if(e.getSource() == buscaFuncionario)
			 new TelaBuscas().mostrarTela(2,dados);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
