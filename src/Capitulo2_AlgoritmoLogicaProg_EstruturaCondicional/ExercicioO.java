package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*O. Ler um n�mero inteiro qualquer e multiplic�-lo por dois. Apresentar o resultado de 
 *multiplica��o somente se o resultado foi maior que 30*/
public class ExercicioO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x, total;

		System.out.println("Digite um valor para variavel X: ");
		x = scanner.nextInt();

		total = x * 2;

		if (total >= 30) {
			System.out.println("O valor total �: " + total);
		} else {
			System.out.println("O valor " + total + " � menor que 30! ");
		}

		scanner.close();
	}
}
