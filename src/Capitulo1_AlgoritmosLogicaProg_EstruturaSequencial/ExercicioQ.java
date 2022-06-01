package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Elaborar um programa que calcule e apresente o valor do resultado da �rea de uma circunfer�ncia
 *(Vari�vel A). O programa deve solicitar a entrada do valor do raio da circunfer�ncia (vari�vel R).
 *Para a execu��o deste problema, utiliza a f�rmula A <- 3.14159265 * R ^ 2.*/
public class ExercicioQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, r;

		System.out.println("Digite o valor do raio da circunfer�ncia: ");
		r = scanner.nextDouble();

		a = Math.pow(3.14159265 + r, 2);

		System.out.println("A �rea da circunfer�ncia �: " + String.format("%.2f", a));

		scanner.close();
	}
}
