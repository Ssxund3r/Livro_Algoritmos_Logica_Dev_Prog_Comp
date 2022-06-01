package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*U. Elaborar um programa de computador que calcule e apresente o valor do volume de uma esfera.
 *Utilize a fórmula VOLUME <- (4/3) * 3.14159 * (RAIO ^ 3).*/
public class ExercicioU {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double volume, raio;

		System.out.println("Digite o valor do raio: ");
		raio = scanner.nextDouble();

		volume = (4 / 3) * 3.14159 * Math.pow(raio, 3);

		System.out.println("O valor do volume de uma esfera é: " + String.format("%.2f", volume));

		scanner.close();
	}
}
