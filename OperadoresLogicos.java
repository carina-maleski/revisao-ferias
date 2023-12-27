/*Os Operadores Lógicos são utilizados para realizar comparações e validações, criando expressões condicionais complexas.*/

package revisoesferias1;

public class OperadoresLogicos {

	public static void main(String[] args) {
		//Definicao de variaveis
		int x = 10;
		int y = 5;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean resposta;
		
		// Processamento e Saida de dados
		proposicao_01 = x > y;
		System.out.println("proposicao_01 = x > y;\nA proposicao_01 é: " + proposicao_01);
		
		proposicao_02 = x < y;
		System.out.println("\nproposicao_02 = x < y;\nA proposicao_02 é: " + proposicao_02);

		System.out.println("\n\nNegação\n");

		resposta = !proposicao_01;
		System.out.println("\nresposta = !proposicao_01;\nA Negação da proposicao_01 é: " + resposta);

		resposta = !proposicao_02;
		System.out.println("\nresposta = !proposicao_02;\nA Negação da proposicao_02 é: " + resposta);
	}

}
