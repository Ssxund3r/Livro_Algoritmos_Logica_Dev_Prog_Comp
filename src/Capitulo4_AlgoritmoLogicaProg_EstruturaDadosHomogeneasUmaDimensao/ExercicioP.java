package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio P: Elaborar um programa que leia 12 elementos inteiros para matriz A de uma dimens�o do tipo vetor.
 *Construir uma matriz B de mesmos tipo e dimens�o, observando a seguinte lei de forma��o: "todo elemento da matriz A que for impar deve
 *ser multiplicado por 2; caso contr�rio, o elemento da matriz A deve permanecer constante". Apresentar os elementos da matriz B.*/
public class ExercicioP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[12];
		int B[] = new int[12];
		int i, r;

		for (i = 0; i < 12; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 12; i++) {
			r = A[i] - 2 * (A[i] / 2);

			if (r != 0) {
				B[i] = A[i] * 2;
			} else {
				B[i] = A[i];
			}
		}

		for (i = 0; i < 12; i++) {
			System.out.println("Total da opera��o: " + B[i]);
		}

		scanner.close();
	}
}
