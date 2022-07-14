package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo 5: Elaborar um programa que leia duas matrizes A e B de uma dimensão do tipo vetor, com 20 elementos
 * inteiros cada. Construir uma matriz C de mesmo tipo e dimensão que seja formada pela subtração de cada um dos 
 * elemtnso da matriz A de cada elemento correspondente da matriz B. Montar o trecho da pesquisa sequencial para 
 * pesquisar os elementos existentes na matriz C.
 * Entendimento:
 * 1. Efetuar a leitura de 20 elementos inteiros da matriz A;
 * 2. Ler os 20 elementos inteiros da matriz B;
 * 3. Criar uma matriz C que conterá o valor da subtração da matrzi A em relação á matriz B;
 * 4. Apresentar os valores da matriz C a partir da pesquisa sequencial.*/
public class Exemplo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[20];
		int B[] = new int[20];
		int C[] = new int[20];
		String resp;
		int i, pesq;
		boolean acha;

		// Trecho de entrada de dados da matriz A
		for (i = 0; i < 20; i++) {
			System.out.println("Digite um valor inteiro para a matriz A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}

		// Trecho de entrada de dados da matriz B
		for (i = 0; i < 20; i++) {
			System.out.println("Digite um valor inteiro para a matriz B: " + " Indice: " + i);
			B[i] = scanner.nextInt();
		}

		// Trecho de criação da matriz C
		for (i = 0; i < 20; i++) {
			C[i] = A[i] - B[i];
		}

		// Trecho de pesquisa sequencial

		resp = "s";
		while (resp == "s") {
			System.out.println("Digite o numero a ser localizado ");
			pesq = scanner.nextInt();
			i = 1;
			acha = false;
			while (i < 20 && acha == false) {
				if (pesq == C[i]) {
					acha = true;
				} else {
					i += 1;
				}
			}
			if (acha == true) {
				System.out.println(pesq + " foi localizado na posição " + i);
			} else {
				System.out.println(pesq + " não foi localizado");
			}
		}
		System.out.println("Encerrando.....");
		scanner.close();
	}
}
