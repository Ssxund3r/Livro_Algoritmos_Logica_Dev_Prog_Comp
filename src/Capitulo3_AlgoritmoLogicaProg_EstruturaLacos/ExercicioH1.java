package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

public class ExercicioH1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int p, b, i, e;

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para E: ");
		e = scanner.nextInt();

		p = 1;

		for (i = 0; i < e; i++) {
			p *= b;

		}
		System.out.println(p);

		scanner.close();
	}

}
