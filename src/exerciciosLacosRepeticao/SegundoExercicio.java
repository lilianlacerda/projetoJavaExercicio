package exerciciosLacosRepeticao;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		int numero, totalPar = 0, totalImpar = 0;
		Scanner leia = new Scanner(System.in);

		for (int contador = 1; contador <= 10; contador++) {

			System.out.println("\nDigite o " + contador + "° Número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				totalPar++;
			} else {
				totalImpar++;
			}
		}

		System.out.println("Total de Números Pares: " + totalPar);
		System.out.println("\nTotal de Números ìmpares: " + totalImpar);

	}

}
