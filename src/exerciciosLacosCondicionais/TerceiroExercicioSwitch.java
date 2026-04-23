package exerciciosLacosCondicionais;

import java.util.Scanner;

public class TerceiroExercicioSwitch {

	public static void main(String[] args) {
		float numero1, numero2, total;
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1° número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2° número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o número correspondente para escolher a operação: ");
		System.out.println(" 1 | Soma");
		System.out.println(" 2 | Subtração");
		System.out.println(" 3 | Multiplicação");
		System.out.println(" 4 | Divisão");
		opcao = leia.nextInt();
		
		switch(opcao){
			
		case 1:
			total = numero1 + numero2;
			
			System.out.println(numero1 + " + " + numero2 + " = " + total);
			break;
			
		case 2:
			total = numero1 - numero2;
			
			System.out.println(numero1 + " - " + numero2 + " = " + total);
			break;
			
		case 3: 
			total = numero1 * numero2;
			
			System.out.println(numero1 + " * " + numero2 + " = " + total);
			break;
			
		case 4: 
			total = numero1 / numero2;
			
			System.out.println(numero1 + " / " + numero2 + " = " + total);
			break;
			
		default: 
			System.out.println("Opção Inválida! ");
		
		}

	}

}
