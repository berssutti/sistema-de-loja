package view;
/**
 * Implementa uma interface para escolher o cliente que irá comprar um produto
 * @autor Bernardo Pissutti
 * @versio 1.0
 */
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import control.*;

public class TelaCarrinho implements ListSelectionListener {

	private JFrame janela;
	private JLabel tituloCompra;
	private JList<String> listaClientesCadastrados;
	private String[] listaNomes = new String[50];
	
	/**
	 * Mostra por meio de uma JList os cliente que poder ser escolhidos
	 * @param dados para pegar os nomes dos clientes
	 * return void
	 */
	public void mostrarDados(ControlDados dados){
		
		listaNomes = new ControlCliente(dados).getNomeCliente();
		listaClientesCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Carrinho");
		tituloCompra = new JLabel("Escolher Cliente");
		tituloCompra.setFont(new Font("Calibri", Font.BOLD, 18));
		tituloCompra.setBounds(120, 5, 250, 50);
		listaClientesCadastrados.setBounds(20, 50, 350, 120);
		listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaClientesCadastrados.setVisibleRowCount(10);
		janela.setLayout(null);

		janela.add(tituloCompra);
		
		janela.add(listaClientesCadastrados);
		janela.setSize(400, 300);
		janela.setVisible(true);

		listaClientesCadastrados.addListSelectionListener(this);
	
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {

		if(e.getValueIsAdjusting() && e.getSource() == listaClientesCadastrados) 
			new TelaConfirmacao().mostrarTela(1,listaClientesCadastrados.getSelectedIndex());
		
	}

}
