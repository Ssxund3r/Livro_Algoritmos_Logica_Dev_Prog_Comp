package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Elaborar um programa que leia dois valores num�ricos reais desconhecidos representados pelas variaveis A e B
 *Calcular, armazenar e apresentar os resultados das quatro opera��es aritm�ticas b�sicas.*/
public class ExercicioS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, r1, r2, r3, r4;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextDouble();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextDouble();

		r1 = a + b;
		r2 = a - b;
		r3 = a * b;
		r4 = a / b;

		System.out.println("O valor da opera��o aritm�tica em adi��o �: " + String.format("%.2f", r1));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("O valor da opera��o aritm�tica em subtra��o �: " + String.format("%.2f", r2));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("O valor da opera��o aritm�tica em multiplica��o �: " + String.format("%.2f", r3));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("O valor da opera��o aritm�tica em divis�o �: " + String.format("%.2f", r4));

		scanner.close();
	}
}
