package view;

import control.*;
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

public class TelaFuncionario implements ActionListener, ListSelectionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroFuncionario;
	private JButton refreshFuncionario;
	private ControlDados dados;
	private JList<String> listaFuncionariosCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControlDados dados){
		
		this.dados = dados;
		
		listaNomes = new ControlFuncionario(dados).getNomeFuncionario();
		listaFuncionariosCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Funcionarios");
		titulo = new JLabel("Funcionario Cadastrados");
		cadastroFuncionario = new JButton("Cadastrar");
		refreshFuncionario = new JButton("Refresh");
		
		titulo.setFont(new Font("Calibri", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaFuncionariosCadastrados.setBounds(20, 50, 350, 120);
		listaFuncionariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaFuncionariosCadastrados.setVisibleRowCount(10);
		
		cadastroFuncionario.setBounds(70, 177, 100, 30);
		refreshFuncionario.setBounds(200, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaFuncionariosCadastrados);
		janela.add(cadastroFuncionario);
		janela.add(refreshFuncionario);
		janela.setSize(400, 300);
		janela.setVisible(true);

		cadastroFuncionario.addActionListener(this);
		refreshFuncionario.addActionListener(this);
		listaFuncionariosCadastrados.addListSelectionListener(this);
	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() && e.getSource() == listaFuncionariosCadastrados) {
			new TelaDetalheFuncionario().inserirEditar(2, dados, this, 
					listaFuncionariosCadastrados.getSelectedIndex());
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Cadastro de novo Funcionario
		if(e.getSource() == cadastroFuncionario)
			new TelaDetalheFuncionario().inserirEditar(1, dados, this, 0);
		
		// Atualiza a lista de nomes de Funcionario mostrada no JList
		if(e.getSource() == refreshFuncionario) {
			listaFuncionariosCadastrados.setListData(new ControlFuncionario(dados).getNomeFuncionario());		
			listaFuncionariosCadastrados.updateUI();
		}
		
	}

}
