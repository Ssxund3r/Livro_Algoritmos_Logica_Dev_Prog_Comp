package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Elaborar um programa que calcule e apresente o valor do resultado da área de uma circunferência
 *(Variável A). O programa deve solicitar a entrada do valor do raio da circunferência (variável R).
 *Para a execução deste problema, utiliza a fórmula A <- 3.14159265 * R ^ 2.*/
public class ExercicioQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, r;

		System.out.println("Digite o valor do raio da circunferência: ");
		r = scanner.nextDouble();

		a = Math.pow(3.14159265 + r, 2);

		System.out.println("A área da circunferência é: " + String.format("%.2f", a));

		scanner.close();
	}
}
