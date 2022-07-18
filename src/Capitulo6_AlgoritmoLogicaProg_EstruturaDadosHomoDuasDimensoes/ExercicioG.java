package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[4][5];
		int B[][] = new int[4][5];
		int i, j;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				B[i][j] = (9 * A[i][j] + 160) / 5;
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("----------------------------------------");
				System.out.println("Teste vetor A -> " + A[i][j]);
				System.out.println("----------------------------------------");
				System.out.println("Total da operação! vetor B -> " + B[i][j]);
				System.out.println("----------------------------------------");
			}
		}

		scanner.close();
	}
}
