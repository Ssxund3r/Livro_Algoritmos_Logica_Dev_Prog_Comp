package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*B. Efetuar a leitura de um valor numérico inteiro positivo ou negativo representado pela variável N
 *e apresentar o valor lido como sendo positivo. Dica: se o valor lido for menor que zero, ele deve ser multiplicado por -1.*/
public class ExercicioB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r;

		System.out.println("Digite um valor para N: ");
		n = scanner.nextInt();

		if (n < 0) {
			r = n * (-1);
		} else {
			r = n;
		}
		System.out.println("O valor da operção é: " + r);

		scanner.close();
	}
}
