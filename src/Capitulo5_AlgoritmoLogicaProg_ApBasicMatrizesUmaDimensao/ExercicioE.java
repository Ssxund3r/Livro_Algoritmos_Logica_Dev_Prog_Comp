package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[20];
		int B[] = new int[30];
		int C[] = new int[50];
		int i, j, x;

		// Trecho entrada numeros inteiros vetor A;
		for (i = 0; i < 20; i++) {
			System.out.println("Digite um numero inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		// Trecho entrada numeros inteiros vetor B;
		for (i = 0; i < 30; i++) {
			System.out.println("Digite um numero inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		// Trecho método junção da matiz C
		for (i = 0; i < 50; i++) {
			if (i < 20) {
				C[i] = A[i];
			} else {
				C[i] = B[i - 20];
			}
		}

		// Trecho ordenação vetor C
		for (i = 0; i < 49; i++) {
			for (j = i + 1; j < 50; j++) {
				if (C[i] < C[j]) {
					x = C[i];
					C[i] = C[j];
					C[j] = x;
				}
			}
		}

		// Trecho saída do vetor C
		for (i = 0; i < 50; i++) {
			System.out.println("Total da operação: " + C[i] + " Indice: " + i);
		}
		scanner.close();
	}
}
