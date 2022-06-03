package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Definir a entrada de dois valores incógnitos (variáveis A e B);
 *2. Efetuar a adição dos valores A e B e atribuir o resultado daadição à variável X;
 *3. Verificar se o valor da variável X é maior ou igual a 10; caso seja maior que 10, proceder ao cálculo
 *de X + 5, atribuindo seu resultado à váriavel R. Se o valor da variável X não for maior ou igual a 10, proceder ao 
 *cálculo de X - 7, atribuindo seu resultado à variável R;
 *4. Apresentar o resultado da variável R.*/
public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, x, r;

		System.out.println("Digite o valor para A: ");
		a = scanner.nextDouble();

		System.out.println("Digite o valor para B: ");
		b = scanner.nextDouble();

		x = a + b;

		if (x >= 10) {
			r = x + 5;
			
		} else {
			r = x - 7;
		}

		System.out.println("O valor do resultado é: " + String.format("%.2f", r));

		scanner.close();
	}
}
