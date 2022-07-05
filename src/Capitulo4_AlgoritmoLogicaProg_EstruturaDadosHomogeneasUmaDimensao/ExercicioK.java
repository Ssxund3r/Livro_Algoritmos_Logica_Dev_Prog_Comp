package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício K: Elaborar um programa que leia uma matriz A do tipo vetor com dez elementos inteiros positivos.
 *Construir uma matriz B de mesmo tipo e dimensão, em que cada elemento da matriz B deve ser o valor negativo do elemento 
 *correspondente da matriz A. Desta forma, se em A[1] estiver armazenado o elemmento 8, então deve estar em B[1] o valor -8.
 *Apresentar os valores da matriz B.*/
public class ExercicioK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int B[] = new int[10];
		int i;

		for (i = 1; i < 10; i++) {
			System.out.println("Digite um valor para o vetor A: ");
			A[i] = scanner.nextInt();

		}

		for (i = 1; i < 10; i++) {
			B[i] = A[i] * (-1);
		}
		for (i = 1; i < 10; i++) {
			System.out.println("O valor negativo da operação é: " + B[i]);
		}

		scanner.close();
	}
}
