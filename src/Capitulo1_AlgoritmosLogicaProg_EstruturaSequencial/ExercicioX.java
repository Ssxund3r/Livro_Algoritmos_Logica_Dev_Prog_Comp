package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*X. Elaborar um programa que calcule e armazene uma raíz de base qualquer com índice qualquer*/
public class ExercicioX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double raiz, base = 0, indice;
		
		System.out.println("Digite o valor da raiz: ");
		raiz = scanner.nextDouble();
		
		System.out.println("Digite o valor do índice: ");
		indice = scanner.nextDouble();
		
		raiz = base * base +  (1 / indice);
		
		System.out.println("O resultado da raíz é: " + String.format("%.2f", raiz));
		
		scanner.close();
	}
}
