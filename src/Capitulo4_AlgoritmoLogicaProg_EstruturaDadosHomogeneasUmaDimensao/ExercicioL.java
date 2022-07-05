package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio L: Elaborar um programa que leia uma matriz A do tipo vetor com dez elementos
 *inteiro positivos. Constuir uma matriz B de mesmo tipo, em que cada elemento deve ser a metade exata de 
 *cada um dos elementos existentes da matriz A. Apresentar os elementos da matriz B.*/
public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		double B[] = new double[10];
		int i;

		for (i = 1; i < 10; i++) {
			System.out.println("Digite um valor para o vetor A: ");
			A[i] = scanner.nextInt();
		}

		for (i = 1; i < 10; i++) {
			B[i] = A[i] / 2;
		}

		for (i = 1; i < 10; i++) {
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}

		scanner.close();
	}
}
