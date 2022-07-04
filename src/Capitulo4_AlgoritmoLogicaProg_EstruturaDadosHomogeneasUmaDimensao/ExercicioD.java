package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

/*Exercicio D: Elaborar um programa que leia 15 elementos inteiros de uma matriz A do tipo vetor.
 *Construir uma matriz B de mesmo tipo, observando a seguinte lei de formação: "todo elemento da matriz B
 *deve ser o quadrado do elemento da matriz A correspondente." Apresentar os elementos das matrizes A e B.*/
public class ExercicioD {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int A[] = new int[15];
		int B[] = new int[15];
		int i;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();

		}

		for (i = 0; i < 15; i++) {
			B[i] = (int) Math.pow(A[i], 2);
		}

		for (i = 0; i < 15; i++) {
			System.out.println("|-----------------------------|");
			System.out.println("| Total vetor A: " + A[i]);
			System.out.println("| Total vetor B: " + B[i]);
			System.out.println("|-----------------------------|");
		}

		scanner.close();
	}
}
