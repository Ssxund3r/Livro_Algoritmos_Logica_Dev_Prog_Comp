package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[15][15];
		int i, j, s, r;

		for (i = 0; i < 15; i++) {
			for (j = 0; j < 15; j++) {
				System.out.println("Digite um numero inteiro vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		s = 0;
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 15; j++) {
				if (i == j) {
					r = A[i][j] - 2 * (A[i][j] / 2);

					if (r == 0) {
						s += A[i][j];
					}
				}
			}
		}

		System.out.println("Total da operação! " + s);

		scanner.close();
	}
}
