package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício W: Elaborar um programa que leia duas matrizes A e B de uma dimensão do tipo vetor com dez elementos inteiros cada.
 * Construir uma matriz C de mesmo tipo e dimensão que seja formada pelo quadrado da soma dos elementos correspondentes nas matrizes
 * A e B. Apresentar os elementos da matriz C.*/
public class ExercicioW {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
		int i;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um valor inteiro para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		for (i = 0; i < 10; i++) {
			C[i] = (int) Math.pow((A[i] + B[i]), 2);

		}

		for (i = 10; i < 10; i++) {
			System.out.println("Total da operação: " + C[i]);
		}

		scanner.close();
	}
}
