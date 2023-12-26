package revisoesferias1;

public class Variaveis {

	public static void main(String[] args) {
		byte bit = 127;
		short valor = 254;
		int quantidade = 1000;
		long identificador = 10000L;
		float altura = 25.4f;
		double area = 45.45;
		double tamanho = 650000000000.00;
		char tipo = 'A';
		boolean resposta = true;
		String palavra = "Generation Brasil";

		System.out.println("byte bit = " + bit + "; \nshort valor = " + valor + "; \nint quantidade = " + quantidade
				+ "; \nlong identificador = " + identificador + "; \nfloat altura = " + altura + "; \ndouble area = "
				+ area + "; \nchar tipo = " + tipo + "; \nboolean resposta = " + resposta + ";");

		// constantes
		final byte BIT1 = 127;
		final short VALOR1 = 254;
		final int QAUNTIDADE1 = 1000;
		final long IDENTIFICADOR1 = 10000l;
		final float ALTURA1 = 25.4f;
		final double AREA1 = 45.4567;
		final char TIPO1 = 'A';
		final boolean RESPOSTA1 = true;
		
		System.out.printf("\nVariável quantidade = %d", quantidade);
		System.out.printf("\nVariável identificador = %d", identificador);
		System.out.printf("\nVariável altura = %.2f", altura);
		System.out.printf("\nVariável area = %.2f", area);
		System.out.printf("\nVariável tamanho = %e", tamanho);
		System.out.printf("\nVariável tamanho = %E", tamanho);
		System.out.printf("\nVariável tipo = %c", tipo);
		System.out.printf("\nVariável palavra = %s", palavra);
		
		

	}

}
