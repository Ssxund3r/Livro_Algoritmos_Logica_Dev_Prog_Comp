package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*G. Fazer a leitura de quatro valores numéricos inteiros representados pelas variáveis A, B, C 
 *e D. Apresentar apenas os valores que sejam dívisiveis por 2 e 3.*/
public class ExercicioG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, d, resto2, resto3;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para C: ");
		c = scanner.nextInt();

		System.out.println("Digite um valor para D: ");
		d = scanner.nextInt();

		resto2 = a - 2 * (a / 2);
		resto3 = a - 3 * (a / 3);

		if ((resto2 == 0) && (resto3 == 0)) {
			System.out.println("O valor " + a + " é divisível por 2 e 3 ");
		}

		resto2 = b - 2 * (b / 2);
		resto3 = b - 3 * (b / 3);

		if ((resto2 == 0) && (resto3 == 0)) {
			System.out.println("O valor " + b + " é divisível por 2 e 3 ");
		}

		resto2 = c - 2 * (c / 2);
		resto3 = c - 3 * (c / 3);

		if ((resto2 == 0) && (resto3 == 0)) {
			System.out.println("O valor " + c + " é divisível por 2 e 3 ");
		}

		resto2 = d - 2 * (d / 2);
		resto3 = d - 3 * (d / 3);

		if ((resto2 == 0) && (resto3 == 0)) {
			System.out.println("O valor " + d + " é divisível por 2 e 3 ");
		}

		scanner.close();
	}
}
