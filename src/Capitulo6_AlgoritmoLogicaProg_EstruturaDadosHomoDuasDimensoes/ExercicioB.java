package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[7];
		int B[] = new int[7];
		int C[][] = new int[7][2];
		int i, j;

		for (i = 0; i < 7; i++) {
			System.out.println("Digite um numero inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 7; i++) {
			System.out.println("Digite um numero inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		for (i = 0; i < 7; i++) {
			C[i][0] = A[i];
			C[i][1] = B[i];
			 
		}

		for (i = 0; i < 7; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Total da operação! -> " + C[i][j]);
			}
		}

		scanner.close();
	}
}
