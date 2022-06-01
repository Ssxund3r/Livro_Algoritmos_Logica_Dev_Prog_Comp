package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

/*E. Efetuar o c�lculo e apresentar o valor de uma presta��o de um bem em atraso, utilizando a 
 *f�rmula PRESTACAO <- VALOR + (VALOR * (TAXA / 100) * TEMPO)*/
import java.util.Scanner;

public class ExercicioE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double valor, tempo, taxa, prestacao;

		System.out.println("Digite o valor da presta��o: ");
		valor = scanner.nextDouble();

		System.out.println("Digite o tempo da presta��o: ");
		tempo = scanner.nextDouble();

		System.out.println("Digite a taxa de presta��o: ");
		taxa = scanner.nextDouble();

		prestacao = valor + ((valor * taxa / 100) * tempo);

		System.out.println("O total da presta��o de bem em atraso �: " + String.format("%.2f", prestacao));

		scanner.close();
	}

}
