package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

public class ExercicioM1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i, n, soma;
		double media;

		soma = 0;
		for (i = 0; i < 10; i++) {
			System.out.println("Digite um valor inteiro para N: " + " Indice: " + i);
			n = scanner.nextInt();
			soma += n;
		}

		media = soma / 10;

		System.out.println("Media: " + media + " --- " + " Soma: " + soma);

		scanner.close();
	}
}
