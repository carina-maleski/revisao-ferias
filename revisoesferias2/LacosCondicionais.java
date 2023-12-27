package revisoesferias2;

import java.util.Scanner;

public class LacosCondicionais {

	public static void main(String[] args) {

		// Laço Condicional Simples
		boolean x = true;
		boolean y = false;

		if (x == true) {
			System.out.println("X é verdadeiro!");
		}

		if (y) {
			System.out.println("Y é verdadeiro!");
		}

		System.out.println("Fim.");

		// Laço Condicional IF utilizando Operadores Relacionais
		int n1 = 4;
		int n2 = 3;
		int n3 = 4;

		if (n1 < 5) {
			System.out.println("\nN1 é menor do que 5.");
		}

		if (n1 < n2) {
			System.out.println("N1 é menor do que N2.");
		}

		if (n1 == n3)
			System.out.println("N1 é igual a N3.");

		System.out.println("Fim.");

		// Laço Condicional IF - Condição Composta
		int idade = 18;
		boolean carteiraM = true;

		if (idade >= 18) {
			if (carteiraM) {
				System.out.println("\nVocê pode dirigir.");
			}
		}

		if (idade >= 18 && carteiraM) {
			System.out.println("Você pode dirigir!");
		}

		System.out.println("Fim.");

		// Laço Condicional IF/ELSE
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, media;

		System.out.println("\nDigite a 1ª nota:");
		nota1 = leia.nextInt();

		System.out.println("\nDigite a 2ª nota:");
		nota2 = leia.nextInt();

		media = (nota1 + nota2) / 2;

		System.out.println("\nMédia: " + media);
		if (media >= 6) {
			System.out.println("Aprovade!");
		} else {
			System.out.println("Reprovade!");
		}

		System.out.println("Fim.");

		// If Encadeado
		int nota3, nota4;

		System.out.println("\nDigite a 1ª nota:");
		nota3 = leia.nextInt();

		System.out.println("\nDigite a 2ª nota:");
		nota4 = leia.nextInt();

		media = (nota3 + nota4) / 2;

		System.out.println("\nMédia: " + media);
		if (media >= 6) {
			System.out.println("Aprovade!");
		} else if (media == 5) {
			System.out.println("Exame!");
		} else {
			System.out.println("Reprovade!");
		}

		leia.close();
		System.out.println("Fim.");

	}

}
