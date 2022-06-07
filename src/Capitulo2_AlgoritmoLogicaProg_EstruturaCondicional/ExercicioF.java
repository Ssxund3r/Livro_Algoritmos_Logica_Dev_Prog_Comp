package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*F. Ler tr�s valores inteiros representados pelas vari�veis A, B e C e apresentar os valores lidos dispostos em ordem crescente. 
 *Dica: utilizar tomada de decis�o sequencial e as ideias trabalhadas nos exerc�cios "g" (propriedade distributiva) e "f" (troca de valores) 
 *do cap�tulo 3.*/
public class ExercicioF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, x;

		System.out.println("Digite o valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para C: ");
		c = scanner.nextInt();

		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		if (a > c) {
			x = a;
			a = c;
			c = x;
		}
		if (c > b) {
			x = c;
			c = b;
			b = x;
		}
		System.out.println(a + b + c);

		scanner.close();
	}
}
