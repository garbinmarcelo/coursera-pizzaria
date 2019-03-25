import java.util.HashMap;

/**
 * 
 * @author Marcelo Garbin
 * 
 */
public class Pizza {

	// String ingrediente, Integer quantidade
	static HashMap<String, Integer> ingredientes = new HashMap<>();
	Integer qtdIngredientes = 0;
	
	public Pizza() {}

	public void adicionaIngrediente(String ingrediente){
		// Adiciona ingrediente na lista
		contabilizaIngrediente(ingrediente);
		// Contabiliza a quantidade de ingredientes
		qtdIngredientes++;
	}

	public static void contabilizaIngrediente(String ingrediente){
		// Se já existe uma chave com o mesmo nome do ingrediente cadastrado
		// Soma +1, se não salva 1 novo registro
		if(ingredientes.get(ingrediente) != null)
			ingredientes.put(ingrediente, ingredientes.get(ingrediente) + 1);
		else
			ingredientes.put(ingrediente, 1);
	}

	public Integer getQtdIngredientes() {
		return qtdIngredientes;
	}
	
	public double getPreco(Integer totalIngredientes){
		Double preco = 0.0;
		if(totalIngredientes <= 2){
			preco = 15.0;
		}else if(totalIngredientes >= 3 && totalIngredientes <= 5){
			preco = 20.0;
		}else if(totalIngredientes > 5){
			preco = 23.0;
		}

		return preco;
	}
	
	// Imprime todos os ingredientes e quantidades
	public static void getIngredientes() {
		Pizza.ingredientes.forEach((k, v)->System.out.println("- " + k + ": " + v));
	}
	
	// Limpa todos os elementos do HasMap
	public static void zeraIngredientes() {
		Pizza.ingredientes.clear();
	}
}
