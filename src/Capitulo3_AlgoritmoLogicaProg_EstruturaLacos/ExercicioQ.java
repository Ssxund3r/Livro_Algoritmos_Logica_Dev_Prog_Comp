package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;


import java.util.Scanner;

/*Exerc�cio Q: Escrever um programa que possibilite calcular a �rea total em metros de uma resid�ncia
 *com os c�modos sala, cozinha, banheiro, dois quartos, �rea de servi�o, quintal, garagem, entre outros
 *que podem ser fornecidos ao programa. O programa deve solicitar a entrada do nome, da largura e do com
 *primento de um determinado c�modo. Em seguida, deve apresentar a �rea do c�modo lido e tamb�m uma mensagem
 *solicitando ao usu�rio a confirma��o de continuar calculando novos c�modos. Caso o usu�rio responda "N�o",
 *o programa deve apresentar o valor total acumulado da �rea residencial.*/
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
			System.out.println("Digite o c�modo: ");
			comodo = scanner.next();

			System.out.println("Digite a largura: ");
			largura = scanner.nextDouble();

			System.out.println("Digite o comprimento: ");
			comprimento = scanner.nextDouble();

			area = largura * comprimento;
			total = total + area;

			System.out.println("Area: " + String.format("%.2f", area));
			System.out.println("-----------------");
			System.out.println("Deseja calcular um novo c�modo? [Sim - 0 | N�o - 1]");
			System.out.println("-----------------");
			resposta = scanner.nextInt();

		}
		System.out.println("Total: " + total);
		System.out.println("Encerrando o programa... ");

		scanner.close();
	}
}
