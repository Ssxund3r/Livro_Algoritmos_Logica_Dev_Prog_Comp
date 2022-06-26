package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo #3: Elaborar um programa que efetue a entrada de uma valor inteiro qualquer
 *Em seguida calcular o valor de entrada, multiplicando-o por 3 e apresentar seu resultado
 *Proceder a execução do programa cinco vezes.*/
public class Exemplo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int R, N;

		for (int i = 1; i < 5; i++) {
			System.out.println();
			System.out.println("Digite um valor inteiro: ");
			N = scanner.nextInt();

			R = N * 3;

			System.out.println("O resultado da operação é: " + R + " Total de repeção: " + i);
		}

		scanner.close();
	}
}
