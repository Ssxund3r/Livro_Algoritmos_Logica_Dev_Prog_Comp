package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[4][5];
		int B[] = new int[4];
		int C[] = new int[5];
		int i, j, s;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}
		s = 0;
		for (i = 0; i < 4; i++) {
			B[i] = 0;
		}

		for (i = 0; i < 5; i++) {
			C[i] = 0;
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				B[i] += A[i][j];
				C[j] += A[i][j];
			}
		}

		for (i = 0; i < 4; i++) {
			s += B[i];
		}

		for (i = 0; i < 5; i++) {
			s += C[i];
		}

		System.out.println("Total da operação! " + s);

		scanner.close();
	}
}
