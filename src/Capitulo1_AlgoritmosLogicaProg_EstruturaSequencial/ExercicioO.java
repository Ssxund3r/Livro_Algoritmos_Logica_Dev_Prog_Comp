package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Elaborar um programa que leia quatro valores num�ricos (vari�veis A, B, C, e D)
 *Ao final, o programa deve apresentar o resultado, armazenado em mem�ria, do produto,
 *(vari�vel P) do primeiro com o terceiro valor, e o resultado da soma (vari�vel S) do
 *segundo com quarto valor.*/
public class ExercicioO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, p, s;
		
		System.out.println("Digite o valor para A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor para B: ");
		b = scanner.nextInt();
		
		System.out.println("Digite o valor para C: ");
		c = scanner.nextInt();
		
		System.out.println("Digite o valor para D: ");
		d = scanner.nextInt();
		
		p = a * c;
		
		s = b + d;
		
		System.out.println("O valor para produto do primeiro e terceiro valor �: [A, C] " + p);
		System.out.println("---------------------------------------------------------");
		System.out.println("O valor para Soma do segundo e quarto valor �: [B, D] " + s);
		
		
		
		
		scanner.close();
	}
}
