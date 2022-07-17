package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exercicio C: Construir um programa que leia 15 elementos numéricos inteiros em uma matriz A de uma dimensão do tipo vetor.
 *Construir uma matriz B de mesmo tipo e dimensão, em que cada elemento seja o fatorial do elemento correspondente armazenado na matriz A
 *Apresentar os elementos da matriz B ordenado de forma crescente.*/
public class ExercicioC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[15];
		int B[] = new int[15];
		int x, j, i;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um numero inteiro para o vetor A: " + " Indice " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 15; i++) {
			B[i] = 1;
			for (j = 0; j < A.length; j++) {
				B[i] *= j;
			}
		}

		for (i = 1; i < 15; i++) {
			for (j = i + 1; j < 15; j++) {
				if (B[i] > B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;

				}
			}
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Total da operação! " + B[i]);
		}

		scanner.close();
	}
}
