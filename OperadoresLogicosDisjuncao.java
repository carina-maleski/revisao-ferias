package revisoesferias1;

public class OperadoresLogicosDisjuncao {

	public static void main(String[] args) {
		// Definicao de variaveis
		int x = 10;
		int y = 5;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean proposicao_03;
		boolean proposicao_04;
		boolean resposta;
		
		// Processamento e Saida de dados
		proposicao_01 = x > y;
		System.out.println("proposicao_01 = x > y;\nA proposicao_01 é: " + proposicao_01);
		
		proposicao_02 = x < y;
		System.out.println("\nproposicao_02 = x < y;\nA proposicao_02 é: " + proposicao_02);

		proposicao_03 = x != y;
		System.out.println("\nproposicao_03 = x != y;\nA proposicao_03 é: " + proposicao_03);
		
		proposicao_04 = x == y;
		System.out.println("\nproposicao_04 = x == y;\nA proposicao_04 é: " + proposicao_04);

		System.out.println("\n\nDisjunção\n");

		resposta = proposicao_01 || proposicao_03;
		System.out.println("\nresposta = proposicao_01 || proposicao_03;\nA proposicao_01 e proposicao_03 são verdadeiras? " + resposta);

		resposta = proposicao_01 || proposicao_02;
		System.out.println("\nresposta = proposicao_01 || proposicao_02;\nA proposicao_01 e proposicao_02 são verdadeiras? " + resposta);

		resposta = proposicao_03 || proposicao_04;
		System.out.println("\nresposta = proposicao_03 || proposicao_04;\nA proposicao_03 e proposicao_04 são verdadeiras? " + resposta);

		resposta = proposicao_02 || proposicao_04;
		System.out.println("\nresposta = proposicao_02 || proposicao_04;\nA proposicao_02 e proposicao_04 são verdadeiras? " + resposta);
	}

}
