package exerciciosLacosRepeticao;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo");
		numero1 = leia.nextInt();
		System.out.println("Digite o último número do intervalo");
		numero2 = leia.nextInt();

		if (numero1 < numero2) {
			System.out.println("\nNo intervalo entre " + numero1 + " e " + numero2 + "\n");

			for (int contador = numero1; contador < numero2; contador++) {
				// numero % 3 == 0
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo Inválido!");

		}

	}

}
