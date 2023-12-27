package revisoesferias1;

public class Operadores {

	public static void main(String[] args) {
		
		//1. Operadores Aritméticos
		
		// Definição de variáveis
		int x = 4;
		int y = 2;
		int z = 3;
		int w = -5;
		
		//Processamento dos dados
		System.out.println("Soma (4+2): " + (x + y));
		System.out.println("\nSoma com numero negativo (4 + (-5)): " + (x + w));
		System.out.println("\nSubtração (4-2): " + (x - y));
		System.out.println("\nMultiplicação (4*2): " + (x * y));
		System.out.println("\nDivisão (4/2): " + (x / y));
		System.out.println("\nMódulo (resto da divisão): " + (x % 2));
		System.out.println("\nMódulo (resto da divisão): " + (z % 2));
		
		
		//Concatenação de Strings
		String texto01 = "Generation";
		String texto02 = "Brasil";
		String texto03 = " ";
		
		System.out.println("\n\nConcatenar texto01 e texto02: " + texto01 + texto02);
		System.out.println("\nConcatenar texto02 e texto01: " + texto02 + texto01);
		System.out.println("\nConcatenar texto01, texto03 e texto02: " + texto01 + texto03 + texto02);
		
		
		//2. Operadores Unários
		int x1= 10;
		int y1 = 8;
		int z1 = 6;
		int w1 = 4;
		int i = 40;
		int j = 30;
		int k = 20;
		int l = 10;
		int m = 5;
		
		System.out.println("\n\nTransformar em Número negativo: " + (-m));

		System.out.println("\nPré Incrementar: x1 = ++ y1");

		x1 = ++ y1;

		System.out.println("\nValor de x1: " + x1);
		System.out.println("\nValor de y1: " + y1);

		System.out.println("\nPré Decrementar: z1 = -- w1");

		z1 = -- w1;

		System.out.println("\nValor de z1: " + z1);
		System.out.println("\nValor de w1: " + w1);

		System.out.println("\nPós Incrementar: i = j ++");

		i = j ++;
		
		System.out.println("\nValor de I: " + i);
		System.out.println("\nValor de J: " + j);
		
		System.out.println("\nPós Decrementar: k = l --");

		k = l --;

		System.out.println("\nValor de K: " + k);
		System.out.println("\nValor de L: " + l);
		
	}

}
