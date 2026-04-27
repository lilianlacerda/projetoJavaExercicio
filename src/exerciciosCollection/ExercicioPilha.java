package exerciciosCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		Scanner leia = new Scanner(System.in);
		
		int opcao = 1;
		String livro;
		
		while(opcao != 0) {
			System.out.println("Escolha a opção correspondente: ");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Cliente da Pilha");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				// Adicionei essa linha para não considerar o enter do menu. Isso permite usar o nextLine para identificar todas as palavras da linha
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				livro = leia.nextLine();
				
				pilha.push(livro);
				System.out.println("Livro " + livro + " adicionado com sucesso!");
				System.out.println("Pilha: " + pilha);
				
				break;
				
			case 2:
				
				if(!pilha.isEmpty()) {
					System.out.println("\nPilha: " + pilha);
					
				}else {
					System.out.println("\nA pilha está vazia!");
				}
				
				break;
				
			case 3:
				if(!pilha.isEmpty()) {
					pilha.pop();
					System.out.println("Pilha: " + pilha);
					
					System.out.println("Um livro foi retirado da pilha!");
					
				}else {
					System.out.println("A pilha está vazia!");
				}
				break;
				
			case 0: 
				
				break;
				
			default: 
				System.out.println("Opção Inválida! ");
			}
			
			if(opcao != 0) {
				System.out.println("\nDeseja voltar para o menu? ");
				System.out.println("9 - sim");
				System.out.println("0 - Não");
				opcao = leia.nextInt();
			}
		}
		
		System.out.println("Volte sempre! ");

	}

}
