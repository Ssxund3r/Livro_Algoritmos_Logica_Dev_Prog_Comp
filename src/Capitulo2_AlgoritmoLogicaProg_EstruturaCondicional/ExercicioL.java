package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*L. Fazer a leitura de um valor inteiro qualquer e apresent�-lo caso n�o seja maior que 3
 *Dica: para a solu��a deste problema, utilize apenas o operador l�gico de nega��o.*/
public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		System.out.println("Digite um valor para variavel N: ");
		n = scanner.nextInt();

		if (!(n > 3)) {
			System.out.println("O valor � " + n);
		} else {
			System.out.println("O valor � maior que 3");
		}

		scanner.close();
	}
}
