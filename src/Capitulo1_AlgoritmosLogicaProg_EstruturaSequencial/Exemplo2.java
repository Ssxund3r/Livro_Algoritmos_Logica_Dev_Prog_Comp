package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*1. Ler um valor para o raio, no caso, vari�vel R;
 *2. Estabelecer que PI venha a possuir o valor 3.14159265;
 *3. Efetuar o c�lculo da �rea, elevando ao quadrado o valor de R e multiplicando esse valor por PI;
 *4. Apresentar a vari�vel A.*/
public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A, R, PI;

		PI = 3.14159265;

		System.out.println("Digite o valor do raio");
		R = scanner.nextDouble();

		A = PI * Math.pow(R, 2);

		System.out.println("O valor do c�lculo de �rea de circunfer�ncia �:" + A);

		scanner.close();
	}
}
