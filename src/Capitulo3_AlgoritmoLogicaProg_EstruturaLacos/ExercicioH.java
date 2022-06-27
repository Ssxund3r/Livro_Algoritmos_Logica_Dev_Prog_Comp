package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercicio H: Escrever um programa que apresente como resultado a pot�ncia de uma base qualquer elevada a um expoente
 *qualquer, ou seja, de BE, em que B � o valor da base E o valor expoente. Considere apenas a entrada de valores inteiros e positivo, ou seja,
 *de valores naturais, Sugest�o: n�o utilize o formato "BASE ^ EXPOENTE", pois � uma solu��o muito trivial. Use a t�cnica de la�o, em que o valor 
 *da base deve ser multiplicado o n�mero de vezes determinado no expoente.*/
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
			System.out.println("O resultado �: " + P);
			System.out.println("------------------------");
		}

		scanner.close();
	}
}
