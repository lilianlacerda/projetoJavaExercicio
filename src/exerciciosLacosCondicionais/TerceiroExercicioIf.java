package exerciciosLacosCondicionais;

import java.util.Scanner;

public class TerceiroExercicioIf {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do "
				+ "Doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if(primeiraDoacao == true) {
				if(idade < 60) {
					System.out.println(nome + " está apta para doar sangue!");
					
				}else {
					System.out.println(nome + " Não está apta para Doar sangue! Motivo: primeira doação fora da idade permitida");
				}

			}else{
				System.out.println(nome + " está apta para doar sangue!");
			}
		}else {
			System.out.println(nome + " não está apta para doar sangue! Motivo: Idade");
		}
		
		
		

	}

}
