package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercicio H: Escrever um programa que apresente como resultado a potência de uma base qualquer elevada a um expoente
 *qualquer, ou seja, de BE, em que B é o valor da base E o valor expoente. Considere apenas a entrada de valores inteiros e positivo, ou seja,
 *de valores naturais, Sugestão: não utilize o formato "BASE ^ EXPOENTE", pois é uma solução muito trivial. Use a técnica de laço, em que o valor 
 *da base deve ser multiplicado o número de vezes determinado no expoente.*/
public class ExercicioH {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int P, I, B, E;

		System.out.println("Digite um valor inteiro para B: ");
		B = scanner.nextInt();

		System.out.println("Digite um valor inteiro para E: ");
		E = scanner.nextInt();

		I = 1;
		P = 1;
		while (I <= E) {
			
			P = P * B;
			I++;
			
			System.out.println("------------------------");
			System.out.println("O resultado é: " + P);
			System.out.println("------------------------");
		}

		scanner.close();
	}
}
