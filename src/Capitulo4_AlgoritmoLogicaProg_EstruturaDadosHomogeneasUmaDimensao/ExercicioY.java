package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício Y: Escrever um programa que leia uma matriz A de uma dimensão com 15 elementos numéricos 
 *inteiros. Apresentar o total de elementos pares existentes na matriz.*/
public class ExercicioY {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[15];
		int i, tp, r;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor para o vator A: " + " Indice: " + i);
			A[i] = scanner.nextInt();

		}

		tp = 0;

		for (i = 0; i < 15; i++) {
			r = A[i] - 2 * (A[i] / 2);

			if (r == 0) {
				tp += 1;
			}
		}
		System.out.println("Total da operação: " + tp);

		scanner.close();
	}
}
