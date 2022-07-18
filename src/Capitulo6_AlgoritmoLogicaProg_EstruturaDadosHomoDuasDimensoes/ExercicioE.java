package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[12];
		int B[] = new int[12];
		int C[][] = new int[12][2];
		int i, j;

		for (i = 0; i < 12; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 12; i++) {
			System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		for (i = 0; i < 12; i++) {
			C[i][0] = A[i] * 2;
			C[i][1] = B[i] - 5;
		}

		for (i = 0; i < 12; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Total da operação! " + C[i][j]);
			}
		}
		
		scanner.close();
	}
}
