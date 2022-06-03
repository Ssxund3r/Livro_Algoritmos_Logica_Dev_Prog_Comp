package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Efetuar a entradad do sexo de uma pessoa (vari�vel SEXO)
 *2. Verificar se o valor fornecido para a vari�vel SEXO � v�lido, ou seja, se o valor da vari�vel SEXO
 *� igual a F ou M. Se o valor for v�lido, apresentar a mensagem "Sexo v�lido"; caso contr�rio, apresentar a mensagem "Sexo inv�lido"*/
public class Exemplo7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char sexo;

		System.out.println("Digite o seu sexo: ");
		sexo = scanner.nextLine().charAt(0);

		if (sexo == 'M' || sexo == 'F') {
			System.out.println("Sexo v�lido! ");
		} else {
			System.out.println("Sexo inv�lido! ");
		}

		scanner.close();
	}
}
