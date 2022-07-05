package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercico I: Escrever um programa que leia três matrizes (A, B e C) de uma dimensão do tipo vetor com cinco 
 *elementos cada um seja do tipo real. Contruir uma matriz D, sendo esta o resultado da junção das três matrizes (A, B e C)
 *Desta forma, a matriz D deve ter o triplo de elementos das matrizes A, B e C ou seja 15 elementos. Apresentar os elementos da matriz D.*/
public class ExercicioI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[5];
		double B[] = new double[5];
		double C[] = new double[5];
		double D[] = new double[5];
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor A: ");
			A[i] = scanner.nextDouble();
		}

		for (i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor B: ");
			B[i] = scanner.nextDouble();

		}

		for (i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor C: ");
			C[i] = scanner.nextDouble();

		}

		for (i = 0; i < 5; i++) {
			D[i] = A[i];
			D[i] = B[i] + 5;
			D[i] = C[i] + 15;
		}

		for (i = 0; i < 5; i++) {
			System.out.println("Vetor D: " + D[i]);
		}

	}
}
