package exerciciosLacosCondicionais;

import java.util.Scanner;

public class QuartoExercicioSwitch {

	public static void main(String[] args) {
		
		int opcao;
		float saldo = 1000.00f;
		float valor, novoSaldo;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("###   Menu   ###");
		System.out.println("Digite o número correspondente para escolher a operação: ");
		System.out.println(" 1 | Saldo ");
		System.out.println(" 2 | Saque ");
		System.out.println(" 3 | Depósito ");
		opcao = leia.nextInt();
		
		switch(opcao){
			
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ " + saldo);
			break;
			
		case 2: 
			System.out.println("Operação - Saque");
			System.out.println("Digite o valor que deseja sacar: ");
			valor = leia.nextFloat();
			
			novoSaldo = saldo - valor;
			
			if(novoSaldo < 0) {
				System.out.println("Saldo Insuficiente!");
				
			}else {
				System.out.println("Saque concluído! Novo Saldo: " + novoSaldo);
			}
			break;
			
		case 3: 
			System.out.println("Operação - Depósito");
			System.out.println("Digite o valor que deseja Depositar: ");
			valor = leia.nextFloat();
			
			novoSaldo = saldo + valor;
			
			System.out.println("Novo Saldo: " + novoSaldo);
			break;
			
		default: 
			System.out.println("Opção Inválida!");
			
			
		}
		
		

	}

}
