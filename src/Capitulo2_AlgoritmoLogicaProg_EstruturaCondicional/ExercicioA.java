package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*A. Efetuar a leitura de dois valores numericos inteiros representados pelas variavesi A e B;
 *apresentar o resultado da diferencça do maior valor pelo menor valor.*/
public class ExercicioA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, diferenca;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		if (a > b) {
			diferenca = a - b;
		} else {
			diferenca = b - a;
		}
		System.out.println("O resulta da operação é: " + diferenca);

		scanner.close();
	}
}
