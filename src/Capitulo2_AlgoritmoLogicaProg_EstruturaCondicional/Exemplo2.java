package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Definir a entrada de dois valores inc�gnitos (vari�veis A e B);
 *2. Efetuar a adi��o dos valores A e B e atribuir o resultado daadi��o � vari�vel X;
 *3. Verificar se o valor da vari�vel X � maior ou igual a 10; caso seja maior que 10, proceder ao c�lculo
 *de X + 5, atribuindo seu resultado � v�riavel R. Se o valor da vari�vel X n�o for maior ou igual a 10, proceder ao 
 *c�lculo de X - 7, atribuindo seu resultado � vari�vel R;
 *4. Apresentar o resultado da vari�vel R.*/
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

		System.out.println("O valor do resultado �: " + String.format("%.2f", r));

		scanner.close();
	}
}
