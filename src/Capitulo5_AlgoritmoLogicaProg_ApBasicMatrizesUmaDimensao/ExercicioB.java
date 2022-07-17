package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exerc�cio B: Elaborar um programa que leia oito elementos num�ricos inteiros em uma matriz A de uma dimens�o do tipo vetor.
 * COnstruir uma matriz B do mesmo tipo e dimens�o com os elementos da matriz A multiplicados por 5. Montar uma rotina de pesquisa bin�ria oara oesquisar os 
 * elementos armazenados na matriz B.*/
public class ExercicioB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[8];
		int B[] = new int[8];
		int i, j, x, resp, comeco, meio, fim, pesq;
		boolean acha;

		// Trecho entrada de numeros inteiros no vetor A
		for (i = 0; i < 8; i++) {
			System.out.println("Digite um n�mero inteiro para o vetor A: " + " Index: " + i);
			A[i] = scanner.nextInt();

		}

		// Trecho entrada para o opera��o do vetor B
		for (i = 0; i < 8; i++) {
			B[i] = A[i] * 5;
		}

		// Trecho do m�todo para troca
		for (i = 1; i < 7; i++) {
			for (j = i + 1; j < 8; j++) {
				if (B[i] > B[j]) {
					x = B[i];
					B[i] = B[j];
					B[j] = x;
				}
			}
		}

		// Trecho Busca Bin�ria
		resp = 0;
		while (resp == 1) {
			System.out.println("Digite o n�mero a ser pesquisado! ");
			pesq = scanner.nextInt();

			comeco = 1;
			fim = 8;
			acha = false;
			while (comeco <= fim && acha == false) {
				meio = (comeco + fim) / 2;
				if (pesq == B[meio]) {
					acha = true;
				} else if (pesq < B[meio]) {
					fim = meio - 1;
				} else {
					comeco = meio + 1;
				}
			}

			if (acha == true) {
				System.out.println(pesq + " foi localizado na posi��o! ");
			} else {
				System.out.println(pesq + " n�o foi localizado! ");
			}
			System.out.println("Deseja continuar? ");
			resp = scanner.nextInt();
		}

		scanner.close();
	}
}
