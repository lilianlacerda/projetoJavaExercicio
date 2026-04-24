package exerciciosCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		if(numero <= 10 && numero > 0) {
			System.out.println("O número " + numero + " está localizado na posição: " + numeros.indexOf(numero));
			
		}else {
			System.out.println("O número " + numero + " não foi encontrado");
		}
	}
}
