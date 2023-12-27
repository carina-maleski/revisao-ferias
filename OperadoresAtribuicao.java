package revisoesferias1;

public class OperadoresAtribuicao {

	public static void main(String[] args) {

		// Definicao de variaveis
		int x = 4;
		int y = 2;
		int z = 1;

		// Processamento e Saida de dados
		z = y;
		System.out.println("z = y;");
		System.out.println("Atribuição simples (z = y): " + z);

		x += y;
		System.out.println("\nx += y;");
		System.out.println("Atribuição com soma (x = x + y): " + x);

		x -= z;
		System.out.println("\nx -= z;");
		System.out.println("Atribuição com subtração (x = x - z): " + x);

		x *= y;
		System.out.println("\nx *= y;");
		System.out.println("Atribuição com multiplicação (x = x * y): " + x);

		x /= y;
		System.out.println("\nx /= y;");
		System.out.println("Atribuição com divisão (x = x / y): " + x);

		x %= y;
		System.out.println("\nx %= y;");
		System.out.println("Atribuição com o Módulo (x = x % y): " + x);
	}

}
