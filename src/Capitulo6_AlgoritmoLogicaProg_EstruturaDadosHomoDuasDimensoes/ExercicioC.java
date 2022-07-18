package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[4][5];
		int i, j;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um numero: ");
				A[i][j] = scanner.nextInt();
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Total da operação! " + A[i][j]);
			}
		}

		scanner.close();
	}
}
