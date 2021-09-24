package view;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.*;

public class TelaProduto implements ActionListener,ListSelectionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroProduto;
	private JButton refreshProduto;
	private ControlDados dados;
	private JList<String> listaProdutosCadastrados;
	private String[] listaNomes = new String[50];
	
	public void mostrarProduto() {
		
		this.dados = dados;
		
		listaNomes = new ControlCliente(dados).getNomeProduto();
		listaProdutosCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Produtos");
		titulo = new JLabel("Produtos Cadastrados");
		cadastroProduto = new JButton("Cadastrar");
		refreshProduto= new JButton("Atualizar");
		
		titulo.setFont(new Font("Calibri", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaProdutosCadastrados.setBounds(20, 50, 350, 120);
		listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaProdutosCadastrados.setVisibleRowCount(10);
		
		cadastroProduto.setBounds(130, 150, 135, 30);
		refreshProduto.setBounds(130, 200, 135, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(listaProdutosCadastrados);
		janela.add(cadastroProduto);
		janela.add(refreshProduto);
		janela.setSize(400, 200);
		janela.setVisible(true);
	
		cadastroProduto.addActionListener(this);
		refreshProduto.addActionListener(this);
		listaProdutosCadastrados.addListSelectionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		//Cadastro de novo Produto
		if(e.getSource() == cadastroProduto)
			new TelaDetalheCliente().inserirEditar(1, dados, this, 0);
		
		// Atualiza a lista de nomes de produtos mostrada no JList
		if(e.getSource() == refreshProduto) {
			listaProdutosCadastrados.setListData(new ControlProduto(dados).getNomeProduto());		
			listaProdutosCadastrados.updateUI();
		}

		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() && e.getSource() == listaProdutosCadastrados) {
			new TelaDetalheProduto().inserirEditar(2, dados, this, 
					listaProdutosCadastrados.getSelectedIndex());
		}
		
	}
	
	




}
