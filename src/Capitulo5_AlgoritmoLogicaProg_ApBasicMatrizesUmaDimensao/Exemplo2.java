package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

/*Exemplo#2: Elaborar um programa que leia dez nomes e apresente pelo m�todo de pesquisa sequencial os nomes que porventura
 *estejam armazenados na matriz e que coincidam com o nome de entrada de pesquisa. Al�m de apresentar o nome, o programa deve indicar
 *em que posi��a da matriz ele est� armazenado. Caso o nome n�o seja encontrado, deve informar que o nome pesuiqsado n�o foi localizado.
 *Entendimento: 
 *
 *1. Iniciar um la�o e pedir a leitura de dez nomes;
 *2. Criar um la�o que fa�a a pesquisa sequencial enquanto o usu�rio desejar. Na fase de pesquisa deve ser solicitada a informa��o a ser pesquisada,
 *a qual deve ser comparada com o primeiro elemento. Sendo igual, mostra; caso contr�rio, avan�a para o pr�ximo. Se n�o acha em toda lista o conte�do 
 *pesquisado, informar que n�o existe o elemento pesquisado; se existir, deve ser mostrado.
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
				System.out.println(pesq + " foi localizado na posi��o: " + i);
			} else {
				System.out.println("Deseja continuar a pesquisa? [SIM '1' / NAO '0']: ");
				resp = scanner.nextInt();

			}
		}

		scanner.close();
	}
}
