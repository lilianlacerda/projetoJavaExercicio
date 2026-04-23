package exerciciosLacosCondicionais;

import java.util.Scanner;

public class SegundoExercicioIf {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo!");
			
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");
			
		}else if(numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é impar e positivo!");
			
		}else if(numero % 2 != 0 && numero < 0) {
			System.out.println("O número " + numero + " é impar e negativo!");
		}

	}

}
