package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exemplo#5: Elaborar um programa que efetue a entrada de um valor num�rico inteiro qualquer. Em seguida
 *calcular o valor de entrada, multiplicando-o por 3 e apresentando o resultado. Proceder a execu��o dos 
 *passo anteriores cinco vezes.*/
import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N, R, I;
		I = 1;
		do {

			System.out.println("digite um valor inteiro: ");
			N = scanner.nextInt();

			R = N * 3;
			
			System.out.println("O valor total da opera��o �: " + R);
			System.out.println();
			
			System.out.println("Contador: " + I);
			I++;

		} while (I <= 5);

		scanner.close();
	}
}
