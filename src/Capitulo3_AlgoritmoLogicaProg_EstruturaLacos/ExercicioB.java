package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercício B: Elaborar um programa que mostre os resultados da tabuada de um número inteiro qualquer,
 *a qual deve ser apresentada de acrodo com sua forma tradicional.*/
public class ExercicioB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N, I, R;

		I = 1;

		System.out.println("Digite um valor inteiro: ");
		N = scanner.nextInt();

		while (I <= 10) {

			R = N * I;

			System.out.println("O resultado da tabuada é: " + N + " X " + I + " = " + R);
			I++;
		}

		scanner.close();
	}
}
