package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo#2: Elaborar um programa que leia dez nomes e apresente pelo método de pesquisa sequencial os nomes que porventura
 *estejam armazenados na matriz e que coincidam com o nome de entrada de pesquisa. Além de apresentar o nome, o programa deve indicar
 *em que posiçõa da matriz ele está armazenado. Caso o nome não seja encontrado, deve informar que o nome pesuiqsado não foi localizado.
 *Entendimento: 
 *
 *1. Iniciar um laço e pedir a leitura de dez nomes;
 *2. Criar um laço que faça a pesquisa sequencial enquanto o usuário desejar. Na fase de pesquisa deve ser solicitada a informação a ser pesquisada,
 *a qual deve ser comparada com o primeiro elemento. Sendo igual, mostra; caso contrário, avança para o próximo. Se não acha em toda lista o conteúdo 
 *pesquisado, informar que não existe o elemento pesquisado; se existir, deve ser mostrado.
 *3. Encerrar a pesquisa e o programa, quando desejado.*/
public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome[] = new String[100];
		String pesq;
		int i, resp;
		boolean acha;

		// Trecho para entrada dos dados
		for (i = 0; i < 10; i++) {
			System.out.println("Digite seu primeiro nome " + " indice: " + i);
			nome[i] = scanner.nextLine();

		}

		// Inicio do trecho de pesquisa sequencial**
		resp = 1;
		while (resp == 1) {
			System.out.println("Entre com nome a ser pesquisado! ");
			pesq = scanner.nextLine();
			i = 1;
			acha = false;
			while ((i <= 10) && (acha == false)) {
				if (pesq == nome[i]) {
					acha = true;
				} else {
					i += 1;
				}
			}
			if (acha == true) {
				System.out.println(pesq + " foi localizado na posição: " + i);
			} else {
				System.out.println("Deseja continuar a pesquisa? [SIM '1' / NAO '0']: ");
				resp = scanner.nextInt();

			}
		}

		scanner.close();
	}
}
