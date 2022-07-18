package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[5][3];
		int B[][] = new int[5][3];
		int C[][] = new int[5][3];
		int i, j;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite um numero inteiro vetor A: " + " Index: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite um numero inteiro para o vetor B: " + " Index: " + i);
				B[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Total da operação --> " + C[i][j]);

			}
		}

		scanner.close();
	}
}
