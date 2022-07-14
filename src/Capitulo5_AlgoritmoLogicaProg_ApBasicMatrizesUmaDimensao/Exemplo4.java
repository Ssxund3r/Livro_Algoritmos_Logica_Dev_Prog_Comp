package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo 4: Elaborar um programa que leia dez elementos numéricos inteiros em uma matriz A de uma dimensão do tipo vetor.
 *Construir uma matriz B de mesmo tipo e dimensão com os elementos da matriz A divisivel por cinco. Apresentar os elementos armazenados
 *na matriz B na ordem decrescente.*/
public class Exemplo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i, j;
		int A[] = new int[10];
		double B[] = new double[10];
		double x;

		// Trecho entrada de dados
		for (i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		// Trecho Criação vetor B
		for (i = 0; i < 10; i++) {
			B[i] = A[i] / 5;
		}

		// Trecho de processamento de ordenação
		for (i = 0; i < 9; i++) {
			for (j = i + 1; j < 10; j++) {
				if (B[i] > B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;
				}
			}
		}

		// Trecho de saída com dados ordenados
		for (i = 0; i < 10; i++) {
			System.out.println("Total da operação: " + B[i]);
		}

		scanner.close();
	}

}
