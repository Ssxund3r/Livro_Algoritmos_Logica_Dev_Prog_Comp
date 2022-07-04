package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio G: Elaborar um programa que leia duas matrizes do tipo vetor para o armazenamento de nomes de pessoa, 
 *sendo a matriz A com 20 elementos e a matriz B com 30 elementos. Construir uma matriz C, sendo esta a junçõa das matrizes A e B. 
 *Desta forma, a matriz C deve ter a capacidade e armazenar 50 elementos. Apresentar os elementos da matriz C.*/
public class ExercicioG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char A[] = new char[20];
		char B[] = new char[30];
		char C[] = new char[50];
		int i;

		for (i = 0; i < 20; i++) {
			System.out.println("Digite um nome para o vetor A: " + " indice: " + i);
			A[i] = scanner.next().charAt(0);
		}

		for (i = 0; i < 30; i++) {
			System.out.println("Digite um nome para o vetor B: " + " indice: " + i);
			B[i] = scanner.next().charAt(0);
		}

		for (i = 0; i < 50; i++) {
			if (i < 20) {
				C[i] = A[i];
			} else {
				C[i] = B[i - 20];
			}
		}

		for (i = 0; i < 50; i++) {
			System.out.println("Total da operação: " + C[i]);
		}

		scanner.close();
	}
}
