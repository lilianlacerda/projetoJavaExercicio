package exerciciosCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		String nome;
		int opcao = 1;

		while (opcao != 0) {

			System.out.println("\nFila do banco!");
			System.out.println("Escolha a opção correspondente: ");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome do cliente: \n");
				nome = leia.next();

				fila.add(nome);

				System.out.println("Olá! " + nome + ". Nome adicionado com sucesso!\n");
				System.out.println("Fila: " + fila);

				break;

			case 2:

				if (!fila.isEmpty()) {
					System.out.println("\nLista de Clientes na fila: " + fila);

				} else {
					System.out.println("\nNão tem ninguém na fila! ");
				}
				break;

			case 3:

				if (!fila.isEmpty()) {
					
					fila.poll();
					System.out.println("FIla: " + fila);
					
				}else {
					
					System.out.println("\nA fila está vazia!");
				}
				break;
				
			case 0: 
				
				break;
				
			default: 
				System.out.println("Opção inválida! ");

			}

			if (opcao != 0){
				System.out.println("\nDeseja voltar para o menu? ");
				System.out.println("9 - sim");
				System.out.println("0 - Não");
				opcao = leia.nextInt();
			}

		} 

		System.out.println("\nVolte sempre!");

	}

}
