import java.util.HashMap;

/**
 * 
 * @author Marcelo Garbin
 *
 * Crie uma classe Pizza que possua o m�todo adicionaIngrediente() que |recebe uma String com o ingrediente a ser adicionado|. - ok
 * Essa classe tamb�m deve possuir o m�todo getPreco() que calcula da seguinte forma: - ok
 * 2 ingredientes ou menos custam 15 reais,  - ok
 * de 3 a 5 ingredientes custam 20 reais e  - ok
 * mais de 5 ingredientes custa 23 reais. - ok
 * � preciso contabilizar os ingredientes gastos por todas as pizzas! - ok
 * Utilize uma vari�vel est�tica na classe Pizza para guardar esse tipo de informa��o - ok
 * (dica: utilize a classe HashMap para guardar o |ingrediente como chave| e um |Integer como valor|). - ok
 * Crie o m�todo est�tico contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro. - ok
 */
public class Pizza {

	Integer qtdIngredientes = 0;
	Double preco = 0.0;
	// String ingrediente, Integer quantidade
	static HashMap<String, Integer> totalIngredientes = new HashMap<>();
	
	public void adicionaIngrediente(String ingrediente){
		// Adiciona ingrediente na lista
		contabilizaIngrediente(ingrediente);
		// Contabiliza a quantidade de ingredientes
		qtdIngredientes++;
	}
	
	public double getPreco(Integer totalIngredientes){
		if(totalIngredientes <= 2){
			preco = 15.0;
		}else if(totalIngredientes >= 3 && totalIngredientes <= 5){
			preco = 20.0;
		}else if(totalIngredientes > 5){
			preco = 23.0;
		}

		return preco;
	}

	public static void contabilizaIngrediente(String ingrediente){
		// Se j� existe uma chave com o mesmo nome do ingrediente cadastrado
		// Soma +1, se n�o salva 1 novo registro
		if(totalIngredientes.get(ingrediente) != null)
			totalIngredientes.put(ingrediente, totalIngredientes.get(ingrediente) + 1);
		else
			totalIngredientes.put(ingrediente, 1);
	}
	
	public Integer getQtdIngrediente() {
		return this.qtdIngredientes;
	}
}
