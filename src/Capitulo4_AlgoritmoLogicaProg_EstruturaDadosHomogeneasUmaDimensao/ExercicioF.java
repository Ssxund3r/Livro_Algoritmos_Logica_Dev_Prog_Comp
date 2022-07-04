package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

/*Exercicio F: Construir um programa que leia duas matrizes A e B do tipo vetor com 15 elementos quaisquer inteiros
 *Construir uma matriz C, senda esta o resultado da junção das matrizes A e B. Desta forma, a matriz C deve ter o dobro de 
 *elementos em relação ás matrizes A e B, ou seja, a matriz C deve possuir 30 elementos. Apresentar a matriz C;*/
public class ExercicioF {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[15];
		int B[] = new int[15];
		int C[] = new int[30];

		int i;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();

		}

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		for (i = 0; i < 15; i++) {
			C[i] = A[i];
			C[i + 15] = B[i];
		}

		for (i = 0; i < 30; i++) {
			System.out.println();
			System.out.println("Total da operação: " + C[i]);
		}

		scanner.close();
	}
}
