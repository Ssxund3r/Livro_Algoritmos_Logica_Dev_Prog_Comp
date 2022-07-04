package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

/*Exercício E: Elaborar um programa que leia uma matriz A do tipo vetor com 15 elementos inteiros.
 *Construir uma matriz B do mesmo tipo, e cada elemento da matriz deve ser o resultado da fatorial correspondente
 *de cada elemento da matriz A. Apresentar as matrizes A e B.*/
public class ExercicioE {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int A[] = new int[15];
		int B[] = new int[15];
		int i, j;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();

		}

		for (i = 0; i < 15; i++) {
			B[i] = 1;

			for (j = 0; j < A[i]; j++) {
				B[i] *= j;

			}

			for (i = 0; i < 15; i++) {
				System.out.println("|-------------------------|");
				System.out.println("| Total vetor A: " + A[i]);
				System.out.println("|-------------------------|");
				System.out.println("| Total vetor B: " + B[i]);
				System.out.println("|-------------------------|");

			}

		}
		scanner.close();
	}
}
