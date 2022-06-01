package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Elaborar um programa que apresente o valor da conversão em dólar (US$) de um valor lido em real R$.
 *O programa deve solicitar o valor do dólar e também a quantidade de reais disponível com o usuário e 
 *armazenar em memória o valor da conversão antes da apresentação.*/
public class ExercicioL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double real, dolar, cotacao;

		System.out.println("Digite o valor em reais: ");
		real = scanner.nextDouble();

		System.out.println("Digite o valor da cotação: ");
		cotacao = scanner.nextDouble();

		dolar = real / cotacao;

		System.out.println("A valor em dólar é: " + String.format("%.2f", dolar));

		scanner.close();
	}
}
