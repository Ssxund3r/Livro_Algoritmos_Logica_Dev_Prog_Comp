package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exemplo#4: Desenvolver um programa queleia cinco elementos numéricos inteiros de uma matriz A do tipo vetor.
 *No final, apresentar o total da soma de todos os elementos da matriz A que sejam impares.*/
public class Exemplo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int r, i, soma;
		int A[] = new int[5];

		soma = 0;

		for (i = 0; i < 5; i++) {
			System.out.println("Digite um valor inteiro: ");
			A[i] = scanner.nextInt();
		}
		for (i = 0; i < 5; i++) {
			r = A[i] - 2 * (A[i] / 2);
			if (r != 0) {
				soma += A[i];
			}
		}
		System.out.println("Total Soma: " + soma + " ---- " + " Indice " + i);

		scanner.close();
	}
}
