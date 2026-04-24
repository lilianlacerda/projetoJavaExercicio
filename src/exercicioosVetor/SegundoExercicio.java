package exercicioosVetor;

public class SegundoExercicio {

	public static void main(String[] args) {
		
		int vetorNumeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int  numerosPares = 0, numerosImpares = 0, soma = 0;
		float media = 0.0f;
		
		System.out.println("\nElementos nos índices ímpares: ");
		for(int indice = 0; indice <= 9; indice++) {
			
			if(! (indice % 2 == 0)) {
				
				numerosImpares = vetorNumeros[indice];
				System.out.print(numerosImpares + " " );
				
			}
		}
		
		System.out.println("\n");
		System.out.println("Elementos pares:");
		for(int indice = 0; indice <= 9; indice++) {
			
			if(vetorNumeros[indice] % 2 == 0){
				
				numerosPares = vetorNumeros[indice];
				System.out.print(numerosPares + " ");	
			}
		}
		
		System.out.println("\n");
		for(int indice = 0; indice <= 9; indice++) {
			
			soma += vetorNumeros[indice];
			media = (float) soma / vetorNumeros.length;
		}
		
		System.out.println("Soma: " + soma);
		System.out.printf("\nMédia: %.2f", media);

	}

}
