package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Construir um programa que leia tr�s valores num�ricos inteiros (representados pelas vari�veis A, B, e C) 
 *e apresentar como resultado final, armazenado em mem�ria, o valor da soma dos quadrados dos tr�s valores lidos.*/
public class ExercicioM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, x;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para C: ");
		c = scanner.nextInt();

		x = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

		System.out.println("A soma dos quadrados dos tr�s valores s�o: " + x);

		scanner.close();
	}
}
