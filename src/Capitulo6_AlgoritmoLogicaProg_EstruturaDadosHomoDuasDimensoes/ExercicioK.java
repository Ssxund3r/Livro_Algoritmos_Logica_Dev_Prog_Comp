package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[6][5];
		int B[][] = new int[6][5];
		int i, j, r;

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um numero inteiro: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 5; j++) {
				r = A[i][j] - 2 * (A[i][j] / 2);
				if (r == 0) {
					B[i][j] = A[i][j] + 5;
				} else {
					B[i][j] = A[i][j] - 4;
				}
			}
		}

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("------");
				System.out.println("Operação vetor A -> " + A[i][j]);
				System.out.println("------");
				System.out.println("Operação vetor B -> " + B[i][j]);
			}
		}

		scanner.close();
	}
}
