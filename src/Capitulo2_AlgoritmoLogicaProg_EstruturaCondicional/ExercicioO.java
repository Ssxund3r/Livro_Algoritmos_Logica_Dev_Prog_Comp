package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*O. Ler um número inteiro qualquer e multiplicá-lo por dois. Apresentar o resultado de 
 *multiplicação somente se o resultado foi maior que 30*/
public class ExercicioO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x, total;

		System.out.println("Digite um valor para variavel X: ");
		x = scanner.nextInt();

		total = x * 2;

		if (total >= 30) {
			System.out.println("O valor total é: " + total);
		} else {
			System.out.println("O valor " + total + " é menor que 30! ");
		}

		scanner.close();
	}
}
