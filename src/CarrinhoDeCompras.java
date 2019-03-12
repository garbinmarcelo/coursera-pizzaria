/**
 * 
 * @author Marcelo Garbin
 * 
 * Crie uma nova classe chamada CarrinhoDeCompras que |pode receber objetos da classe Pizza|. 
 * Ela deve ter um método que |retorna o valor total de todas as pizzas adicionadas|.  -ok
 * O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes. - ok
 */
public class CarrinhoDeCompras {
	
	Pizza pizza;
	static Integer totalPizzas = 0;
	static Double valorTotalPizzas = 0.0;
	
	public CarrinhoDeCompras() {}
	
	public CarrinhoDeCompras(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public void adicionaCarrinho(Pizza pizza) {
		// Variaveis da pizza
		Integer qtdIngredientes = pizza.qtdIngredientes;
		
		// Verifica se a pizza possui ingredientes
		// Se for > 0 incrementa total de pizzas
		if(qtdIngredientes > 0) {
			Double precoPizza = pizza.getPreco(qtdIngredientes);	
			// Incrementa total de pizzas
			totalPizzas++;
			// Incrementa valor total das pizzas
			valorTotalPizzas += precoPizza;
			
			// Passa variaveis para parcial
			// (EXTRA) Descomentar linha abaixo para ver parciais!
			//getParcial(qtdIngredientes, precoPizza);
		}
	}
	
	private void getParcial(Integer qtdIngredientes, Double precoPizza) {
		System.out.println("Produto Adicionado ao carrinho: \n" +
				"Pizza: 01 \n" +
				"Quantidade Ingredientes: "	+ qtdIngredientes  + "\n" +
				"Valor Pizza: "	+ String.format("%.2f", precoPizza) + "\n" +
				"================================ \n"
		);
	}

	public String getTotalPizzas() {
		return totalPizzas.toString();
	}
	
	public String getTotalValorPizzas() {
		return String.format("%.2f", valorTotalPizzas);
	}
	
	public void getIngredientes() {
		Pizza.totalIngredientes.forEach((k, v)->System.out.println("- " + k + ": " + v));
	}
}
