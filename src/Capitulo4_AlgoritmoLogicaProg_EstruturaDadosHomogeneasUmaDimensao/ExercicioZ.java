package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio Z: Elaborar um programa que leia uma matriz A de uma dimensão com dez elementos numéricos inteiros. 
 * Apresentar o total de elementos impares existente na matriz e também o percentual do valor total de números 
 * impares em relação à quantidade total de elementos armazenados na matriz. */
public class ExercicioZ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int i, ti, r;
		double pti;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}
		ti = 0;
		for (i = 0; i < 10; i++) {
			r = A[i] - 2 * (A[i] / 2);
			if (r != 0) {
				ti += 1;
			}
		}

		pti = ti / 10 * 100;
		System.out.println("Total Impares: " + ti);
		System.out.println("Total Impares Percent: " + pti);

		scanner.close();
	}
}
