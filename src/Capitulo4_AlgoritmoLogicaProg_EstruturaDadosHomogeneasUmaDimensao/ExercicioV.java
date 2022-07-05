package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício V: Contruir um programa que leia uma matriz A de uma dimensão do tipo vetor com 30 elementos
 *inteiros do tipo inteiro. Ao final do programa, apresentar a quantidade de valores pares e impares existentes na referida matriz.*/
public class ExercicioV {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[30];
		int i, r, quantidadePar, quantidadeImpar;

		for (i = 0; i < 30; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();

		}

		quantidadePar = 0;
		quantidadeImpar = 0;

		for (i = 0; i < 30; i++) {
			r = A[i] - 2 * (A[i] / 2);

			if (r == 0) {
				quantidadePar += 1;
			} else {
				quantidadeImpar += 1;
			}
		}

		System.out.println("Quantidade PAR: " + quantidadePar);
		System.out.println("Quantidade IMPAR: " + quantidadeImpar);

		scanner.close();
	}
}
