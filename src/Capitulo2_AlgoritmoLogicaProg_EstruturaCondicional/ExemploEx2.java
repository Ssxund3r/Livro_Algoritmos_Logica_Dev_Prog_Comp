package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo:
 * Elaborar um programa efetue a entrada dos valores da medida de tr�s pesos, autoferidos de forma
 *aleat�ria. O programa deve mostrar o maior peso fornecido.
 *
 *Entendimento: 
 *1. Ler o primeiro peso (vari�vel A);
 *2. Ler o segundo peso (vari�vel B);
 *3. Ler o terceiro peso (vari�vel C);
 *4. Criar uma vari�vel auxiliar (vari�vel X);
 *5. Assumir que a vari�vel X possui o valor da vari�vel A;
 *6. Verificar se a vari�vel X possui menor peso que a vari�vel B;
 *6.1 Se sim, fazer X assumir o valor da vari�vel B;
 *6.2 Se n�o, manter o valor da vari�vel X;
 *7. Verificar se a vari�vel X possui meno peso que a vari�vel C;
 *7.1 Se sim, fazer X assumir o valor da vari�vel C;
 *7.2 Se n�o, manter o valor da vari�vel X;
 *8. Apresentar o valor da vari�vel X que ter� o maior valor de peso.*/
public class ExemploEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, x;

		System.out.println("Digite o valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite o valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite o valor para C: ");
		c = scanner.nextInt();

		x = a;

		if (x < b) {
			x = b;
		}
		if (x < c) {
			x = c;
		}
		System.out.println("O resultado �: " + x);

		scanner.close();
	}
}
