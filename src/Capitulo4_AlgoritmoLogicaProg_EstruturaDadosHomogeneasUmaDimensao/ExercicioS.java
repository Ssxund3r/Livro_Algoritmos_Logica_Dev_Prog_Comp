package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio S: ELaborar um programa que leia duas matrizes A e B de uma dimensão com seis elementos.
 *A matriz A deve aceitar apenas a entrada de valores pares, enquando a matriz B deve aceitar apenas a entrada de valores impares.
 *A entrada das matrizes deve ser validadda pelo programa, e não pelo usuário. Construir uma matriz C, que seja resultado da junção 
 *das matrizes A e B, de modo que a matriz C contenha 12 elementos. Apresentar os elementos da matriz C.*/
public class ExercicioS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[6];
		int B[] = new int[6];
		int C[] = new int[12];
		int i, r;

		for (i = 0; i < 6; i++) {
			do {
				System.out.println("Digite um valor inteiro para o vetor A: " + "Indice: " + i);
				A[i] = scanner.nextInt();

				r = A[i] - 2 * (A[i] / 2);
			} while (r == 0);
		}

		for (i = 0; i < 6; i++) {
			do {

				System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
				B[i] = scanner.nextInt();

				r = B[i] - 2 * (B[i] / 2);

			} while (r != 0);

		}

		for (i = 0; i < 6; i++) {
			C[i] = A[i];
			C[i + 6] = B[i];
		}

		for (i = 0; i < 12; i++) {

			System.out.println("Total da operação: " + C[i]);

		}

		scanner.close();
	}
}
