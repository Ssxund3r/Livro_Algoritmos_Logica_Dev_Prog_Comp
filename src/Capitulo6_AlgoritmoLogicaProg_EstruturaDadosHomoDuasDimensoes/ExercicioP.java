package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class ExercicioP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[][] = new int[10][7];
		int i, j, r, totalPar, totalImpar;
		double percentPar, percentImpar;

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 7; j++) {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Index: " + i);
				A[i][j] = scanner.nextInt();
			}
		}
		totalPar = 0;
		totalImpar = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 7; j++) {
				r = A[i][j] - 2 * (A[i][j] / 2);
				if (r == 0) {
					totalPar += 1;
				} else {
					totalImpar += 1;
				}
			}
		}

		percentPar = totalPar / 70 * 100;
		percentImpar = totalImpar / 70 * 100;

		System.out.println("Total operação -> Total Par: " + totalPar);
		System.out.println("Total operação -> Total Impar: " + totalImpar);
		System.out.println("Total operação -> Total Percent Par " + percentPar);
		System.out.println("Total operação -> Total Percent Impar " + percentImpar);

		scanner.close();
	}
}
