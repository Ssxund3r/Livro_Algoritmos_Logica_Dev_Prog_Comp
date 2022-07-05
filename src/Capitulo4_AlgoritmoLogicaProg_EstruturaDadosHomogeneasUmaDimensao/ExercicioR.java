package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício R: Elaborar um programa que leia seis elementos(valores inteiros) para as matrizes A e B de uma dimensão
 *do tipo vetor. Construir as matrizes C e D de mesmo tipo e dimensão. A matriz C deve ser formada pelos elementos de indice impar
 *das matrizes A e B. Apresentar os elementos das matrizes C e D.*/
public class ExercicioR {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[6];
		int B[] = new int[6];
		int C[] = new int[6];
		int D[] = new int[6];
		int i, j, k, r, x, y;

		for (i = 0; i < 6; i++) {
			System.out.println("Digite um numero inteiro para o vetor A: " + " indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 6; i++) {
			System.out.println("Digite um numero inteiro para o vetor B: " + " indice: " + i);
			B[i] = scanner.nextInt();

		}

		j = 1;
		k = 2;
		x = 1;
		y = 1;

		for (i = 0; i < 6; i++) {
			r = i - 2 * (i / 2);

			if (r != 0) {

				C[x] = A[j];
				C[x + 3] = B[j];
				j += 2;
				x += 1;
			} else {

				D[y] = A[k];
				D[y + 3] = B[k];
				k += 2;
				y += 1;
			}

			for (i = 0; i < 6; i++) {
				System.out.println("Vetor C: " + C[i]);
				System.out.println("Vetor D: " + D[i]);
			}
		}
		scanner.close();
	}
}
