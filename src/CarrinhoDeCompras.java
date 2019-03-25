import java.util.ArrayList;

/**
 * 
 * @author Marcelo Garbin
 * 
 */
public class CarrinhoDeCompras {
	
	static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public CarrinhoDeCompras() {}
	
	public boolean adicionaCarrinho(Pizza pizza) {
		// Verifica se a pizza possui ingredientes
		// Se for igual a 0 não adiciona a pizza ao ArrayList e retorna false
		if(pizza.getQtdIngredientes() == 0)
			return false;
		
		// Adiciona ao ArrayList
		pizzas.add(pizza);
		return true;
	}

	public Integer getTotalPizzas() {
		return pizzas.size();
	}
	
	public Double getTotalValorPizzas() {
		// Cria uma variavel para o total
		Double valorTotalPizzas = 0.0;
		// Percorre a lista e incrementa a variavel
		for(Pizza pizza : pizzas) {
			valorTotalPizzas += pizza.getPreco(pizza.getQtdIngredientes());
		}
	
		return valorTotalPizzas;
	}
	
	// Limpa todos os elementos do Array
	public static void zeraCarrinho() {
		CarrinhoDeCompras.pizzas.clear();
	}
}
