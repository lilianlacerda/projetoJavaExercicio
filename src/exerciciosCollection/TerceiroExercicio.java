package exerciciosCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TerceiroExercicio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println("Digite o " + (i + 1) + "° número");
			numeros.add(numero = leia.nextInt());
		}
		
		System.out.println("Listar dados do Set: ");
		System.out.println(numeros);

	}

}
