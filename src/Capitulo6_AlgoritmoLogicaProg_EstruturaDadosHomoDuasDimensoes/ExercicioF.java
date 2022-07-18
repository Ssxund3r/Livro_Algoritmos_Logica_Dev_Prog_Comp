package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[5][4];
		int B[][] = new int[5][4];
		int i, j, k;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite um valor vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite um valor vetor B: " + " Indice: " + i);
				B[i][j] = 1;
				for (k = 0; k < A[i][j]; k++) {
					B[i][j] *= k;
				}
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Total operação vetor A: -> " + A[i][j]);
				System.out.println("");
				System.out.println("Total operação vetor B: -> " + B[i][j]);
			}
		}

		scanner.close();
	}
}
