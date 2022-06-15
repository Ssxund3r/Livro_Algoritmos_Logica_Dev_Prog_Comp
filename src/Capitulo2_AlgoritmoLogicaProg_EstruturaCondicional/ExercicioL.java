package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*L. Fazer a leitura de um valor inteiro qualquer e apresentá-lo caso não seja maior que 3
 *Dica: para a soluçõa deste problema, utilize apenas o operador lógico de negação.*/
public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		System.out.println("Digite um valor para variavel N: ");
		n = scanner.nextInt();

		if (!(n > 3)) {
			System.out.println("O valor é " + n);
		} else {
			System.out.println("O valor é maior que 3");
		}

		scanner.close();
	}
}
