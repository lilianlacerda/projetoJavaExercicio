package exerciciosLacosRepeticao;

import java.util.Scanner;

public class SextoExercicio {

	public static void main(String[] args) {
		int numero = 0, contador = 0;
		float somaNumero = 0.0f, media = 0.0f;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			// Diferente de 0 para não calcular a média com 0 também. Pois 0 é múltiplo de 3. 
			if(numero % 3 == 0 && numero != 0) {
				somaNumero += numero;
				contador++;
				media = somaNumero / contador;
			}
			
		}while(!(numero == 0));
		
		System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
		

	}

}
