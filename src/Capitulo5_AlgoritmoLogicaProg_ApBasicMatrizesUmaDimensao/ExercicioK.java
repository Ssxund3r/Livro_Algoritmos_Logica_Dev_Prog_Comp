package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A[] = new double[15];
		double B[] = new double[15];
		double C[] = new double[15];
		double D[] = new double[15];
		double x;
		int i, j;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextDouble();
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor para o vetor C: " + " Indice: " + i);
			C[i] = scanner.nextDouble();
		}

		for (i = 0; i < 15; i++) {
			D[i] = Math.pow(A[i] + B[i] + C[i], 3);
		}

		for (i = 0; i < 14; i++) {
			for (j = i + 1; j < 15; j++) {
				if (D[i] > D[j]) {
					x = D[i];
					D[i] = D[j];
					D[j] = x;
				}
			}
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Total da operação! " + " --- " + D[i]);
		}

		scanner.close();
	}
}
