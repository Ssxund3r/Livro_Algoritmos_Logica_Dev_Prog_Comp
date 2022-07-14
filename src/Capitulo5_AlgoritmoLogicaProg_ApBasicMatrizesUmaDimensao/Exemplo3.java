package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo #3: Elaborar um programa que leia dez nomes e apresente por meio do método de pesquisa binária os nomes que porventura
 *estejam armazenados na matriz e que coincidam com o nome de entrada de pesquisa. Além de apresentar o nome, o programa deve indicar
 *em que posição da matriz ele está armazenado. Caso o nome pesquisado não seja encontrado, deve informar que o nome pesquisado não foi localizado.
 **/
public class Exemplo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char nome[] = new char[10];
		int i, j, comeco, fim, meio;
		char pesq, x, resp;
		boolean acha;

		// Trecho de entrada de dados [nome]
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o seu primeiro nome: " + " Indice: " + i);
			nome[i] = scanner.nextLine().charAt(0);
		}

		// Trecho de ordenação
		for (i = 0; i < 10; i++) {
			for (j = i + 1; j < 10; j++) {
				if (nome[i] >= nome[j]) {
					x = nome[i];
					nome[i] = nome[j];
					nome[j] = x;

				}
			}
		}

		// Trecho pesquisa binária
		resp = 's';
		while (resp == 's') {
			System.out.println("Digite o nome a ser pesquisado: ");
			pesq = scanner.nextLine().charAt(0);
			comeco = 1;
			fim = 10;
			acha = false;
			while (comeco <= fim && acha == false) {
				meio = (comeco + fim) / 2;
				if (pesq == nome[meio]) {
					acha = true;
				} else if (pesq < nome[meio]) {
					fim = meio - 1;
				} else {
					comeco = meio + 1;
				}
			}
			if (acha == true) {
				System.out.println(pesq + " foi localizado na posição " + i);
			} else {
				System.out.println(pesq + " não foi localizado! ");
			}

			System.out.println("Deseja continuar? [SIM 's' /|/ NAO 'n']");
			resp = scanner.nextLine().charAt(0);

		}
		System.out.println("Encerrando...... ");

		scanner.close();
	}
}
