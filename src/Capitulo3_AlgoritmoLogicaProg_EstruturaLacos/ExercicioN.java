package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercício N: Elaborar um programa que leia sucessivamente valores numéricos e apresente no final 
 *o somatório, a média e o total de valores lidos. O programa deve ler os valores enquanto o usuário
 *estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um
 *valor negativo (menor que zero).*/
public class ExercicioN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total;
		double soma, media, n;

		total = 0;
		soma = 0;
		n = 0;

		while (n >= 0) {
			
			System.out.println("Digite um valor: ");
			n = scanner.nextDouble();

			if (n >= 0) {
				soma = soma + n;
				total++;
			}

			if (total > 0) {
				media = soma / total;

				System.out.println("------------------------------------------------");
				System.out.println("Média: " + String.format("%.2f", media) + " Total: " + total + " Soma: " + soma);
				System.out.println("------------------------------------------------");
			}

		}
		System.out.println("Encerando o programa... ");
		scanner.close();
	}
}
