package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*V. Elaborar um programa que leia dois valores numéricos inteiros, os quais devem representar a base do expoente de um potência
 *calcular a potência, armazenar em memória o resultado calculado e apresentar o resultado obtido.*/
public class ExercicioV {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int base, expoente, potencia;

		System.out.println("Digite o valor da base: ");
		base = scanner.nextInt();

		System.out.println("Digite o valor para o expoente: ");
		expoente = scanner.nextInt();

		potencia = (int) Math.pow(base, expoente);

		System.out.println("O valor da potência é: " + potencia);

		scanner.close();
	}
}
