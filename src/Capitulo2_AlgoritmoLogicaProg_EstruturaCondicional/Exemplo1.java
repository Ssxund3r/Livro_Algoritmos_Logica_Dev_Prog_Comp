package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Definir a entrada de dois valores inc�gnitos (vari�veis A e B);
 *2. Efetuar a adi��o dos valores A e B, atribuir o resultado para adi��o � vari�vel X;
 *3. Apresentar o resultado da soma armazenada na vari�vel X, caso a vari�vel X tenha seu valor maior que 10.*/
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
			System.out.println("O valor da opera��o �: " + x);
		}

		scanner.close();
	}
}
