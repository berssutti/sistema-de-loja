package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaBuscas implements ActionListener{
	
	private JFrame janela;
	private JLabel tituloCliente;
	private JLabel tituloFuncionario;
	private JTextField valorCpfCliente;
	private JTextField valorCpfFuncionario;
	private JButton butao;
	int opcao;
	
	public void mostrarTela(int opcao){
		// opcao 1 = cliente
		// opcao 2 = funcionario
		
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
		if(opcao == 1) {
			new TelaMostrarBuscas().mostrarTela(1,valorCpfCliente.getText());
		}
		else {
			new TelaMostrarBuscas().mostrarTela(2,valorCpfFuncionario.getText());
		}
		
	}
	
	
}
