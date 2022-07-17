package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
		int i, j, x;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um valor para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		for (i = 0; i < 10; i++) {
			C[i] = (int) ((int) Math.pow(A[i], 2) + Math.pow(B[i], 2));
		}

		for (i = 0; i < 9; i++) {
			for (j = i + 1; j < 10; j++) {
				if (C[i] < C[j]) {
					x = C[i];
					C[i] = C[j];
					C[j] = x;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Total da operação: " + C[i]);
		}

		scanner.close();
	}
}
