package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*N. Construir um programa que leia tr�s valores inteiros (representados pelas vari�veis A, B e C)
 *e apresentar como resultado final, armazenado em mem�ria, o valor do quadrado da soma dos tr�s valores lidos.*/
public class ExercicioN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, x;
		
		System.out.println("Digite o valor para A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor para B: ");
		b = scanner.nextInt();
		
		System.out.println("Digite o valor para C: ");
		c = scanner.nextInt();
		
		x = (int) Math.pow(a + b + c, 2);
		
		System.out.println("O valor do quadrado com a soma dos tr�s valores �: " + x);
		
		scanner.close();
	}

}
