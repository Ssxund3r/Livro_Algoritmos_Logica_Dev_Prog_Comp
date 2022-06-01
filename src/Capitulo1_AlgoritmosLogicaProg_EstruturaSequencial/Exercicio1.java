package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, r;

		System.out.println("Digite o valor para A!");
		a = scanner.nextInt();

		System.out.println("Digite o valor para B!");
		b = scanner.nextInt();

		if (a > b) {
			r = a + b;
			System.out.println("O valor total é:" + r);
		} else if (a < b) {
			r = a - b;
			System.out.println("O valor total é:" + r);
		} else {
			r = a * b;
			System.out.println("O valor total é: " + r);
		}

		scanner.close();
	}

}
