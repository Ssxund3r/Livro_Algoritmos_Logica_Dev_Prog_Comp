package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/**/
public class ExercicioD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[12];
		double B[] = new double[12];
		double C[] = new double[12];
		double x;
		int i, j;

		for (i = 0; i < 12; i++) {
			System.out.println("Digite um numero inteiro vetor A: " + " indice: " + i);
			A[i] = scanner.nextDouble();
		}

		for (i = 1; i < 11; i++) {
			for (j = i + 1; j < 12; j++) {
				if (A[i] > A[j]) {
					x = A[i];
					A[i] = A[j];
					A[j] = x;
				}
			}
		}

		for (i = 0; i < 12; i++) {
			System.out.println("Digite um numero inteiro vetor B: " + " Indice: " + i);
			B[i] = scanner.nextDouble();
		}

		for (i = 1; i < 11; i++) {
			for (j = i + 1; j < 12; j++) {
				if (B[i] > B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;
				}
			}
		}

		for (i = 0; i < 12; i++) {
			C[i] = A[i] + B[i];
		}

		for (i = 1; i < 11; i++) {
			for (j = i + 1; j < 12; j++) {
				if (C[i] < C[j]) {
					x = C[i];
					C[i] = C[j];
					C[j] = x;
				}
			}
		}

		for (i = 0; i < 12; i++) {
			System.out.println("Total da operação! " + C[i]);
		}

		scanner.close();
	}
}
