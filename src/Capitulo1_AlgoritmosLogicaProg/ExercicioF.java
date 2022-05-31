package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*F. Ler dois valores para as variaveis A e B e efetuar a troca dos valores de forma que a variável A 
 *passe a possuir o valor da variável B e a variavel B passe a possuir o valor da variável A. Apresentar os valores 
 *após a efetivação do processamento da troca*/
public class ExercicioF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, x;

		System.out.println("Digite o valor de A: ");
		a = scanner.nextInt();

		System.out.println("Digite o valor de B: ");
		b = scanner.nextInt();

		x = a;
		a = b;
		b = x;

		System.out.println("------------------------------------------------------");
		System.out.println("O valor de A:" + x);
		System.out.println("O valor de B:" + a);
		System.out.println("------------------------------------------------------");
		System.out.println("O valor inverso de A:" + a);
		System.out.println("O valor inverso de B:" + b);
		System.out.println("------------------------------------------------------");

		scanner.close();
	}
}
