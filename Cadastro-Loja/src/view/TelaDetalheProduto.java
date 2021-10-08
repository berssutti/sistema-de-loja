package view;
/**
 * Implementa uma interface para mostrar os detalhes de cada produto cadastrado, além de permitir a edição de dados já cadastrados
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021]
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.*;

public class TelaDetalheProduto implements ActionListener{
	
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
	private JLabel labelPreco = new JLabel("Preço(R$): ");
	private JTextField valorPreco;
	private JLabel labelVolume = new JLabel("Volume(L): ");
	private JTextField valorVolume;
	private JLabel labelPeso = new JLabel("Peso(Kg): ");
	private JTextField valorPeso;
	private JLabel labelVoltagem = new JLabel("Voltagem(V): ");
	private JTextField valorVoltagem;
	private JLabel labelPotencia = new JLabel("Potencia(W): ");
	private JTextField valorPotencia;
	private JLabel labelConsumodeEnergia = new JLabel("Comsumo de Energia(Kw/h): ");
	private JTextField valorConsumodeEnergia;
	private JLabel labelMedidas = new JLabel("Medidas(cmxcm): ");
	private JTextField valorMedidas;
	private JLabel laberPesoSuportavel = new JLabel("Peso Suportável(Kg): ");
	private JTextField valorPesoSuportavel;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	private JLabel labelQtdServico =  new JLabel("Quantidade de Serviços: ");
	private JTextField valorQtdServico;
	private JLabel labelQtdGaveta =  new JLabel("Quantidade de Gavetas: ");
	private JTextField valorQtdGaveta;
	private JLabel labelQtdPorta =  new JLabel("Quantidade de Portas: ");
	private JTextField valorQtdPorta;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[13];
	private ControlDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	/**
	 * Cadastra ou edita o produto escolhido pelo usuario 
	 * @param op, é numero equivalente à operação que o usuario deseja fazer
	 * (1) Cadastro de cadeira
	 * (2) Cadastro de Mesa
	 * (3) Cadastro de Armario
	 * (4) Cadastro de Geladeia
	 * (5) Cadastro de Microondas
	 * (6) Cadastro de Lava Louças
	 * (7) Detalhe de Cadeira
	 * (8) Detalhe de Mesa
	 * (9) Detalhe de Armario
	 * (10) Detalhe de Geladeira
	 * (11) Detalhe de Microondas
	 * (12) Detalhe de Lava Louças
	 * @param dados, para receber os dados dos produtos ja existentes
	 * @param p
	 * @param pos, é a posição do produto na JList
	 * @return void
	 */
	public void cadastrarEditarProduto(int op, ControlDados dados, 
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
			valorMaterial = new JTextField(String.valueOf(dados.getArmario()[pos].getMaterial()), 200);
			valorQtdPorta = new JTextField(String.valueOf(dados.getArmario()[pos].getQtdPorta()), 200);
			valorQtdGaveta = new JTextField(String.valueOf(dados.getArmario()[pos].getQrdGaveta()), 200);
			
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
			valorConsumodeEnergia = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getConsumodeEnergia()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getPeso()), 200);
			valorVoltagem = new JTextField(String.valueOf(dados.getlavaLoucas()[pos].getVoltagem()), 200);
			
		} else { //Não preenche com dados
			
			valorGarantia = new JTextField(200);
			valorNome = new JTextField(200);
			valorQtdemEstoque = new JTextField(200);
			valorDescricao = new JTextField(200);
			valorID = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorQtdServico = new JTextField(200);
			valorConsumodeEnergia = new JTextField(200);
			valorPeso = new JTextField(200); 
			valorVoltagem = new JTextField(200);
			valorPotencia = new JTextField(200);
			valorVolume = new JTextField(200);
			valorQtdPorta = new JTextField(200);
			valorQtdGaveta = new JTextField(200);
			valorMaterial = new JTextField(200);
			valorTipo = new JTextField(200);
			valorMedidas = new JTextField(200);
			valorPesoSuportavel = new JTextField(200);
			botaoSalvar.setBounds(245, 400, 115, 30);
			  
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
	
		
		//Coloca os campos relacionados a cadeira
		if (op == 7 || op == 1 ) {
			
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
		if ( op == 8 || op == 2 ) {
			
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
		else if (op == 9 || op == 3  ) {
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
		if ( op == 10|| op == 4  ) {
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
		if (op == 11 || op == 5 ) {
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
		if ( op == 12 || op == 6 ) {
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
		
		if(e.getSource() == botaoSalvar) {
			try {
				boolean res = false;
				
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
				novoDado[2] =  valorQtdemEstoque.getText();
				novoDado[3] =  valorGarantia.getText();
				novoDado[4] =  valorDescricao.getText();
				novoDado[5] =  valorMarca.getText();
				novoDado[6] =  valorPreco.getText();
				novoDado[7] =  valorID.getText();

				if (opcao == 1 || opcao == 7) {//cadeira
					novoDado[8] =  valorMedidas.getText();
					novoDado[9] = valorTipo.getText();
					novoDado[10] = valorPeso.getText();
					novoDado[11] = valorPesoSuportavel.getText();
					res = dados.cadastrarEditarCadeira(novoDado);
				} else if (opcao == 2 || opcao == 8){//mesa
					novoDado[8] =  valorMedidas.getText();
					novoDado[9] =  valorPesoSuportavel.getText();
					novoDado[10] =  valorTipo.getText();
					novoDado[11] =  valorMaterial.getText();
					novoDado[12] =  valorPeso.getText();
					res = dados.cadastrarEditarMesa(novoDado);
				} else if (opcao == 3 || opcao == 9){//armario
					novoDado[8] =  valorQtdGaveta.getText();
					novoDado[9] =  valorMedidas.getText();
					novoDado[10] =  valorTipo.getText();
					novoDado[11] =  valorMaterial.getText();
					novoDado[12] =  valorQtdPorta.getText();
					res = dados.cadastrarEditarArmario(novoDado);
				} else if (opcao == 4 || opcao == 10){//geladeira
					novoDado[8] =  valorVolume.getText();
					novoDado[9] =  valorPeso.getText();
					novoDado[10] =  valorVoltagem.getText();
					novoDado[11] =  valorConsumodeEnergia.getText();
					res = dados.cadastrarEditarGeladeira(novoDado);
				} else if (opcao == 5 || opcao == 11){//microondas
					novoDado[8] =  valorVolume.getText();
					novoDado[9] =  valorPeso.getText();
					novoDado[10] =  valorVoltagem.getText();
					novoDado[11] =  valorPotencia.getText();
					novoDado[12] =  valorConsumodeEnergia.getText();
					res = dados.cadastrarEditarMicroondas(novoDado);
				} else if (opcao == 6 || opcao == 12){//lava louças
					novoDado[8] =  valorQtdServico.getText();
					novoDado[9] =  valorPeso.getText();
					novoDado[10] =  valorVoltagem.getText();
					novoDado[11] =  valorConsumodeEnergia.getText();
					res = dados.cadastrarEditarLavaLoucas(novoDado);
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

			if (opcao == 7) {//exclui cadeira
				res = dados.deletarCadeira(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}
				
			if (opcao == 8){ //exclui mesa
				res = dados.deletarMesa(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}
			
			if (opcao == 9){ //exclui armario
				res = dados.deletarArmario(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}
			
			if (opcao == 10){ //exclui geladeira
				res = dados.deletarGeladeira(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}
			
			if (opcao == 11){ //exclui microondas
				res = dados.deletarMicroondas(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}
			
			if (opcao == 12){ //exclui lava louças
				res = dados.deletarLavaLoucas(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
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
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ",
				null, JOptionPane.ERROR_MESSAGE);
	}

	
	 public void mensagemErroExclusao() {
		 JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ",
				 null, JOptionPane.ERROR_MESSAGE); 
	 }
	 
}
