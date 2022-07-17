package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[20];
		int B[] = new int[20];
		int i, j, x;

		for (i = 0; i < 20; i++) {
			do {
				System.out.println("Digite um numero inteiro para o vetor A: " + " Indice: " + i);
				A[i] = scanner.nextInt();
			} while (A[i] < 0);
		}

		for (i = 0; i < 20; i++) {
			B[i] = A[i] * (-1);
		}

		for (i = 0; i < 19; i++) {
			for (j = i + 1; j < 20; j++) {
				if (B[i] < B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;
				}
			}
		}

		for (i = 0; i < 20; i++) {
			System.out.println("Total da operação! " + B[i]);
		}

		scanner.close();
	}
}
