package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[15];
		int B[] = new int[15];
		int C[] = new int[15];
		int D[] = new int[15];
		int E[] = new int[15];
		int i, j, x;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		for (i = 0; i < 15; i++) {
			C[i] = 0;
			for (j = 0; j < A[i]; j++) {
				C[i] += j;
			}

			D[i] = 1;
			for (j = 0; j < B[i]; j++) {
				D[i] = D[i] * j;
			}
			E[i] = (C[i] + D[i]) - (A[i] + B[i]);
		}

		for (i = 0; i < 14; i++) {
			for (j = i + 1; j < 15; j++) {
				if (E[i] > E[j]) {
					x = E[i];
					E[i] = E[j];
					E[j] = x;
				}
			}
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Total da operação! " + " --- " + E[i]);
		}

		scanner.close();
	}
}
