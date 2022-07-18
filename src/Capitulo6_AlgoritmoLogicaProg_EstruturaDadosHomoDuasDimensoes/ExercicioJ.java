package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[5][5];
		int B[][] = new int[5][5];
		int i, j;
		double s;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		s = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i == j) {
					s = s + A[i][j];
				}
			}
		}

		System.out.println("Total da operação! " + " ---- " + s);

		scanner.close();
	}
}
