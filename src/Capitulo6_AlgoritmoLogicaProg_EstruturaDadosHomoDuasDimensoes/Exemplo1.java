package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double notas[][] = new double[8][4];
		int i, j;

		for (i = 0; i < 8; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite a notinha " + " Indice: " + i);
				notas[i][j] = scanner.nextDouble();

			}
		}

		scanner.close();
	}
}
