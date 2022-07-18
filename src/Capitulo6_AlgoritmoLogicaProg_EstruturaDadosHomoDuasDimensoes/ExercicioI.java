package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[7][7];
		int B[][] = new int[7][7];
		int i, j, k, ri, rj;

		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				if (i == j) {
					ri = i - 2 * (i / 2);
					rj = j - 2 * (j / 2);

					if (ri == 1 && rj == 1) {
						B[i][j] = 1;
						for (k = 0; k < A[i][j]; k++) {
							B[i][j] *= k;
						}

					} else {
						B[i][j] = 0;
					}
					for (k = 0; k < A[i][j]; k++) {
						B[i][j] += k;
					}
				}
			}
		}

		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				System.out.println("Total da operação! -> " + B[i][j]);
			}
		}

		scanner.close();
	}
}
