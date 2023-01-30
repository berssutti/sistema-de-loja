package view;
/**
 * Implementa uma interface para mostrar o resultado da busca, ou pelo cliente ou pelo funcionario
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021]
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	/**
	 * Mostra o resultado da busca
	 * @param opcao, representa a escolha feita pelo usuário
	 * (1) Cliente
	 * (2) Funcionario
	 * @param posicao, representa a posição do funcionario
	 * @param dados, permite acesso aos dados do funcionario
	 */
	public void mostrarTela(int opcao, int posicao, ControlDados dados) {
		
		if(posicao != 10000000) {
			if(opcao == 1 && posicao <= 50 ) {
				valorNome = new JTextField(dados.getCliente()[posicao].getNome(), 200);
				valorCPF = new JTextField(String.valueOf(dados.getCliente()[posicao].getCpf()), 200);
				valorRG = new JTextField(String.valueOf(dados.getCliente()[posicao].getRg()), 200);
				valorDDD = new JTextField(String.valueOf(dados.getCliente()[posicao].getNumero().getDdd()), 3);
				valorTelefone = new JTextField(String.valueOf(dados.getCliente()[posicao].getNumero().getNumero()), 10);
				labelTelefone.setBounds(30, 110, 150, 25);
				valorDDD.setBounds(180, 110, 28, 25);
				valorTelefone.setBounds(210, 110, 65, 25);
			}
	
			if(opcao == 2) {
				valorNome = new JTextField(dados.getFuncionario()[posicao].getNome(), 200);
				valorCPF = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getCpf()), 200);
				valorRG = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getRg()), 200);
				valorDDD = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getNumero().getDdd()), 3);
				valorTelefone = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getNumero().getNumero()), 10);
				valorCargo = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getCargo()), 200);
				valorSalario = new JTextField(String.valueOf(dados.getFuncionario()[posicao].getSalario()), 200);
				labelCargo.setBounds(30, 110, 150, 25);
				valorCargo.setBounds(180, 110, 180, 25);
				labelSalario.setBounds(30, 140, 150, 25);
				valorSalario.setBounds(180, 140, 180, 25);
				labelTelefone.setBounds(30, 170, 150, 25);
				valorDDD.setBounds(180, 170, 28, 25);
				valorTelefone.setBounds(210, 170, 65, 25);
			}
			
			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);	
			labelCPF.setBounds(30, 50, 150, 25);
			valorCPF.setBounds(180, 50, 180, 25);
			labelRG.setBounds(30, 80, 150, 25);
			valorRG.setBounds(180, 80, 180, 25);
		
		
		
			if(opcao == 2) {
				this.janela.add(labelCargo);
				this.janela.add(valorCargo);
				this.janela.add(labelSalario);
				this.janela.add(valorSalario);
			}
			janela.setSize(400,300);
			janela.setLayout(null);
			janela.setVisible(true);
			janela.add(labelNome);
			janela.add(valorNome);
			janela.add(labelCPF);
			janela.add(valorCPF);
			janela.add(labelRG);
			janela.add(valorRG);
			janela.add(labelTelefone);
			janela.add(valorDDD);
			janela.add(valorTelefone);
		} else mensagemErro();
			
		
	}
	
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "O CPF digitado não foi cadastrado!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	
}
