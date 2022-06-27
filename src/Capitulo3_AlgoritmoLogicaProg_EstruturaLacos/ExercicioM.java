package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercício M: Elaborar um programa que leia dez valores numéricos reais e apresente no final o somatório 
 *e a média dos valores lidos.*/
public class ExercicioM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i, n, soma;
		double media;

		soma = 0;
		i = 0;

		while (i <= 10) {
			System.out.println("Digite um valor inteiro: " + i);
			n = scanner.nextInt();

			soma = soma + n;
			i++;

		}
		media = soma / 10;

		System.out.println("-------------------------------------------------------");
		System.out.println("Total da soma: " + soma + " média: " + media + "  total laço repetição: " + i);
		System.out.println("-------------------------------------------------------");

		scanner.close();
	}
}
