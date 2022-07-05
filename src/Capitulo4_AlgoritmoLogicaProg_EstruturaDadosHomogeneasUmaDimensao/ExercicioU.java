package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio U: Elaborar um programa que leia matrizes A e B de uma dimensão com 12 elementos. 
 *A matriz A deve aceitar apenas a entrada de valores divisiveis por 2 ou 3, enquanto a matriz B
 *deve aceitar apenas a entrada de valores que não sejam múltiplos de 5. A  entrada das matrizes 
 *deve ser validada pe programa, e não pelo usuário. Construir uma matriz C que seja o resultado 
 *da junção das matrizes A e B, de forma que contenha 24 elementos. Apresentar os elementos da matriz C.*/
public class ExercicioU {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[12];
		int B[] = new int[12];
		int C[] = new int[24];

		int i, r2, r3, r5;

		for (i = 0; i < 12; i++) {
			do {
				System.out.println("Digite um valor inteiro para o vetor A: " + " Indice " + i);
				A[i] = scanner.nextInt();

				r2 = A[i] - 2 * (A[i] / 2);
				r3 = A[i] - 3 * (A[i] / 3);

			} while (r2 == 0 || r3 == 0);
		}

		for (i = 0; i < 12; i++) {
			do {
				System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
				B[i] = scanner.nextInt();

				r5 = B[i] - 5 * (B[i] / 5);

			} while (!(r5 == 0));
		}

		for (i = 0; i < 12; i++) {
			C[i] = A[i];
			C[i + 12] = B[i];
		}

		for (i = 0; i < 24; i++) {
			System.out.println("Total da operação: " + C[i]);
		}

		scanner.close();
	}
}
