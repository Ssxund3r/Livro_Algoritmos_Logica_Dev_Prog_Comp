package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Efetuar a entrada, respectivamente, dos valores das variáveis A, B e X;
 *2. Verificar se o valor fornecido para variável X realmente não é maior que 5. Sendo esta condição
 *verdadeira, processar a operaçõa C <- A + B;
 *3. Apresentar o resultado obtido na variável C. */
public class Exemplo8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, x, c;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para X: ");
		x = scanner.nextInt();

		if (!(x > 5)) {
			c = a + b;
		} else {
			c = a - b;
		}

		System.out.println("O valor total é: " + c);

		scanner.close();
	}
}
