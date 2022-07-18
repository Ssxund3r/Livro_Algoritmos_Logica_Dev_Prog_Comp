package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int C[][] = new int[10][3];
		int i, j;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um numero inteiro: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 10; i++) {
			C[i][0] = A[i] + 5;
			C[i][1] = 1;
			for (j = 0; j < A[i]; j++) {
				C[i][2] *= j;
			}
			C[i][2] = (int) Math.pow(A[i], 2);
		}

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Total da operação: " + C[i][j]);
			}
		}

		scanner.close();
	}
}
