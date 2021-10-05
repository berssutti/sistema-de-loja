package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import control.*;
public class TelaMostrarBuscas {

	private JFrame janela = new JFrame("Resultado Buscas");
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelRG = new JLabel("RG: ");
	private JTextField valorRG;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JLabel labelCargo = new JLabel("Cargo: ");
	private JTextField valorCargo;
	private JLabel labelSalario = new JLabel("Salario: ");
	private JTextField valorSalario;
	private ControlDados dados;
	private JList<String> produtosComprados;
	
	public void mostrarTela(int opcao, String CPF) {
		
		valorNome = new JTextField(dados.getFuncionario()[posicao].getNome(), 200);
		valorCPF = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getCpf()), 200);
		valorRG = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getRg()), 200);
		valorDDD = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getNumero().getDdd()), 3);
		valorTelefone = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getNumero().getNumero()), 10);
	
		if(opcao == 2) {
			valorCargo = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getCargo()), 200);
			valorSalario = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getSalario()), 200);
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
		labelCargo.setBounds(30, 110, 150, 25);
		valorCargo.setBounds(180, 110, 180, 25);
		labelSalario.setBounds(30, 140, 150, 25);
		valorSalario.setBounds(180, 140, 180, 25);
		
		if(opcao == 2) {
			this.janela.add(labelCargo);
			this.janela.add(valorCargo);
			this.janela.add(labelSalario);
			this.janela.add(valorSalario);
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
	}
	
}