package exerciciosLacosRepeticao;

import java.util.Scanner;

public class QuintoExercicio {
	
	public static void main(String[] args) {
		int numero, somaNumeros = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				somaNumeros += numero ; 
				
			}
			
		}while(!(numero == 0));
		
		System.out.println("A soma dos números positivos é: " + somaNumeros);
		
		
	}
}
