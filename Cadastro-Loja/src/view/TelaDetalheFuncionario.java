package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.*;

public class TelaDetalheFuncionario implements ActionListener {
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelRG = new JLabel("RG: ");
	private JTextField valorRG;
	private JLabel labelCargo = new JLabel("Cargo: ");
	private JTextField valorCargo;
	private JLabel labelSalario = new JLabel("Salario: ");
	private JTextField valorSalario;
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
	
	public void inserirEditar(int opcao, ControlDados dados, 
			TelaFuncionario funcionario, int posicao) {
		this.opcao = opcao;
		this.posicao = posicao;
		this.dados = dados;
		
		if (opcao == 1) s = "Cadastro de Funcionario";
		if (opcao == 2) s = "Detalhe de Funcionario";
		
		janela = new JFrame(s);
		
		if (opcao == 2) {
			valorNome = new JTextField(dados.getFuncionario()[posicao].getNome(), 200);
			valorCPF = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getCpf()), 200);
			valorRG = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getRg()), 200);
			valorCargo = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getCargo()), 200);
			valorSalario = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getSalario()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getNumero().getDdd()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getNumero().getNumero()), 10);
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorCPF = new JTextField(200);
			valorRG = new JTextField(200);
			valorCargo = new JTextField(200);
			valorSalario = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 210, 115, 30);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);	
		labelCPF.setBounds(30, 50, 150, 25);
		valorCPF.setBounds(180, 50, 180, 25);
		labelRG.setBounds(30, 80, 150, 25);
		valorRG.setBounds(180, 80, 180, 25);
		labelCargo.setBounds(30, 110, 150, 25);
		valorCargo.setBounds(180, 110, 180, 25);
		labelSalario.setBounds(30, 140, 150, 25);
		valorSalario.setBounds(180, 140, 180, 25);
		labelTelefone.setBounds(30, 170, 150, 25);
		valorDDD.setBounds(180, 170, 28, 25);
		valorTelefone.setBounds(210, 170, 65, 25);
		

		//Coloca os campos relacionados a endereco se cliente
		if (opcao == 2 ) {
			botaoSalvar.setBounds(120, 215, 115, 30);
			botaoExcluir.setBounds(245, 215, 115, 30);
			this.janela.add(botaoExcluir);

		}
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelRG);
		this.janela.add(valorRG);
		this.janela.add(labelCargo);
		this.janela.add(valorCargo);
		this.janela.add(labelSalario);
		this.janela.add(valorSalario);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 300);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == botaoSalvar) {
			try {
				boolean res = false;
				
				if(opcao == 1) //cadastro de novo funcionario
					novoDado[0] = Integer.toString(dados.getQtdFuncionarios());
				
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNome.getText();
				novoDado[2] = valorCPF.getText();
				novoDado[3] = valorRG.getText();
				novoDado[4] = valorCargo.getText();
				novoDado[5] = valorSalario.getText();
				novoDado[6] = valorDDD.getText();
				novoDado[7] = valorTelefone.getText();
				
				if (opcao == 1 || opcao == 2) {
					res = dados.cadastrarEditarFuncionario(novoDado);
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

		if(e.getSource() == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {//exclui funcionario
				res = dados.deletarFuncionario(posicao);
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
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, RG, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}
