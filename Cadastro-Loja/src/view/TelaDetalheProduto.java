package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.*;

public class TelaDetalheProduto implements ActionListener{
	
	//produto
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelQtdemEstoque = new JLabel("Quatidade em estoque: ");
	private JTextField valorQtdemEstoque;
	private JLabel labelGarantia = new JLabel("Garantia: ");
	private JTextField valorGarantia;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	private JLabel labelID = new JLabel("ID do produto: ");
	private JTextField valorID;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	
	//microondas
	private JLabel labelVolume = new JLabel("Volume: ");
	private JTextField valorVolume;
	private JLabel labelPeso = new JLabel("Peso: ");
	private JTextField valorPeso;
	private JLabel labelVoltagem = new JLabel("Voltagem: ");
	private JTextField valorVoltagem;
	private JLabel labelPotencia = new JLabel("Potencia: ");
	private JTextField valorPotencia;
	private JLabel labelConsumodeEnergia = new JLabel("Comsumo de Energia: ");
	private JTextField valorConsumodeEnergia;

	
	//Mesa
	private JLabel labelMedidas = new JLabel("Medidas: ");
	private JTextField valorMedidas;
	private JLabel laberPesoSuportavel = new JLabel("Peso Suportável: ");
	private JTextField valorPesoSuportavel;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	//private JLabel peso;
	
	//lava loucas
	private JLabel labelQtdServico =  new JLabel("Quantidade de Serviços: ");
	private JTextField valorQtdServico;
	//private JLabel peso;
	//private JLabel voltagem;
	//private JLabel consumodeEnergia;
	
	//geladeira
	//private JLabel volume;
	//private JLabel peso;
	//private JLabel voltagem;
	//private JLabel consumodeEnergia;
	
	//cadeira
	//private JLabel medidas;
	//private JLabel tipo;
	//private JLabel peso;
	//private JLabel pesoSuportavel;
	
