package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioH {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[5][5];
		int B[][] = new int[5][5];
		int i, j;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i == j) {
					B[i][j] = A[i][j] * 3;
				} else {
					B[i][j] = A[i][j] * 2;
				}
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Total da operação proposta: -> " + B[i][j]);
			}
		}

		scanner.close();
	}
}
