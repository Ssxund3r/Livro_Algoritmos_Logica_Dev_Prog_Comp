package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercicio R: Elaborar um programa que leia valores positivos inteiros até que um valor 
 *negativo seja informado. Ao final ser apresentado o maior e o menor valor informado pelo usuário*/
public class ExercicioR {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, valorMaior, valorMenor;

		System.out.println("Digite um valor inteiro: ");
		n = scanner.nextInt();

		valorMaior = n;
		valorMenor = n;

		while (n > 0) {
			if (valorMaior < n) {
				valorMaior = n;
			}

			else if (valorMenor > n) {
				valorMenor = n;
			}

			System.out.println(n);
		}

		System.out.println("Valor Maior: " + valorMaior);
		System.out.println("Valor Menor: " + valorMenor);

		scanner.close();
	}
}
