package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[][] = new double[8][6];
		double B[] = new double[8];
		double s;
		int i, j;

		for (i = 0; i < 8; i++) {
			for (j = 0; j < 6; j++) {
				System.out.println("Digite um valor real para o vetor A: " + " Indice: " + i);
				A[i][j] = scanner.nextDouble();
			}
		}

		s = 0;
		for (i = 0; i < 8; i++) {
			B[i] = 0;
			for (j = 0; j < 6; j++) {
				B[i] += A[i][j];
			}
			s += B[i];
		}

		System.out.println("Total da operação! " + s);

		scanner.close();
	}
}
