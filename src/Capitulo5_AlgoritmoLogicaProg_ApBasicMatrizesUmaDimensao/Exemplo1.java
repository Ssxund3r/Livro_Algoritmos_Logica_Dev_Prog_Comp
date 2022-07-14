package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo 1: Elaborar um programa que leia os nomes de 20 pessoas em uma vari�vel composta, processar a ordena��o
 *ascendente desses nomes e apresentar a listagem dos nomes em orgem alfab�tica.
 *
 *Entendimento:
 *1. Definir uma vari�vel do tipo inteiro para controlar a execu��o do la�o;
 *2. Definir a vari�vel NOME do tipo cadeia para acesso a 20 elementos;
 *3. iniciar o programa e efetuar a entrada dos 20 nomes;
 *4. Colocar em ordem ascendente os elementos da matriz;
 *5. Apresentar a primeira letra dos 20 nomes que devem estar classificados.*/
public class Exemplo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i, j;
		char nome[] = new char[20];
		char x;

		// Trecho para entrada dos dados
		for (i = 0; i < 20; i++) {
			System.out.println("Digite o seu primeiro nome! " + " indice: " + i);
			nome[i] = scanner.next().charAt(0);
		}

		// Trecho de processamento de ordena��o
		for (i = 0; i < 19; i++) {
			for (j = i + 1; j < 20; j++) {
				if (nome[i] > nome[j]) {
					x = nome[i];
					nome[i] = nome[j];
					nome[j] = x;
				}
			}
		}
		
		// Trecho para sa�da com dados ordenados;
		for(i = 0; i < 20; i++) {
			System.out.println("Resultado Ordenado " + nome[i]);
		}

		scanner.close();
	}
}
