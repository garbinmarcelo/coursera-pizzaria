/**
 * 
 * @author Marcelo Garbin
 * 
 * Cria 3 pizzas com ingredientes diferentes - ok
 * Adiciona essas Pizzas em um CarrinhoDeCompra  - ok
 * Imprime o total do CarrinhoDeCompra - ok
 * Imprime a quantidade utilizada de cada ingrediente - ok
 */
public class Principal {

	public static void main(String[] args) {
		// Inicia carrinho de compras
		CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Orégano");
		p1.adicionaIngrediente("Calabresa");
		
		// Adiciona pizza 01 no carrinhoCompras
		carrinhoCompras.adicionaCarrinho(p1);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Calabresa");
		
		// Adiciona pizza 02 no carrinhoCompras
		carrinhoCompras.adicionaCarrinho(p2);
		
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Chocolate Branco");
		p3.adicionaIngrediente("Chocolate Preto");
		p3.adicionaIngrediente("Cereja");
		p3.adicionaIngrediente("Morango");
		p3.adicionaIngrediente("Chocolate Granulado");
		p3.adicionaIngrediente("Uva");
		
		// Adiciona pizza 03 no carrinhoCompras
		carrinhoCompras.adicionaCarrinho(p3);
		
		System.out.println("======= Carrinho de Compras =======");
		System.out.println("Total de Pizzas Adicionadas ao Carrinho: " + carrinhoCompras.getTotalPizzas());
		System.out.println("Valor Total das Pizzas: R$" + carrinhoCompras.getTotalValorPizzas() + "\n");
		System.out.println("======= Total de Ingredientes Utilizados =======");
		carrinhoCompras.getIngredientes();
		System.out.println("================================================");
		
	}

}
