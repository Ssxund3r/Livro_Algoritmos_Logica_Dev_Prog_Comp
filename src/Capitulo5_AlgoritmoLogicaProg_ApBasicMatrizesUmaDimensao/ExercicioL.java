package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char A[] = new char[10];
		char B[] = new char[10];
		char x;
		int i, j;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um caracter: " + " Indice: " + i);
			A[i] = scanner.next().charAt(0);

		}

		for (i = 0; i < 10; i++) {
			B[i] = (char) ((char) A[i] - 8);
		}

		for (i = 0; i < 9; i++) {
			for (j = i + 1; j < 10; j++) {
				if (B[i] > B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Total da operação! " + B[i]);
		}

		scanner.close();
	}
}
