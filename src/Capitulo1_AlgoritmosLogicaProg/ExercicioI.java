package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Efetuar a leitura de um valor num�rico inteiro e apresentar o valor o resultado do valor lido elevado ao quadrado, 
 *sem efetuar o armazenamento do resultado em mem�ria*/
public class ExercicioI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, r, rMath;

		System.out.println("Digite um valor: ");
		n = scanner.nextInt();

		r = n * n;

		// Ou...

		rMath = (int) Math.pow(n, 2);

		System.out.println("O resultado do valor �: " + r);
		System.out.println("------------------------------------");
		System.out.println("O resultado do valor �: " + rMath);

		scanner.close();
	}
}
