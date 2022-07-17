package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioH {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[15];
		int B[] = new int[15];
		int i, j, x;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um numero inteiro: " + " Indice: " + i);
			A[i] = scanner.nextInt();

			B[i] = A[i] / 2;
		}

		for (i = 0; i < 14; i++) {
			for (j = i + 1; j < 15; j++) {
				if (A[i] < A[j]) {
					x = A[i];
					A[i] = A[j];
					A[j] = x;
				}
				if (B[i] > B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;
				}
			}
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Total operação vetor A: " + A[i]);
			
			System.out.println("Total operação vetor B: " + B[i]);
		}

		scanner.close();
	}
}
