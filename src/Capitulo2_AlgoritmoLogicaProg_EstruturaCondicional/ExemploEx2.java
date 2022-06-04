package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo:
 * Elaborar um programa efetue a entrada dos valores da medida de três pesos, autoferidos de forma
 *aleatória. O programa deve mostrar o maior peso fornecido.
 *
 *Entendimento: 
 *1. Ler o primeiro peso (variável A);
 *2. Ler o segundo peso (variável B);
 *3. Ler o terceiro peso (variável C);
 *4. Criar uma variável auxiliar (variável X);
 *5. Assumir que a variável X possui o valor da variável A;
 *6. Verificar se a variável X possui menor peso que a variável B;
 *6.1 Se sim, fazer X assumir o valor da variável B;
 *6.2 Se não, manter o valor da variável X;
 *7. Verificar se a variável X possui meno peso que a variável C;
 *7.1 Se sim, fazer X assumir o valor da variável C;
 *7.2 Se não, manter o valor da variável X;
 *8. Apresentar o valor da variável X que terá o maior valor de peso.*/
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
		System.out.println("O resultado é: " + x);

		scanner.close();
	}
}
