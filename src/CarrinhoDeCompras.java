import java.util.ArrayList;

/**
 * 
 * @author Marcelo Garbin
 * 
 * Crie uma nova classe chamada CarrinhoDeCompras que |pode receber objetos da classe Pizza|. 
 * Ela deve ter um método que |retorna o valor total de todas as pizzas adicionadas|.  -ok
 * O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes. - ok
 */
public class CarrinhoDeCompras {
	
	static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public CarrinhoDeCompras() {}
	
	public void adicionaCarrinho(Pizza pizza) {
		// Verifica se a pizza possui ingredientes
		// Se for > 0 adiciona a pizza ao ArrayList
		if(pizza.getQtdIngrediente() > 0)
			pizzas.add(pizza);
	}

	public Integer getTotalPizzas() {
		return pizzas.size();
	}
	
	public String getTotalValorPizzas() {
		// Cria uma variavel para o total
		Double valorTotalPizzas = 0.0;
		// Percorre a lista e incrementa a variavel
		for(Pizza pizza : pizzas) {
			valorTotalPizzas += pizza.getPreco(pizza.getQtdIngrediente());
		}
		// retorna a variavel formatada como String
		return String.format("%.2f", valorTotalPizzas);
	}
}
