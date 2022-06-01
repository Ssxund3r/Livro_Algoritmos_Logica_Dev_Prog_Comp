package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*1. Ler um valor para o raio, no caso, variável R;
 *2. Estabelecer que PI venha a possuir o valor 3.14159265;
 *3. Efetuar o cálculo da área, elevando ao quadrado o valor de R e multiplicando esse valor por PI;
 *4. Apresentar a variável A.*/
public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A, R, PI;

		PI = 3.14159265;

		System.out.println("Digite o valor do raio");
		R = scanner.nextDouble();

		A = PI * Math.pow(R, 2);

		System.out.println("O valor do cálculo de área de circunferência é:" + A);

		scanner.close();
	}
}
