package revisoesferias1;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		// Definicao de variaveis
		int x = 10;
		int y = 5;
		int z = 20;
		int w = 5;
		boolean resposta;

		// Processamento e Saida de dados
		resposta = x > y;
		System.out.println("resposta = x > y;\nO valor de x é maior do que o valor de y? " + resposta);

		resposta = z >= y;
		System.out.println("\nresposta = z >= y;\nO valor de z é maior ou igual ao valor de y? " + resposta);

		resposta = x < z;
		System.out.println("\nresposta = x < z;\nO valor de x é menor do que o valor de z? " + resposta);

		resposta = z <= w;
		System.out.println("\nresposta = z <= w;\nO valor de z é menor ou igual ao valor de w? " + resposta);

		resposta = x == z;
		System.out.println("\nresposta = x == z;\nO valor de x é igual ao valor de z? " + resposta);

		resposta = z != w;
		System.out.println("\nresposta = z != w;\nO valor de z é diferente do valor de w? " + resposta);

	}

}
