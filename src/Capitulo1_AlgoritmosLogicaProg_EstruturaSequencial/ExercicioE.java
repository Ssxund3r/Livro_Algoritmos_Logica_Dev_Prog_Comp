package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

/*E. Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso, utilizando a 
 *fórmula PRESTACAO <- VALOR + (VALOR * (TAXA / 100) * TEMPO)*/
import java.util.Scanner;

public class ExercicioE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double valor, tempo, taxa, prestacao;

		System.out.println("Digite o valor da prestação: ");
		valor = scanner.nextDouble();

		System.out.println("Digite o tempo da prestação: ");
		tempo = scanner.nextDouble();

		System.out.println("Digite a taxa de prestação: ");
		taxa = scanner.nextDouble();

		prestacao = valor + ((valor * taxa / 100) * tempo);

		System.out.println("O total da prestação de bem em atraso é: " + String.format("%.2f", prestacao));

		scanner.close();
	}

}
