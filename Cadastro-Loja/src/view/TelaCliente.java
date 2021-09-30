package view;

import control.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaCliente implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel tituloCliente;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private ControlDados dados;
	private JList<String> listaClientesCadastrados;
	private String[] listaNomes = new String[50];


	public void mostrarDados(ControlDados dados){
		
		this.dados = dados;

		
		listaNomes = new ControlCliente(dados).getNomeCliente();
		listaClientesCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Clientes");
		tituloCliente = new JLabel("Clientes Cadastrados");
		cadastroCliente = new JButton("Cadastrar");
		refreshCliente = new JButton("Atualizar");
		tituloCliente.setFont(new Font("Calibri", Font.BOLD, 18));
		tituloCliente.setBounds(120, 10, 250, 30);
		listaClientesCadastrados.setBounds(20, 50, 350, 120);
		listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaClientesCadastrados.setVisibleRowCount(10);
		cadastroCliente.setBounds(70, 177, 100, 30);
		refreshCliente.setBounds(200, 177, 100, 30);
		janela.setLayout(null);

		janela.add(tituloCliente);
		janela.add(cadastroCliente);
		janela.add(refreshCliente);
		janela.add(listaClientesCadastrados);
		janela.setSize(400, 300);
		janela.setVisible(true);

		cadastroCliente.addActionListener(this);
		refreshCliente.addActionListener(this);
		listaClientesCadastrados.addListSelectionListener(this);
	
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() && e.getSource() == listaClientesCadastrados) {
			new TelaDetalheCliente().inserirEditar(2, dados, this, 
					listaClientesCadastrados.getSelectedIndex());
		}
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Cadastro de novo cliente
		if(e.getSource() == cadastroCliente)
			new TelaDetalheCliente().inserirEditar(1, dados, this, 0);
		
		// Atualiza a lista de nomes de cliente mostrada no JList
		if(e.getSource() == refreshCliente) {
			listaClientesCadastrados.setListData(new ControlCliente(dados).getNomeCliente());		
			listaClientesCadastrados.updateUI();
		}
		
	}
}
