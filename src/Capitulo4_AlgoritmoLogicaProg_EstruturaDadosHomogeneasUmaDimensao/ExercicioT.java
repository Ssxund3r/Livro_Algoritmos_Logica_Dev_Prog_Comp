package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

/*Exercícico T: Escrever um programa que leia duas matrizes A e B de uma dimensão com dez elementos.
 *A matriz A deve aceitar apenas a entrada de valores divisiveis por 2 e 3, enquanto a matriz B deve aceitar 
 *apenas a entrada de valores múltiplos de 5. A entrada das matrizes deve ser validada pelo programa, e não pelo usuário. 
 *Construir uma matriz C que seja o resultado da junçõa das matrizes A e B, de modo que contenha 20 elementos. Apresentar os elementos 
 *da matriz C.*/
public class ExercicioT {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[20];
		int i, r2, r3, r5;

		for (i = 0; i < 10; i++) {
			do {
				System.out.println("Digite um numero inteiro para o vetor A: " + " Indice: " + i);
				A[i] = scanner.nextInt();

				r2 = A[i] - 2 * (A[i] / 2);
				r3 = A[i] - 3 * (A[i] / 3);

			} while (r2 == 0 && r3 == 0);
		}

		for (i = 0; i < 10; i++) {
			do {
				System.out.println("Digite um numero inteiro para o vetor B: " + " Indice: " + i);
				B[i] = scanner.nextInt();

				r5 = B[i] - 5 * (B[i] / 5);

			} while (r5 == 0);
		}

		for (i = 0; i < 10; i++) {
			C[i] = A[i];
			C[i + 10] = B[i];

		}

		for (i = 0; i < 20; i++) {
			System.out.println("Total da operação: " + C[i]);
		}

		scanner.close();
	}
}
