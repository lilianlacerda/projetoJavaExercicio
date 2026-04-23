package exerciciosLacosRepeticao;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		int idade, genero, cargoDev, contador = 0;
		int totalPessoasBackend = 0, totalMulheresCisTransFront = 0, totalHomemCisTransMobMaiores = 0,
				totalNBinarioFullMenores = 0, totalResponderam = 0;
		float mediaIdade = 0.0f, somaIdade = 0.0f;
		String continua = "";
		Scanner leia = new Scanner(System.in);

		while (!continua.equalsIgnoreCase("n")) {

			System.out.println("Digite a Idade: ");
			idade = leia.nextInt();

			System.out.println("Digite o número respectvo para a Identidade de Gênero: ");
			System.out.println("1 - Homem Cis");
			System.out.println("2 - Mulher Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outro");
			genero = leia.nextInt();

			System.out.println("Digite o número respectivo para o cargo da Pessoa Desenvolvedora: ");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			cargoDev = leia.nextInt();
			
			System.out.println("Deseja continuar? (S/N) ");
			continua = leia.next();

			if (cargoDev == 1) {
				totalPessoasBackend++;
			} else if ((genero == 2 || genero == 4) && cargoDev == 2) {
				totalMulheresCisTransFront++;

			}else if ((genero == 1 || genero == 5) && cargoDev == 3 && idade > 40) {
				totalHomemCisTransMobMaiores++;

			}else if (genero == 3 && cargoDev == 4 && idade < 30) {
				totalNBinarioFullMenores++;

			}

			somaIdade += idade;
			contador++;

			mediaIdade = somaIdade / contador;
			totalResponderam++;

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalPessoasBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresCisTransFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedoras mobile maiores de 40 anos: "
				+ totalHomemCisTransMobMaiores);
		System.out.println("Total de pessoas não binarias desenvolvedoras FullStack menores de 30 anos: "
				+ totalNBinarioFullMenores);
		System.out.println("Numero total de pessoas que responderam a pesquisa: " + totalResponderam);
		System.out.println("A média de idade das pessoas que responderam a pesquisa: " + mediaIdade);

	}

}
