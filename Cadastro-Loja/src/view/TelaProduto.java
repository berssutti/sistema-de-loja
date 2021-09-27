package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.*;

public class TelaProduto implements ActionListener, ListSelectionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCadeira;
	private JButton refreshCadeira;
	private JButton cadastroArmario;
	private JButton refreshArmario;
	private JButton cadastroMesa;
	private JButton refreshMesa;
	private JButton cadastroMicroondas;
	private JButton refreshMicroondas;
	private JButton cadastroLavaLoucas;
	private JButton refreshLavaLoucas;
	private JButton cadastroGeladeira;
	private JButton refreshGeladeira;
	private JList<String> listaCadeirasCadastradas;
	private JList<String> listaArmariosCadastrados;
	private JList<String> listaMesasCadastradas;
	private JList<String> listaMicroondasCadastrados;
	private JList<String> listaGeladeirasCadastradas;
	private JList<String> listaLavaLoucasCadastradas;
	private static ControlDados dados;
	private String[] listaNomes = new String[50];

	public void mostrarProdutos(ControlDados dados, int op){
		this.dados = dados;

		switch (op) {
		case 1:// Mostrar dados de Armarios cadastrados (JList)
			listaNomes = new ControlCadeira(dados).getNomeCadeira();
			listaCadeirasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Cadeiras");
			titulo = new JLabel("Cadeiras Cadastrados");
			cadastroCadeira = new JButton("Cadastrar");
			refreshCadeira = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaCadeirasCadastradas.setBounds(20, 50, 350, 120);
			listaCadeirasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaCadeirasCadastradas.setVisibleRowCount(10);

			cadastroCadeira.setBounds(70, 177, 100, 30);
			refreshCadeira.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaCadeirasCadastradas);
			janela.add(cadastroCadeira);
			janela.add(refreshCadeira);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCadeira.addActionListener(this);
			refreshCadeira.addActionListener(this);
			listaCadeirasCadastradas.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de Mesaessores cadastrados (JList)
			listaNomes = new ControlMesa(dados).getNomeMesa();
			listaMesasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Mesaessores");
			titulo = new JLabel("Mesaessores Cadastrados");
			cadastroMesa = new JButton("Cadastrar");
			refreshMesa = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaMesasCadastradas.setBounds(20, 50, 350, 120);
			listaMesasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMesasCadastradas.setVisibleRowCount(10);


			cadastroMesa.setBounds(70, 177, 100, 30);
			refreshMesa.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaMesasCadastradas);
			janela.add(cadastroMesa);
			janela.add(refreshMesa);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroMesa.addActionListener(this);
			refreshMesa.addActionListener(this);
			listaMesasCadastradas.addListSelectionListener(this);
			break;
		case 3:
			listaNomes = new ControlArmario(dados).getNomeArmario();
			listaArmariosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Armarios");
			titulo = new JLabel("Armarios Cadastrados");
			cadastroArmario = new JButton("Cadastrar");
			refreshArmario = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaArmariosCadastrados.setBounds(20, 50, 350, 120);
			listaArmariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmariosCadastrados.setVisibleRowCount(10);

			cadastroArmario.setBounds(70, 177, 100, 30);
			refreshArmario.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaArmariosCadastrados);
			janela.add(cadastroArmario);
			janela.add(refreshArmario);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroArmario.addActionListener(this);
			refreshArmario.addActionListener(this);
			listaArmariosCadastrados.addListSelectionListener(this);
			break;
		case 4:
			listaNomes = new ControlGeladeira(dados).getNomeGeladeira();
			listaGeladeirasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Geladeiras");
			titulo = new JLabel("Geladeiras Cadastrados");
			cadastroGeladeira = new JButton("Cadastrar");
			refreshGeladeira = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaGeladeirasCadastradas.setBounds(20, 50, 350, 120);
			listaGeladeirasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaGeladeirasCadastradas.setVisibleRowCount(10);

			cadastroGeladeira.setBounds(70, 177, 100, 30);
			refreshGeladeira.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaGeladeirasCadastradas);
			janela.add(cadastroGeladeira);
			janela.add(refreshGeladeira);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroGeladeira.addActionListener(this);
			refreshGeladeira.addActionListener(this);
			listaGeladeirasCadastradas.addListSelectionListener(this);
			break;
		case 5:
			listaNomes = new ControlMicroondas(dados).getNomeMicroondas();
			listaMicroondasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Microondass");
			titulo = new JLabel("Microondass Cadastrados");
			cadastroMicroondas = new JButton("Cadastrar");
			refreshMicroondas = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaMicroondasCadastrados.setBounds(20, 50, 350, 120);
			listaMicroondasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMicroondasCadastrados.setVisibleRowCount(10);

			cadastroMicroondas.setBounds(70, 177, 100, 30);
			refreshMicroondas.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaMicroondasCadastrados);
			janela.add(cadastroMicroondas);
			janela.add(refreshMicroondas);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroMicroondas.addActionListener(this);
			refreshMicroondas.addActionListener(this);
			listaMicroondasCadastrados.addListSelectionListener(this);
			break;
		case 6:
			listaNomes = new ControlLavaLoucas(dados).getNomeLavaLoucas();
			listaLavaLoucasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("LavaLoucass");
			titulo = new JLabel("LavaLoucass Cadastrados");
			cadastroLavaLoucas = new JButton("Cadastrar");
			refreshLavaLoucas = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaLavaLoucasCadastradas.setBounds(20, 50, 350, 120);
			listaLavaLoucasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLavaLoucasCadastradas.setVisibleRowCount(10);

			cadastroLavaLoucas.setBounds(70, 177, 100, 30);
			refreshLavaLoucas.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLavaLoucasCadastradas);
			janela.add(cadastroLavaLoucas);
			janela.add(refreshLavaLoucas);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroLavaLoucas.addActionListener(this);
			refreshLavaLoucas.addActionListener(this);
			listaLavaLoucasCadastradas.addListSelectionListener(this);
			break;
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		
		//Cadastro de novo aluno
		if(e.getSource() == cadastroCadeira)
			new TelaDetalheProduto().inserirEditar(1, dados, this, 0);

		//Cadastro de novo professor
		if(e.getSource() == cadastroMesa)
			new TelaDetalheProduto().inserirEditar(2, dados, this, 0);
		
		if(e.getSource() == cadastroArmario)
			new TelaDetalheProduto().inserirEditar(3, dados, this, 0);

		//Cadastro de novo professor
		if(e.getSource() == cadastroGeladeira)
			new TelaDetalheProduto().inserirEditar(4, dados, this, 0);
		
		if(e.getSource() == cadastroMicroondas)
			new TelaDetalheProduto().inserirEditar(5, dados, this, 0);

		//Cadastro de novo professor
		if(e.getSource() == cadastroLavaLoucas)
			new TelaDetalheProduto().inserirEditar(6, dados, this, 0);
		

		// Atualiza a lista de nomes de alunos mostrada no JList
		if(e.getSource() == refreshCadeira) {
			listaCadeirasCadastradas.setListData(new ControlCadeira(dados).getNomeCadeira());			
			listaCadeirasCadastradas.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if(e.getSource() == refreshMesa) {
			listaMesasCadastradas.setListData(new ControlMesa(dados).getNomeMesa());
			listaMesasCadastradas.updateUI();
		}
		if(e.getSource() == refreshArmario) {
			listaArmariosCadastrados.setListData(new ControlArmario(dados).getNomeArmario());			
			listaArmariosCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if(e.getSource() == refreshGeladeira) {
			listaGeladeirasCadastradas.setListData(new ControlGeladeira(dados).getNomeGeladeira());
			listaGeladeirasCadastradas.updateUI();
		}
		if(e.getSource() == refreshMicroondas) {
			listaMicroondasCadastrados.setListData(new ControlMicroondas(dados).getNomeMicroondas());			
			listaMicroondasCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if(e.getSource() == refreshLavaLoucas) {
			listaLavaLoucasCadastradas.setListData(new ControlLavaLoucas(dados).getNomeLavaLoucas());
			listaLavaLoucasCadastradas.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaCadeirasCadastradas) {
			new TelaDetalheProduto().inserirEditar(3, dados, this, 
					listaCadeirasCadastradas.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaMesasCadastradas) {
			new TelaDetalheProduto().inserirEditar(4, dados, this, 
					listaMesasCadastradas.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaArmariosCadastrados) {
			new TelaDetalheProduto().inserirEditar(3, dados, this, 
					listaArmariosCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaGeladeirasCadastradas) {
			new TelaDetalheProduto().inserirEditar(4, dados, this, 
					listaGeladeirasCadastradas.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaMicroondasCadastrados) {
			new TelaDetalheProduto().inserirEditar(3, dados, this, 
					listaMicroondasCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaLavaLoucasCadastradas) {
			new TelaDetalheProduto().inserirEditar(4, dados, this, 
					listaLavaLoucasCadastradas.getSelectedIndex());
		}
	}

}
