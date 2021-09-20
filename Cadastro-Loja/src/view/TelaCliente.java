package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaCliente implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private static ControlDados dados;
	private JList<String> listaClientesCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(){

			listaNomes = new ControlCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");

			titulo.setFont(new Font("Calibri", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 177, 100, 30);
			refreshCliente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaClientesCadastrados);
			janela.add(cadastroCliente);
			janela.add(refreshCliente);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);
	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() && e.getSource() == listaClientesCadastrados) {
			new TelaDetalheCliente();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Cadastro de novo cliente
		if(e.getSource() == cadastroCliente)
			new TelaDetalheCliente();
		
		// Atualiza a lista de nomes de cliente mostrada no JList
		if(e.getSource() == refreshCliente) {
			listaClientesCadastrados.setListData(new ControlCliente(dados).getNomeCliente());		
			listaClientesCadastrados.updateUI();
		}
		
	}
}