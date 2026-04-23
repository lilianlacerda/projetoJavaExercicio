package exerciciosLacosCondicionais;

import java.util.Scanner;

public class SegundoExercicioSwitch {

	public static void main(String[] args) {
		
		String nome;
		int cargo;
		float salario, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do Colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o número correspondente ao seu cargo: ");
		System.out.println("Código |    Cargo     | Percentual do Reajuste  ");
		System.out.println("-------|--------------|-------------------------");
		System.out.println("  1    | Gerente      |  10%  ");
		System.out.println("  2    | Vendedor     |  7%  ");
		System.out.println("  3    | Supervisor   |  9% ");
		System.out.println("  4    | Motorista    |  6%");
		System.out.println("  5    | Estoquista   |  5% ");
		System.out.println("  6    | Técnico de TI|  8% ");
		cargo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		
		case 1: 
			novoSalario = salario + (10 * salario);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário: %.2f", novoSalario);
			break;
			
		case 2: 
			novoSalario = salario + (7 * salario);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário: %.2f", novoSalario);
			break;	
			
		case 3: 
			novoSalario = salario + (9 * salario);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário: %.2f", novoSalario);
			break;	
			
		case 4: 
			novoSalario = salario + (6 * salario);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário: %.2f", novoSalario);
			break;	
			
		case 5: 
			novoSalario = salario + (5 * salario);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário: %.2f", novoSalario);
			break;
			
		case 6: 
			novoSalario = salario + (8 * salario);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário: %.2f", novoSalario);
			break;
			
		default: 
			System.out.println("Opção Inválida! ");
		}
		

	}

}
