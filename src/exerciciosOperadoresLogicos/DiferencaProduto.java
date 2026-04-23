package exerciciosOperadoresLogicos;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Número 1");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o Número 2");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o Número 3");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o Número 4");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença é: %.1f", diferenca);

	}

}
