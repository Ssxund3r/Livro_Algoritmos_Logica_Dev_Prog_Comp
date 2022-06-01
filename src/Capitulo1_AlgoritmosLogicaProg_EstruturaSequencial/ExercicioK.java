package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*K. Elaborar um programa que apresente o valor da conversão em dólar (US$) de um valor lido em real (R$). 
 *O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com usuário
 *e armazenar em memória o valor da conversão antes da apresentação.*/
public class ExercicioK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double real, dolar, cotacao;

		System.out.println("Digite o valor em dolares: ");
		dolar = scanner.nextDouble();

		System.out.println("Digite o valor da cotação: ");
		cotacao = scanner.nextDouble();

		real = dolar * cotacao;

		System.out.println("O valor em reais é: " + String.format("%.2f", real));

		scanner.close();
	}
}
