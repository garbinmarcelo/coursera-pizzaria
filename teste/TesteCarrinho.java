import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Marcelo
 *
 * Verificando se o preço das pizzas são somados corretamente | OK
 * se ele impede a adição de uma pizza sem ingredientes. | OK
 */
public class TesteCarrinho {
	// Cria um objeto da classe CarrinhoDeCompras
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	@Before
	public void before() {
		// Zera o HasMap de ingredientes a cada @Test
		CarrinhoDeCompras.zeraCarrinho();
	}
	
	// Testa o valor total de pizzas adicionadas ao carrinho
	@Test
	public void testTotalValorPizzas() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Orégano");
		p1.adicionaIngrediente("Calabresa");	
		// Adiciona pizza 01 no carrinhoCompras
		carrinho.adicionaCarrinho(p1);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Calabresa");
		// Adiciona pizza 02 no carrinhoCompras
		carrinho.adicionaCarrinho(p2);
		
		assertEquals(35, carrinho.getTotalValorPizzas(), 0);
	}
	
	// Testa o total de pizzas adicionadas ao carrinho
	@Test
	public void testTotalPizzas() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Orégano");
		p1.adicionaIngrediente("Calabresa");	
		// Adiciona pizza 01 no carrinhoCompras
		carrinho.adicionaCarrinho(p1);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Calabresa");
		// Adiciona pizza 02 no carrinhoCompras
		carrinho.adicionaCarrinho(p2);
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Calabresa");
		// Adiciona pizza 03 no carrinhoCompras
		carrinho.adicionaCarrinho(p3);
		
		// Pizza 04 não adicionado, está sem ingredientes
		Pizza p4 = new Pizza();
		carrinho.adicionaCarrinho(p4);
		
		assertEquals(3, carrinho.getTotalPizzas(), 0);
	}
	
	// Testa a adição de pizza sem ingrediente no carrinho
	@Test
	public void testAdicionaCarrinhoPizza() {
		Pizza p3 = new Pizza();
		
		assertEquals(false, carrinho.adicionaCarrinho(p3));
	}
}
