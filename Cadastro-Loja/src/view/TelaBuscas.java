package view;

/**
 * Implementa uma interface para buscar o cliente ou funcionario
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021]
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import control.*;

public class TelaBuscas implements ActionListener{
	
	private JFrame janela;
	private JLabel tituloCliente;
	private JLabel tituloFuncionario;
	private JTextField valorCpfCliente;
	private JTextField valorCpfFuncionario;
	private JButton butao;
	private ControlDados dados;
	private int cliente;
	private int funcionario;
	int opcao;
	/**
	 * Permite o usuario digitar o cpf que deseja procurar
	 * @param opcao define se o usuario que procurar por um cliente ou um funcionario
	 * (1) opcao = 1 cliente
	 * (2) opcao = 2 funcionario

	 */
	public void mostrarTela(int opcao, ControlDados dados){
		// opcao 1 = cliente
		// opcao 2 = funcionario
		this.dados = dados;
		this.opcao = opcao;
		janela = new JFrame("Buscas");
		tituloCliente = new JLabel("Digita o CPF do Cliente que deseja buscar");
		tituloFuncionario = new JLabel("Digite o CPF do Funcionario que deseja buscar");
		valorCpfCliente =  new JTextField(200);
		valorCpfFuncionario = new JTextField(200);
		butao = new JButton("Buscar");
		 
		tituloCliente.setBounds(30, 10, 350, 30);
		tituloFuncionario.setBounds(15, 10, 350, 30);
		valorCpfCliente.setBounds(115, 60, 90, 25);
		valorCpfFuncionario.setBounds(115, 60, 90, 25);
		butao.setBounds(230, 80, 90, 30);
		tituloCliente.setFont(new Font("Calibri", Font.BOLD, 16));
		tituloFuncionario.setFont(new Font("Calibri", Font.BOLD, 16));
		
		janela.setLayout(null);
		
		if(opcao == 1) {
			janela.add(tituloCliente);
			janela.add(valorCpfCliente);
			
		}
		else {
			janela.add(tituloFuncionario);
			janela.add(valorCpfFuncionario);
		}
		janela.add(butao);
		janela.setSize(350,150);
		janela.setVisible(true);

		butao.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == butao) {
			if(opcao == 1) { //mostra tela para busca de cliente
				String cpfCliente = valorCpfCliente.getText();
				cliente = dados.encontraCpfCliente(cpfCliente);
				new TelaMostrarBuscas().mostrarTela(1,cliente,dados);
			}
			else { //mostra tela para busca de funcionario
				String cpfFuncionario = valorCpfFuncionario.getText();
				funcionario = dados.encontraCpfFuncionario(cpfFuncionario);
				new TelaMostrarBuscas().mostrarTela(2,funcionario,dados);
			}
		}
		
	}
	
	
}
