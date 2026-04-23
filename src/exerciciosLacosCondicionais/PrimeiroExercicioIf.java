package exerciciosLacosCondicionais;

import java.util.Scanner;

public class PrimeiroExercicioIf {

	public static void main(String[] args) {
		
		int valorA, valorB, valorC, totalAB;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		valorC = leia.nextInt();
		
		totalAB = valorA + valorB;
		
		if(totalAB > valorC) {
			System.out.println(valorB + " + " + valorA + " = " + totalAB + " > " + valorC);
			System.out.println("A Soma de A + B é Maior do que C");
			
		}else if(totalAB < valorC) {
			System.out.println(valorB + " + " + valorA + " = " + totalAB + " < " + valorC);
			System.out.println("A Soma de A + B é Menor do que C");
			
		}else if(totalAB == valorC) {
			System.out.println(valorB + " + " + valorA + " = " + totalAB + " = " + valorC);
			System.out.println("A Soma de A + B é igual a C");
			
		}else {
			System.out.println("Opção inválida");
			
		}
	}

}
