package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[7][7];
		int i, j, totalPar, r;

		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		totalPar = 0;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				r = A[i][j] - 2 * (A[i][j] / 2);
				if (r == 0) {
					totalPar += 1;
				}
			}
		}

		System.out.println("Total da operação! -> " + totalPar);

		scanner.close();
	}
}
