package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Elaborar um programa que apresente o valor da convers�o em d�lar (US$) de um valor lido em real R$.
 *O programa deve solicitar o valor do d�lar e tamb�m a quantidade de reais dispon�vel com o usu�rio e 
 *armazenar em mem�ria o valor da convers�o antes da apresenta��o.*/
public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double real, dolar, cotacao;

		System.out.println("Digite o valor em reais: ");
		real = scanner.nextDouble();

		System.out.println("Digite o valor da cota��o: ");
		cotacao = scanner.nextDouble();

		dolar = real / cotacao;

		System.out.println("A valor em d�lar �: " + String.format("%.2f", dolar));

		scanner.close();
	}
}
