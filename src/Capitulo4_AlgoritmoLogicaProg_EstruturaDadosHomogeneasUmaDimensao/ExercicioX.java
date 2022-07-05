package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio X: Elaborar um programa que leia uma matriz A de uma dimensão com seis elementos do tipo real. Construir
 *uma matriz B, em que cada posição de indice impar da matriz B deve ser atribuida com um elemento de indice par existente na matriz A
 *e cada posição de indice par da matriz B deve ser atribuida com um elemento de indice impar existente na matriz A. Apresentar os elementos 
 *das duas matrizes.*/
public class ExercicioX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[6];
		double B[] = new double[6];

		int i, r;

		for (i = 0; i < 6; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();

		}

		for (i = 0; i < 6; i++) {
			r = i - 2 * (i / 2);

			if (r != 0) {
				B[i] = A[i] + 1;
			} else {
				B[i] = A[i] - 1;
			}
		}

		for (i = 0; i < 6; i++) {
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
			System.out.println("----------------------");
		}

		scanner.close();
	}
}