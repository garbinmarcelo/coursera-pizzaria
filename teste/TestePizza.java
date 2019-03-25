import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Marcelo
 *
 * Verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes. | ok
 * Verifique também se o registro de ingredientes funcionou corretamente. | ok
 * Crie um método estático na classe Pizza que zera o registro de ingredientes e | ok
 * invoque ele em um método de inicialização ou finalização na classe de testes. | ok
 */
public class TestePizza {
	// Cria um objeto da classe Pizza
	Pizza pizza = new Pizza();
	
	@Before
	public void before() {
		// Zera o HasMap de ingredientes a cada @Test
		Pizza.zeraIngredientes();
	}
	
	@Test
	public void testAdicionaIngrediente() {
		// Adiciona 4 Ingredientes
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Orégano");
		pizza.adicionaIngrediente("Calabresa");
		// Verifica se a quantidade de ingredientes adicionado está correta
		assertEquals(4, pizza.getQtdIngredientes(), 0);
	}
	
	@Test
	public void testValor15() {
		// Adiciona 2 Ingredientes
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Coração");
		// Verifica se o valor está correto
		assertEquals(15, pizza.getPreco(pizza.getQtdIngredientes()), 0);
	}
	
	@Test
	public void testValor20() {
		// Adiciona 4 Ingredientes
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Coração");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Coração");
		// Verifica se o valor está correto
		assertEquals(20, pizza.getPreco(pizza.getQtdIngredientes()), 0);
	}
	
	@Test
	public void testValor23() {
		// Adiciona 6 Ingredientes
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Coração");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Coração");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Coração");
		// Verifica se o valor está correto
		assertEquals(23, pizza.getPreco(pizza.getQtdIngredientes()), 0);
	}
}
