package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Definir a entrada de dois valores incógnitos (variáveis A e B);
 *2. Efetuar a adição dos valores A e B, atribuir o resultado para adição à variável X;
 *3. Apresentar o resultado da soma armazenada na variável X, caso a variável X tenha seu valor maior que 10.*/
public class Exemplo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, x;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		x = a + b;

		if (x > 10) {
			System.out.println("O valor da operação é: " + x);
		}

		scanner.close();
	}
}
