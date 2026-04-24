package exercicioosVetor;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		int vetorNumeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, numeroPosicao = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		// Logica para verificar se o usuário difigou um número menor ou igual a 10
		if(numero <= 10) {
			
			for(int indice = 0; indice <= 9; indice++) {
				
				//cair nessa condição quando o for passar pelo indice que for igual ao número que o usuário digirou
				if(vetorNumeros[indice] == numero) {
					// Ele pega a posição que o índice parou para mostrar para o usuário na tela 
					numeroPosicao = indice;
				}
			}
			
			System.out.println("O número " + numero + " está localizado na posição: " + numeroPosicao);
			
		}else {
			System.out.println("Não encontrado");
		}
	}

}
