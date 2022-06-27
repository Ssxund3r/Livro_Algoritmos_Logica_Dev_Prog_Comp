package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;


import java.util.Scanner;

/*Exercício Q: Escrever um programa que possibilite calcular a área total em metros de uma residência
 *com os cômodos sala, cozinha, banheiro, dois quartos, área de serviço, quintal, garagem, entre outros
 *que podem ser fornecidos ao programa. O programa deve solicitar a entrada do nome, da largura e do com
 *primento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem
 *solicitando ao usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda "Não",
 *o programa deve apresentar o valor total acumulado da área residencial.*/
public class ExercicioQ {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String comodo;
		int resposta;
		double total, area, largura, comprimento;

		total = 0;
		resposta = 0;
		while (resposta != 1) {
			System.out.println("Digite o cômodo: ");
			comodo = scanner.next();

			System.out.println("Digite a largura: ");
			largura = scanner.nextDouble();

			System.out.println("Digite o comprimento: ");
			comprimento = scanner.nextDouble();

			area = largura * comprimento;
			total = total + area;

			System.out.println("Area: " + String.format("%.2f", area));
			System.out.println("-----------------");
			System.out.println("Deseja calcular um novo cômodo? [Sim - 0 | Não - 1]");
			System.out.println("-----------------");
			resposta = scanner.nextInt();

		}
		System.out.println("Total: " + total);
		System.out.println("Encerrando o programa... ");

		scanner.close();
	}
}
