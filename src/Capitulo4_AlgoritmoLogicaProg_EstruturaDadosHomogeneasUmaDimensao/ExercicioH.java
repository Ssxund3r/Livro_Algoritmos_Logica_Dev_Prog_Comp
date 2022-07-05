package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

/*Exercicio H: Elaborar um programa que leia 20 elementos do tipo real em uma matriz A unidimensional e construir uma matriz B de mesma
 *dimens�o com os mesmo elementos armazenados na matriz A, por�m de forma invertida. Ou seja, o primeiro elemento da matriz A passa a ser o �ltimo 
 *da matriz B, o segundo elemento da matriz A passa a ser o pen�ltimo da matriz B, e assim por diante. Apresentar os elementos das matrizes A e B.*/
public class ExercicioH {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[20];
		double B[] = new double[20];
		int i, j;

		for (i = 0; i < 20; i++) {
			System.out.println("Digite um numero inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();
		}

		for (i = 0; i < 20; i++) {
			B[i] = A[i] - 21;
		}

		for (i = 0; i < 20; i++) {
			System.out.println(" Vetor A: " + A[i]);
			System.out.println(" Vetor B: " + B[i]);
		}

		scanner.close();
	}
}
