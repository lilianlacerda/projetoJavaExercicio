package exerciciosLacosCondicionais;

import java.util.Scanner;

public class QuartoExercicioIf {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a Primeira Palavra: ");
		palavra1 = leia.nextLine();

		System.out.println("Digite a Segunda Palavra: ");
		palavra2 = leia.nextLine();

		System.out.println("Digite a Terceira Palavra: ");
		palavra3 = leia.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {

			if (palavra2.equalsIgnoreCase("ave")) {

				if (palavra3.equalsIgnoreCase("carnívoro") ) {
					System.out.println("Águia");

				} else if (palavra3.equalsIgnoreCase("onívoro") ) {
					System.out.println("Pomba");

				} else {
					System.out.println("Palavra 3 inválida");

				}

			} else if (palavra2.equalsIgnoreCase("mamífero")) {

				if (palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");

				} else if (palavra3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Vaca");

				} else {
					System.out.println("Palavra 3 inválida");

				}
			} else {
				System.out.println("Palavra 2 Inválida");

			}

		} else if (palavra1.equalsIgnoreCase("invertebrado")) {
			if (palavra2.equalsIgnoreCase("inseto")) {

				if (palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");

				} else if (palavra3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");

				} else {
					System.out.println("Palavra 3 inválida");

				}

			} else if (palavra2.equalsIgnoreCase("anelídeo")) {

				if (palavra3.equalsIgnoreCase("onívoro") ) {
					System.out.println("Minhoca");
					

				} else if (palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");

				} else {
					System.out.println("Palavra 3 inválida");

				}
			} else {
				System.out.println("Palavra 2 Inválida");

			}

		} else {
			System.out.println("Palavra 1 inválida");
		}
	}

}
