package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*K. Elaborar um programa que apresente o valor da convers�o em d�lar (US$) de um valor lido em real (R$). 
 *O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�vel com usu�rio
 *e armazenar em mem�ria o valor da convers�o antes da apresenta��o.*/
public class ExercicioK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double real, dolar, cotacao;

		System.out.println("Digite o valor em dolares: ");
		dolar = scanner.nextDouble();

		System.out.println("Digite o valor da cota��o: ");
		cotacao = scanner.nextDouble();

		real = dolar * cotacao;

		System.out.println("O valor em reais �: " + String.format("%.2f", real));

		scanner.close();
	}
}
