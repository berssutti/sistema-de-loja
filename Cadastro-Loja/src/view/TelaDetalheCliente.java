package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.*;

public class TelaDetalheCliente implements ActionListener{
	
	private JFrame janela;
	private JList<String> produtosComprados;
	private JLabel compras;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelRG = new JLabel("RG: ");
	private JTextField valorRG;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private ControlDados dados;
	private int posicao;
	private int opcao;
	private String s;
	private String[] listaNomesProdutos;
	
	public void cadastrarEditar(int opcao, ControlDados dados, 
			TelaCliente cliente, int posicao) {
		
		this.opcao = opcao;
		this.posicao = posicao;
		this.dados = dados;
		listaNomesProdutos = dados.getCliente()[posicao].getCarrinho();
		
		if (opcao == 1) s = "Cadastro de Cliente";
		if (opcao == 2) s = "Detalhe de Cliente";
		
		janela = new JFrame(s);
		
		if (opcao == 2) {
			
			produtosComprados = new JList<String>(listaNomesProdutos);
			compras = new JLabel("Produtos Comprados");
			valorNome = new JTextField(dados.getCliente()[posicao].getNome(), 200);
			valorCPF = new JTextField(String.valueOf(dados.getCliente()[posicao].getCpf()), 200);
			valorRG = new JTextField(String.valueOf(dados.getCliente()[posicao].getRg()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getCliente()[posicao].getNumero().getDdd()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getCliente()[posicao].getNumero().getNumero()), 10);
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorCPF = new JTextField(200);
			valorRG = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);	
		labelCPF.setBounds(30, 50, 150, 25);
		valorCPF.setBounds(180, 50, 180, 25);
		labelRG.setBounds(30, 80, 150, 25);
		valorRG.setBounds(180, 80, 180, 25);
		labelTelefone.setBounds(30, 110, 150, 25);
		valorDDD.setBounds(180, 110, 28, 25);
		valorTelefone.setBounds(210, 110, 65, 25);

		//Coloca os campos relacionados ao cliente
		if (opcao == 2 ) {
			compras.setFont(new Font("Calibri", Font.BOLD, 16));
			compras.setBounds(120, 160, 160, 30);
			produtosComprados.setBounds(40, 190, 300, 120);
			botaoSalvar.setBounds(120, 340, 115, 30);
			botaoExcluir.setBounds(245, 340, 115, 30);
			produtosComprados.setVisibleRowCount(10);
			this.janela.add(compras);
			this.janela.add(produtosComprados);
			this.janela.add(botaoExcluir);

		}
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelRG);
		this.janela.add(valorRG);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);
		this.janela.setLayout(null);

		this.janela.setSize(400, 430);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == botaoSalvar) {
			try {
				boolean res = false;
				
				if(opcao == 1) //cadastro de novo cliente
					novoDado[0] = Integer.toString(dados.getQtdCliente());
				
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorCPF.getText();
				novoDado[3] =  valorRG.getText();
				novoDado[4] =  valorDDD.getText();
				novoDado[5] =  valorTelefone.getText();
				
				if (opcao == 1 || opcao == 2) {
					res = dados.cadastrarEditarCliente(novoDado);
				} 
				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		 //exclui cliente
		if(e.getSource() == botaoExcluir) {
			boolean res = false;
			if (opcao == 2) {
				res = dados.deletarCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
			}	
		}
		
	}
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ", null,
				JOptionPane.ERROR_MESSAGE);
		janela.dispose();
	}
	
}