	// armario
	private JLabel labelQtdGaveta =  new JLabel("Quantidade de Gavetas: ");
	private JTextField valorQtdGaveta;
	//private JLabel medidas;
	//private JLabel tipo;
	//private JLabel material;
	private JLabel labelQtdPorta =  new JLabel("Quantidade de Portas: ");
	private JTextField valorQtdPorta;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControlDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControlDados dados, 
			TelaProduto p, int pos) {

		opcao = op;
		posicao = pos;
		this.dados = dados;

		if (op == 1) s = "Cadastro de Cadeira";
		if (op == 2) s = "Cadastro de Mesa";
		if (op == 3) s = "Cadastro de Armario";
		if (op == 4) s = "Cadastro de Geladeira";
		if (op == 5) s = "Cadastro de Microondas";
		if (op == 6) s = "Cadastro de LavaLoucas";
		if (op == 7) s = "Detalhe de Cadeira";
		if (op == 8) s = "Detalhe de Mesa";
		if (op == 9) s = "Detalhe de Armario";
		if (op == 10) s = "Detalhe de Geladeira";
		if (op == 11) s = "Detalhe de Microondas";
		if (op == 12) s = "Detalhe de LavaLoucas";

		janela = new JFrame(s);

		
		if (op == 7) { //Preenche dados com dados da cadeira clicada
			valorNome = new JTextField(dados.getCadeira()[pos].getNome(), 200);
			valorQtdemEstoque = new JTextField(String.valueOf(dados.getCadeira()[pos].getQuantidadeemEstoque()),200);
			valorGarantia = new JTextField(dados.getCadeira()[pos].getGarantia(),200);
			valorDescricao = new JTextField(String.valueOf(dados.getCadeira()[pos].getDescricao()), 200);
			valorID = new JTextField(String.valueOf(dados.getCadeira()[pos].getId()), 200);
			valorMarca = new JTextField(String.valueOf(dados.getCadeira()[pos].getMarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getCadeira()[pos].getPreco()), 200);
			valorMedidas = new JTextField(String.valueOf(dados.getCadeira()[pos].getMedidas()), 200);
			valorPesoSuportavel = new JTextField(String.valueOf(dados.getCadeira()[pos].getPesoSuportavel()), 200);
			valorTipo = new JTextField(String.valueOf(dados.getCadeira()[pos].getTipo()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getCadeira()[pos].getPeso()), 200);

		} else if (op == 8) { //Preenche dados com dados da mesa clicada 
			valorNome = new JTextField(dados.getMesa()[pos].getNome(), 200);
			valorQtdemEstoque = new JTextField(String.valueOf(dados.getMesa()[pos].getQuantidadeemEstoque()),200);
			valorGarantia = new JTextField(dados.getMesa()[pos].getGarantia(),200);
			valorDescricao = new JTextField(String.valueOf(dados.getMesa()[pos].getDescricao()), 200);
			valorID = new JTextField(String.valueOf(dados.getMesa()[pos].getId()), 200);
			valorMarca = new JTextField(String.valueOf(dados.getMesa()[pos].getMarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getMesa()[pos].getPreco()), 200);
			valorMedidas = new JTextField(String.valueOf(dados.getMesa()[pos].getMedidas()), 200);
			valorPesoSuportavel = new JTextField(String.valueOf(dados.getMesa()[pos].getPesoSuportavel()), 200);
			valorTipo = new JTextField(String.valueOf(dados.getMesa()[pos].getTipo()), 200);
			valorMaterial = new JTextField(String.valueOf(dados.getMesa()[pos].getMaterial()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getMesa()[pos].getPeso()), 200);

		} else if (op == 9) { //Preenche dados com dados do armario clicado 
			valorNome = new JTextField(dados.getArmario()[pos].getNome(), 200);
			valorQtdemEstoque = new JTextField(String.valueOf(dados.getArmario()[pos].getQuantidadeemEstoque()),200);
			valorGarantia = new JTextField(dados.getArmario()[pos].getGarantia(),200);
			valorDescricao = new JTextField(String.valueOf(dados.getArmario()[pos].getDescricao()), 200);
			valorID = new JTextField(String.valueOf(dados.getArmario()[pos].getId()), 200);
			valorMarca = new JTextField(String.valueOf(dados.getArmario()[pos].getMarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getArmario()[pos].getPreco()), 200);
			valorMedidas = new JTextField(String.valueOf(dados.getArmario()[pos].getMedidas()), 200);
			valorTipo = new JTextField(String.valueOf(dados.getArmario()[pos].getTipo()), 200);
			valorMaterial = new JTextField(String.valueOf(dados.getArmario()[pos].getQrdGaveta()), 200);
			valorQtdPorta = new JTextField(String.valueOf(dados.getArmario()[pos].getQtdPorta()), 200);
			valorQtdGaveta = new JTextField(String.valueOf(dados.getArmario()[pos].getMaterial()), 200);
			
		} else if (op == 10) { //Preenche dados com dados da geladeira clicada 
			valorNome = new JTextField(dados.getGeladeira()[pos].getNome(), 200);
			valorQtdemEstoque = new JTextField(String.valueOf(dados.getGeladeira()[pos].getQuantidadeemEstoque()),200);
			valorGarantia = new JTextField(dados.getGeladeira()[pos].getGarantia(),200);
			valorDescricao = new JTextField(String.valueOf(dados.getGeladeira()[pos].getDescricao()), 200);
			valorID = new JTextField(String.valueOf(dados.getGeladeira()[pos].getId()), 200);
			valorMarca = new JTextField(String.valueOf(dados.getGeladeira()[pos].getMarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getGeladeira()[pos].getPreco()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getGeladeira()[pos].getPeso()), 200);
			valorConsumodeEnergia =  new JTextField(String.valueOf(dados.getGeladeira()[pos].getConsumodeEnergia()), 200);
			valorVolume =  new JTextField(String.valueOf(dados.getGeladeira()[pos].getVolume()), 200);
			valorVoltagem =  new JTextField(String.valueOf(dados.getGeladeira()[pos].getVoltagem()), 200);
			
		} else if (op == 11) { //Preenche dados com dados do microondas clicado 
			valorNome = new JTextField(dados.getMicroondas()[pos].getNome(), 200);
			valorQtdemEstoque = new JTextField(String.valueOf(dados.getMicroondas()[pos].getQuantidadeemEstoque()),200);
			valorGarantia = new JTextField(dados.getMicroondas()[pos].getGarantia(),200);
			valorDescricao = new JTextField(String.valueOf(dados.getMicroondas()[pos].getDescricao()), 200);
			valorID = new JTextField(String.valueOf(dados.getMicroondas()[pos].getId()), 200);
			valorMarca = new JTextField(String.valueOf(dados.getMicroondas()[pos].getMarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getMicroondas()[pos].getPreco()), 200);
			valorVolume = new JTextField(String.valueOf(dados.getMicroondas()[pos].getVolume()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getMicroondas()[pos].getPeso()), 200);
			valorVoltagem = new JTextField(String.valueOf(dados.getMicroondas()[pos].getVoltagem()), 200);
			valorPotencia = new JTextField(String.valueOf(dados.getMicroondas()[pos].getPotencia()), 200);
			valorConsumodeEnergia = new JTextField(String.valueOf(dados.getMicroondas()[pos].getConsumodeEnergia()), 200);

			
		} else if (op == 12) { //Preenche dados com dados da lava loucas clicada 
			valorNome = new JTextField(dados.getlavaLoucas()[pos].getNome(), 200);
			valorQtdemEstoque = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getQuantidadeemEstoque()),200);
			valorGarantia = new JTextField(dados.getlavaLoucas()[pos].getGarantia(),200);
			valorDescricao = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getDescricao()), 200);
			valorID = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getId()), 200);
			valorMarca = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getMarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getPreco()), 200);
			valorQtdServico = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getQtdServico()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getPeso()), 200);
			valorVoltagem = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getVoltagem()), 200);
			valorConsumodeEnergia = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getConsumodeEnergia()), 200);
			
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorQtdemEstoque = new JTextField(200);
			valorDescricao = new JTextField(200);
			valorID = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorGarantia = new JTextField(200);
			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelQtdemEstoque.setBounds(30, 50, 150, 25);
		valorQtdemEstoque.setBounds(180, 50, 180, 25);		
		labelDescricao.setBounds(30, 80, 150, 25);
		valorDescricao.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelMarca.setBounds(30, 140, 150, 25);
		valorMarca.setBounds(180, 140, 180, 25);
		labelPreco.setBounds(30, 170, 150, 25);
		valorPreco.setBounds(180, 170, 180, 25);
		labelGarantia.setBounds(30, 200, 150, 25);
		valorGarantia.setBounds(180, 200, 180, 25);
		
		/*
		 * labelVolume.setBounds(180, 110, 180, 25); valorVolume.setBounds(180, 110,
		 * 180, 25); labelPeso.setBounds(180, 110, 180, 25); valorPeso.setBounds(180,
		 * 110, 180, 25); labelVoltagem.setBounds(180, 110, 180, 25);
		 * valorVoltagem.setBounds(180, 110, 180, 25); labelPotencia.setBounds(180, 110,
		 * 180, 25); valorPotencia.setBounds(180, 110, 180, 25);
		 * labelConsumodeEnergia.setBounds(180, 110, 180, 25);
		 * valorConsumodeEnergia.setBounds(180, 110, 180, 25);
		 * labelMedidas.setBounds(30, 300, 180, 25); valorMedidas.setBounds(180, 300,
		 * 180, 25); laberPesoSuportavel.setBounds(180, 110, 180, 25);
		 * valorPesoSuportavel.setBounds(180, 110, 180, 25); labelTipo.setBounds(180,
		 * 110, 180, 25); valorTipo.setBounds(180, 110, 180, 25);
		 * labelMaterial.setBounds(180, 110, 180, 25); valorMaterial.setBounds(180, 110,
		 * 180, 25); labelQtdServico.setBounds(180, 110, 180, 25);
		 * valorQtdServico.setBounds(180, 110, 180, 25); labelQtdGaveta.setBounds(180,
		 * 110, 180, 25); valorQtdGaveta.setBounds(180, 110, 180, 25);
		 * labelQtdPorta.setBounds(180, 110, 180, 25); valorQtdPorta.setBounds(180, 110,
		 * 180, 25);
		 */
		
		//Coloca os campos relacionados a cadeira
		if (op == 1 || op == 7  ) {
			
			labelMedidas.setBounds(30, 230, 150, 25);
			valorMedidas.setBounds(180, 230, 180, 25);
			labelTipo.setBounds(30, 260, 150, 25);
			valorTipo.setBounds(180, 260, 180, 25);
			labelPeso.setBounds(30, 290, 150, 25);
			valorPeso.setBounds(180, 290, 180, 25);
			laberPesoSuportavel.setBounds(30, 320, 150, 25);
			valorPesoSuportavel.setBounds(180, 320, 180, 25);
			
			this.janela.add(labelMedidas);
			this.janela.add(valorMedidas);
			this.janela.add(labelTipo);
			this.janela.add(valorTipo);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);
			this.janela.add(laberPesoSuportavel);
			this.janela.add(valorPesoSuportavel);

		}

		//Coloca campos relacionados a valor mesa
		if (op == 2 || op == 8 ) {
			labelMedidas.setBounds(30, 230, 150, 25);
			valorMedidas.setBounds(180, 230, 180, 25);
			labelTipo.setBounds(30, 260, 150, 25);
			valorTipo.setBounds(180, 260, 180, 25);
			labelMaterial.setBounds(30, 290, 150, 25);
			valorMaterial.setBounds(180, 290, 180, 25);
			labelPeso.setBounds(30, 320, 150, 25);
			valorPeso.setBounds(180, 320, 180, 25);
			laberPesoSuportavel.setBounds(30, 350, 150, 25);
			valorPesoSuportavel.setBounds(180, 350, 180, 25);

			this.janela.add(labelMedidas);
			this.janela.add(valorMedidas);
			this.janela.add(labelTipo);
			this.janela.add(valorTipo);
			this.janela.add(labelMaterial);
			this.janela.add(valorMaterial);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);
			this.janela.add(laberPesoSuportavel);
			this.janela.add(valorPesoSuportavel);

		}
		
		//Coloca campos relacionados a valor armario
		if (op == 3|| op == 9  ) {
			labelMedidas.setBounds(30, 230, 150, 25);
			valorMedidas.setBounds(180, 230, 180, 25);
			labelTipo.setBounds(30, 260, 150, 25);
			valorTipo.setBounds(180, 260, 180, 25);
			labelMaterial.setBounds(30, 290, 150, 25);
			valorMaterial.setBounds(180, 290, 180, 25);
			labelQtdGaveta.setBounds(30, 320, 150, 25);
			valorQtdGaveta.setBounds(180, 320, 180, 25);
			labelQtdPorta.setBounds(30, 350, 150, 25);
			valorQtdPorta.setBounds(180, 350, 180, 25);

			this.janela.add(labelMedidas);
			this.janela.add(valorMedidas);
			this.janela.add(labelTipo);
			this.janela.add(valorTipo);
			this.janela.add(labelMaterial);
			this.janela.add(valorMaterial);
			this.janela.add(labelQtdGaveta);
			this.janela.add(valorQtdGaveta);
			this.janela.add(labelQtdPorta);
			this.janela.add(valorQtdPorta);

		}
		
		//Coloca campos relacionados a valor geladeira
		if (op == 4 || op == 10 ) {
			labelVolume.setBounds(30, 230, 150, 25);
			valorVolume.setBounds(180, 230, 180, 25);
			labelVoltagem.setBounds(30, 260, 150, 25);
			valorVoltagem.setBounds(180, 260, 180, 25);
			labelConsumodeEnergia.setBounds(30, 290, 150, 25);
			valorConsumodeEnergia.setBounds(180, 290, 180, 25);
			labelPeso.setBounds(30, 320, 150, 25);
			valorPeso.setBounds(180, 320, 180, 25);
			
			this.janela.add(labelVolume);
			this.janela.add(valorVolume);
			this.janela.add(labelVoltagem);
			this.janela.add(valorVoltagem);
			this.janela.add(labelConsumodeEnergia);
			this.janela.add(valorConsumodeEnergia);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);

		}
		
		//Coloca campos relacionados a valor microondas
		if (op == 5 || op == 11 ) {
			labelVolume.setBounds(30, 230, 150, 25);
			valorVolume.setBounds(180, 230, 180, 25);
			labelVoltagem.setBounds(30, 260, 150, 25);
			valorVoltagem.setBounds(180, 260, 180, 25);
			labelPotencia.setBounds(30, 290, 150, 25);
			valorPotencia.setBounds(180, 290, 180, 25);
			labelConsumodeEnergia.setBounds(30, 320, 150, 25);
			valorConsumodeEnergia.setBounds(180, 320, 180, 25);
			labelPeso.setBounds(30, 350, 150, 25);
			valorPeso.setBounds(180, 350, 180, 25);

			this.janela.add(labelVolume);
			this.janela.add(valorVolume);
			this.janela.add(labelVoltagem);
			this.janela.add(valorVoltagem);
			this.janela.add(labelPotencia);
			this.janela.add(valorPotencia);
			this.janela.add(labelConsumodeEnergia);
			this.janela.add(valorConsumodeEnergia);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);

		}
		
		//Coloca campos relacionados a valor lava louças
		if (op == 6 || op == 12 ) {
			labelQtdServico.setBounds(30, 230, 150, 25);
			valorQtdServico.setBounds(180, 230, 180, 25);
			labelVoltagem.setBounds(30, 260, 150, 25);
			valorVoltagem.setBounds(180, 260, 180, 25);
			labelConsumodeEnergia.setBounds(30, 290, 150, 25);
			valorConsumodeEnergia.setBounds(180, 290, 180, 25);
			labelPeso.setBounds(30, 320, 150, 25);
			valorPeso.setBounds(180, 320, 180, 25);
			
			this.janela.add(labelQtdServico);
			this.janela.add(valorQtdServico);
			this.janela.add(labelVoltagem);
			this.janela.add(valorVoltagem);
			this.janela.add(labelConsumodeEnergia);
			this.janela.add(valorConsumodeEnergia);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);
			
		}
		
		
		//Coloca botoes de excluir e salvar
		if (op == 7 || op == 8 || op == 9 || op == 10 || op == 11 || op == 12) {
			botaoSalvar.setBounds(120, 400, 115, 30);
			botaoExcluir.setBounds(245, 400, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelQtdemEstoque);
		this.janela.add(valorQtdemEstoque);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelGarantia);
		this.janela.add(valorGarantia);
		
		this.janela.add(botaoSalvar);
		

		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de nova cadeira
					novoDado[0] = Integer.toString(dados.getQtdCadeira());
				else if (opcao == 2) // cadastro de nova mesa
					novoDado[0] = Integer.toString(dados.getQtdMesa());
				else if (opcao == 3) // cadastro de novo armario
					novoDado[0] = Integer.toString(dados.getQtdArmario());
				else if (opcao == 4) // cadastro de nova geladeira
					novoDado[0] = Integer.toString(dados.getQtdGeladeira());
				else if (opcao == 5) // cadastro de novo microondas
					novoDado[0] = Integer.toString(dados.getQtdMicroondas());
				else if (opcao == 6) // cadastro de nova lava louças
					novoDado[0] = Integer.toString(dados.getQtdlavaLoucas());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[3] =  valor.getText();
				novoDado[4] =  valorID.getText();
				novoDado[5] =  valorDDD.getText();
				novoDado[6] =  valorTelefone.getText();
				novoDado[7] =  valorTelefone.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[2] =  valorEnd.getText();
					res = dados.inserirEditarAluno(novoDado);
				} else {
					novoDado[2] =  valorHoraAula.getText();
					res = dados.inserirEditarProf(novoDado);
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

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui aluno
				res = dados.removerAluno(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 4){ //exclui professor
				res = dados.removerProfessor(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
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
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor está responsável\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
