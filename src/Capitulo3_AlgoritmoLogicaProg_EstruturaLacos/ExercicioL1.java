package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

public class ExercicioL1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i, j, n, s, f;

		s = 0;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para N:");
			n = scanner.nextInt();

			f = 1;

			for (j = 1; j < n; j++) {
				f *= j;
				s += f;
			}

			System.out.println("Total: " + s + " Indice: " + i);
		}

		scanner.close();
	}
}
