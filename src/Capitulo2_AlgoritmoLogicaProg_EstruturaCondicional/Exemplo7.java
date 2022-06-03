package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Efetuar a entradad do sexo de uma pessoa (variável SEXO)
 *2. Verificar se o valor fornecido para a variável SEXO é válido, ou seja, se o valor da variável SEXO
 *é igual a F ou M. Se o valor for válido, apresentar a mensagem "Sexo válido"; caso contrário, apresentar a mensagem "Sexo inválido"*/
public class Exemplo7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char sexo;

		System.out.println("Digite o seu sexo: ");
		sexo = scanner.nextLine().charAt(0);

		if (sexo == 'M' || sexo == 'F') {
			System.out.println("Sexo válido! ");
		} else {
			System.out.println("Sexo inválido! ");
		}

		scanner.close();
	}
}
