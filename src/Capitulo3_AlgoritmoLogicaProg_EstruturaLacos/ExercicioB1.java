package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

public class ExercicioB1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r, i;

		System.out.println("Digite um valor inteiro: ");
		n = scanner.nextInt();

		for (i = 0; i < 10; i++) {
			r = n * i;

			System.out.println(n + " X " + i + " = " + r);
		}
		scanner.close();
	}
}
