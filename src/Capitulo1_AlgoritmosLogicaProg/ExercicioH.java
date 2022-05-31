package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular, utilizando a 
 *fórmula VOLUME <- COMPRIMENTO * LARGURA * ALTURA*/
public class ExercicioH {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double comprimento, largura, altura, volume;

		System.out.println("Digite o comprimento da caixa retangular: ");
		comprimento = scanner.nextDouble();

		System.out.println("Digite a largura da caixa retangular: ");
		largura = scanner.nextDouble();

		System.out.println("Digite a altura da caixa retangular: ");
		altura = scanner.nextDouble();

		volume = (comprimento * largura) * altura;

		System.out.println("O valor do volume de uma caixa retangular é: " + String.format("%.2f", volume));

		scanner.close();
	}
}
