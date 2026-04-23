package exerciciosLacosCondicionais;

import java.util.Scanner;

public class PrimeiroExercicioSwitch {

	public static void main(String[] args) {
		int codProduto, quantProduto;
		float valorTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("###   Menu   ###");
		System.out.println("Digite o número correspondente para escolher: ");
		System.out.println(" 1 | Cachorro Quente | R$ 10.00 ");
		System.out.println(" 2 | X-Salada        | R$ 15.00 ");
		System.out.println(" 3 | X-Bacon         | R$ 18.00 ");
		System.out.println(" 4 | Bauru           | R$ 12.00 ");
		System.out.println(" 5 | Refrigerante    | R$ 8.00  ");
		System.out.println(" 6 | Suco de Laranja | R$ 13.00 ");
		codProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade que deseja: ");
		quantProduto = leia.nextInt();
		
		switch(codProduto) {
		case 1: 
			valorTotal = quantProduto * 10.00f;
			
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Quantidade: " + quantProduto);
			System.out.printf("Valor total: %.2f", valorTotal);
			break; 
			
		case 2: 
			valorTotal = quantProduto * 15.00f;
			
			System.out.println("Produto: X-Salada");
			System.out.println("Quantidade: " + quantProduto);
			System.out.printf("Valor total: %.2f", valorTotal);
			break;
			
		case 3: 
			valorTotal = quantProduto * 18.00f;
			
			System.out.println("Produto: X-Bacon");
			System.out.println("Quantidade: " + quantProduto);
			System.out.printf("Valor total: %.2f", valorTotal);
			break;
			
		case 4: 
			valorTotal = quantProduto * 12.00f;
			
			System.out.println("Produto: Bauru");
			System.out.println("Quantidade: " + quantProduto);
			System.out.printf("Valor total: %.2f", valorTotal);
			break;
			
		case 5: 
			valorTotal = quantProduto * 8.00f;
			
			System.out.println("Produto: Refrigerante");
			System.out.println("Quantidade: " + quantProduto);
			System.out.printf("Valor total: %.2f", valorTotal);
			break;
			
		case 6: 
			valorTotal = quantProduto * 13.00f;
			
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Quantidade: " + quantProduto);
			System.out.printf("Valor total: %.2f", valorTotal);
			break;
			
			default: 
				System.out.println("Opção Inválida! ");
				break;
		
		}

	}

}
