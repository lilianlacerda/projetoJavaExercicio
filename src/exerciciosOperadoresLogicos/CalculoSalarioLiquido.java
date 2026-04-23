package exerciciosOperadoresLogicos;

import java.util.Scanner;

public class CalculoSalarioLiquido {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5f) - descontos;
		
		System.out.printf("Seu salário líquido é: %.2f", salarioLiquido);
	}

}
