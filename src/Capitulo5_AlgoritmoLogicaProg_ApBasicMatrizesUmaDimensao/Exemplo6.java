package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo 6: Elaborar um programa que leia uma matriz A com 15 elementos inteiros e uma matriz B
 *com 35 elementos inteiros. Construir uma matrzi C de mesmo tipo e dimensão que seja formada pela junção
 *dos elementos das matriz A e B de forma que possa armazenar 50 elementos. Montar o trecho de pesquisa 
 *binária para pesquisar os elementos existentes na matriz C.
 *
 *Entendimento: 
 *1. Efetuar a leitura dos 15 elementos intieors da matriz A;
 *2. Efetuar a leitura dos 35 elementos intieors da matriz B;
 *3. Criar a matriz C com 50 elementos como junção das matrizes A e B;
 *4. Apresentar os valores da matriz C a partir da pesquisa binária.*/
public class Exemplo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[35];
		int B[] = new int[35];
		int C[] = new int[50];
		int resp, i, j, pesq, comeco, meio, fim, x;
		boolean acha;

		// Trecho de entrada de dados da matriz A
		for (i = 0; i < 15; i++) {
			System.out.println("Digite um numero inteiro matriz A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		// Trecho da entrada de dados na matriz B
		for (i = 0; i < 35; i++) {
			System.out.println("Digite um numero inteiro matriz B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		// Trecho da junção para matriz C
		for (i = 0; i < 50; i++) {
			if (i < 15) {
				C[i] = A[i];
			} else {
				//C[i] = B[i];
			}
		}

		// Trecho de ordenação da matriz C
		for (i = 0; i < 49; i++) {
			for (j = i + 1; j < 50; j++) {
				if (C[i] > C[j]) {
					x = C[i];
					C[i] = C[j];
					C[j] = x;
				}

			}

			// Trecho de pesquisa binária
			resp = 0;
			while (resp == 1) {
				System.out.println("Digite um numero para ser pesquisado: ");
				pesq = scanner.nextInt();

				comeco = 1;
				fim = 50;
				acha = false;

				while (comeco <= fim && acha == true) {
					meio = (comeco + fim) / 2;
					if (pesq == C[meio]) {
						acha = true;
					} else if (pesq < C[meio]) {
						fim = meio - 1;
					} else {
						comeco = meio + 1;
					}

					if (acha == true) {
						System.out.println(pesq + " foi localizado na posição: " + meio);
					} else {
						System.out.println(pesq + " não foi localizado! ");
					}
				}
			}
		}

		scanner.close();
	}
}
