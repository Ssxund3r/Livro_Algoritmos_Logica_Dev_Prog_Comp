package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício B: Elaborar um programa que leia oito elementos inteiros em uma matriz A do tipo vetor.
 *Construir uma matriz B de mesma dimensão com os elementos da matriz A multiplicados por 3. O elemento 
 *B[1] deve ser implicado pela elemento A[1] * 3, o elemento B[2] implicado pela elemento A[2] * 3, e assim 
 *por diante, até 8. Apresentar a matriz B.*/
public class ExercicioB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[8];
		int B[] = new int[8];
		int i;

		for (i = 0; i < 8; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice " + i);
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 8; i++) {
			B[i] = A[i] * 3;

		}

		for (i = 0; i < 8; i++) {
			System.out.println("Total da operação para o vetor B: " + B[i]);
		}

		scanner.close();
	}
}
