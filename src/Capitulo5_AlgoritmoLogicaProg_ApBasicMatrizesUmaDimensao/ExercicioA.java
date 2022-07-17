package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exercicio A: Elaborar um programa que leia 12 elementos numéricos, inteiros em uma matriz do tipo vetor
 * Coloque-os em ordem decrescente e apresente os elementos ordenados.*/
public class ExercicioA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[12];
		int i, j, x;

		// Trecho de entrada de números inteiros para o vetor A
		for (i = 0; i < 12; i++) {
			System.out.println("Digite um numero inteiro ae... " + " Repete... " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 1; i < 11; i++) {
			for (j = i + 1; j < 12; j++) {
				if (A[i] < A[j]) {
					x = A[i];
					A[i] = A[j];
					A[j] = x;
				}
			}
		}

		for (i = 0; i < 12; i++) {
			System.out.println("Resultado da operação -> " + A[i]);
		}

		scanner.close();
	}
}
