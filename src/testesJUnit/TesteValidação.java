package testesJUnit;
/**
 * Implementa testes unitarios de validação
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021] 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import control.*;

class TesteValidação {
	ControlDados dados = new ControlDados();
	String[] novoDado = new String[13];
	
	/**
	 * Verifica se o parametro 3, representando a posição do cliente da array, 
	 * funciona para o método em questão 
	 * @return void
	 */
	@Test
	void testDeletarCliente() {
		assertTrue(dados.deletarCliente(3));
	}
		/**
		 * Verifica se o parametro novoDado, representando novos dados para um objeto microondas
		 * funciona para o método em questão 
		 * @return void
		 */
	@Test
	void testCadastrarEditarMicroondas() {
		novoDado[0] = "0";
		novoDado[1] =  "Microondas";
		novoDado[2] =  "15";
		novoDado[3] =  "4 anos";
		novoDado[4] =  "Bonito";
		novoDado[5] =  "Brastemp";
		novoDado[6] =  "560";
		novoDado[7] =  "29310983";
		novoDado[8] =  "5";
		novoDado[9] =  "13";
		novoDado[10] =  "60";
		novoDado[11] =  "120";
		novoDado[12] =  "30";
		assertTrue(dados.cadastrarEditarMicroondas(novoDado));
	}
	/**
	 * Verifica se o método em questão está funcionando corretamente, dado os parametros
	 * @return void
	 */
	@Test
	void testEncontraCpfCliente() {
		assertEquals(0,dados.encontraCpfCliente("CPF0") );
	}

}
