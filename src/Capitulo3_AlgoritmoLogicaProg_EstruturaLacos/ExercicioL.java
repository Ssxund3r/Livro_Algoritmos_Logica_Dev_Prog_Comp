package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercicio L: Elaborar um programa que leia quinze valores numéricos reais e apresente no final o somatório 
 * da fatorial de cada valor lido.*/
public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i, j, n, s, f;

		s = 0;
		i = 0;

		while (i <= 15) {
			System.out.println("Digite um valor inteiro: ");
			n = scanner.nextInt();

			f = 1;
			j = 1;

			while (j <= n) {
				f = f * j;
				j = j + 1;

			}
			s = s + f;
			i++;
			System.out.println("------------------");
			System.out.println("O total é: " + s + " |" + " laço: " + i);
			System.out.println("------------------");
		}

		scanner.close();
	}
}
