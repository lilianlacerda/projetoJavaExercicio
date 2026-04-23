package exerciciosOperadoresLogicos;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
		
	}

}
