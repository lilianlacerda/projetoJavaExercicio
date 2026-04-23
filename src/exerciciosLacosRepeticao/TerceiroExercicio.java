package exerciciosLacosRepeticao;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		int idade = 0, totalIdadeMenor = 0, totalIdadeMaior = 0;
		Scanner leia = new Scanner(System.in);

		while(!(idade < 0)) {
			
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				
				totalIdadeMenor++;
				
			}else if(idade > 50) {
				
				totalIdadeMaior++;
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + totalIdadeMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + totalIdadeMaior);
	}

}
