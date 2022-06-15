package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*K. Efetuar a leitura de um valor numérico inteiro qualquer que esteja na faixa dos valores de 1 até 9
 *o programa deve apresentar a mensagem. "O valor está na faixa permitida", caso o valor informado esteja entre 
 *1 e 9. Se o valor estiver fora da faixa, o programa deve apresentar a mensagem. "O valor está fora da faixa permitida."*/
public class ExercicioK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		System.out.println("Digite um valor para variavel N: ");
		n = scanner.nextInt();

		if (n >= 1 && n <= 9) {
			System.out.println("O valor está na faixa permitida. ");
		} else {
			System.out.println("O valor está fora da faixa permitida... ");

		}

		scanner.close();
	}
}
