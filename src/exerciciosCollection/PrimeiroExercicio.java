package exerciciosCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		ArrayList<String> arrayCores = new ArrayList<String>();
		
		String cores;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i <= 4; i++ ) {
			
			System.out.println("Digite a " + (i + 1) + "° cor: ");
			arrayCores.add(cores = leia.next());
		}
		
		System.out.println("\nListar todas as cores: ");
		System.out.println(arrayCores);
		
		Collections.sort(arrayCores);
		System.out.println("\nOrdenar as Cores: ");
		System.out.println(arrayCores);
		
		

	}

}
