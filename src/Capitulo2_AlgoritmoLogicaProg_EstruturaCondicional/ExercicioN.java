package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*N. Efetuar a leitura de três valores inteiros desconhecidos representados pelas variáveis A, B, e C
 *somar os valores fornecidos e apresentar o resultado somente se for maior ou igual a 100.*/
public class ExercicioN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, total;

		System.out.println("Digite um valor para variavel A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para Variavel B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para Variavel C: ");
		c = scanner.nextInt();

		total = a + b + c;

		if (total >= 100) {
			System.out.println("O resultado é: " + total);
		} else {
			System.out.println(
					"O valor válido somente se for maior ou igual à 100! " + total + " é um valor inferior... ");
		}

		scanner.close();
	}
}
