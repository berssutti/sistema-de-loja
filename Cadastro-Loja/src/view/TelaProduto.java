package view;
/**
 * Implementa uma interface que mostra os produtos cadastrados no sistema
 * @author Bernardo Pissutti
 * @version 1.0
 */
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
	private ControlDados dados;
	private String[] listaNomes = new String[50];
	/**
	 * Mostra os produtos cadastrados através de uma JList
	 * @param dados, acessar os dados dos produtos
	 * @param op, representa a opcao de tipo de produto escolhido pelo usuário
	 * @return void
	 */
	public void mostrarProdutos(ControlDados dados, int op){
		this.dados = dados;

		switch (op) {
		case 1:// Mostrar dados de Armarios cadastrados (JList)
			listaNomes = new ControlCadeira(dados).getNomeCadeira();
			listaCadeirasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Cadeiras");
			titulo = new JLabel("Cadeiras Cadastrados");
			cadastroCadeira = new JButton("Cadastrar");
			refreshCadeira = new JButton("Atualizar");

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

		case 2:// Mostrar dados de Mesas cadastradas 
			listaNomes = new ControlMesa(dados).getNomeMesa();
			listaMesasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Mesaessores");
			titulo = new JLabel("Mesaessores Cadastrados");
			cadastroMesa = new JButton("Cadastrar");
			refreshMesa = new JButton("Atualizar");

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
		case 3:// Mostrar dados de Armarios cadastradas 
			listaNomes = new ControlArmario(dados).getNomeArmario();
			listaArmariosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Armarios");
			titulo = new JLabel("Armarios Cadastrados");
			cadastroArmario = new JButton("Cadastrar");
			refreshArmario = new JButton("Atualizar");

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
		case 4:// Mostrar dados de Geladeiras cadastradas 
			listaNomes = new ControlGeladeira(dados).getNomeGeladeira();
			listaGeladeirasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Geladeiras");
			titulo = new JLabel("Geladeiras Cadastrados");
			cadastroGeladeira = new JButton("Cadastrar");
			refreshGeladeira = new JButton("Atualizar");

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
		case 5:// Mostrar dados de Microondas cadastradas 
			listaNomes = new ControlMicroondas(dados).getNomeMicroondas();
			listaMicroondasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Microondass");
			titulo = new JLabel("Microondass Cadastrados");
			cadastroMicroondas = new JButton("Cadastrar");
			refreshMicroondas = new JButton("Atualizar");

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
		case 6:// Mostrar dados de Lava Louças cadastradas 
			listaNomes = new ControlLavaLoucas(dados).getNomeLavaLoucas();
			listaLavaLoucasCadastradas = new JList<String>(listaNomes);
			janela = new JFrame("Lava Louças");
			titulo = new JLabel("Lava Louças Cadastradas");
			cadastroLavaLoucas = new JButton("Cadastrar");
			refreshLavaLoucas = new JButton("Atualizar");

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
		
		//Cadastro de nova cadeira
		if(e.getSource() == cadastroCadeira)
			new TelaDetalheProduto().cadastrarEditarProduto(1, dados, this, 0);

		//Cadastro de nova mesa
		if(e.getSource() == cadastroMesa)
			new TelaDetalheProduto().cadastrarEditarProduto(2, dados, this, 0);
		
		//Cadastro de novo armario
		if(e.getSource() == cadastroArmario)
			new TelaDetalheProduto().cadastrarEditarProduto(3, dados, this, 0);

		//Cadastro de nova geladeira
		if(e.getSource() == cadastroGeladeira)
			new TelaDetalheProduto().cadastrarEditarProduto(4, dados, this, 0);
		
		//Cadastro de nova microondas
		if(e.getSource() == cadastroMicroondas)
			new TelaDetalheProduto().cadastrarEditarProduto(5, dados, this, 0);

		//Cadastro de novo lava louças
		if(e.getSource() == cadastroLavaLoucas)
			new TelaDetalheProduto().cadastrarEditarProduto(6, dados, this, 0);
		

		// Atualiza a lista de nomes de produtos mostrada no JList
		if(e.getSource() == refreshCadeira) {
			listaCadeirasCadastradas.setListData(new ControlCadeira(dados).getNomeCadeira());			
			listaCadeirasCadastradas.updateUI();
		}

		// Atualiza a lista de nomes de produtos mostrada no JList
		if(e.getSource() == refreshMesa) {
			listaMesasCadastradas.setListData(new ControlMesa(dados).getNomeMesa());
			listaMesasCadastradas.updateUI();
		}
		if(e.getSource() == refreshArmario) {
			listaArmariosCadastrados.setListData(new ControlArmario(dados).getNomeArmario());			
			listaArmariosCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de produtos mostrada no JList
		if(e.getSource() == refreshGeladeira) {
			listaGeladeirasCadastradas.setListData(new ControlGeladeira(dados).getNomeGeladeira());
			listaGeladeirasCadastradas.updateUI();
		}
		
		// Atualiza a lista de nomes de produtos mostrada no JList
		if(e.getSource() == refreshMicroondas) {
			listaMicroondasCadastrados.setListData(new ControlMicroondas(dados).getNomeMicroondas());			
			listaMicroondasCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de produtos mostrada no JList
		if(e.getSource() == refreshLavaLoucas) {
			listaLavaLoucasCadastradas.setListData(new ControlLavaLoucas(dados).getNomeLavaLoucas());
			listaLavaLoucasCadastradas.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaCadeirasCadastradas) {
			new TelaDetalheProduto().cadastrarEditarProduto(7, dados, this, 
					listaCadeirasCadastradas.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaMesasCadastradas) {
			new TelaDetalheProduto().cadastrarEditarProduto(8, dados, this, 
					listaMesasCadastradas.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaArmariosCadastrados) {
			new TelaDetalheProduto().cadastrarEditarProduto(9, dados, this, 
					listaArmariosCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaGeladeirasCadastradas) {
			new TelaDetalheProduto().cadastrarEditarProduto(10, dados, this, 
					listaGeladeirasCadastradas.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaMicroondasCadastrados) {
			new TelaDetalheProduto().cadastrarEditarProduto(11, dados, this, 
					listaMicroondasCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaLavaLoucasCadastradas) {
			new TelaDetalheProduto().cadastrarEditarProduto(12, dados, this, 
					listaLavaLoucasCadastradas.getSelectedIndex());
		}
	}

}
