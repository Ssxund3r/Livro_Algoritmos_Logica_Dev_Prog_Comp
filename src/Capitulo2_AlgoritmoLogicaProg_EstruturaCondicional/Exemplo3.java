package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Definir a entrada de um valor numérico inteiro (variável N);
 *2. Verificar se N = 1 e, se for, apresentar a mensagem "você entrou com valor 1";
 *3. Verificar se N = 2 e, se for, apresentar a mensagem "você entrou com valor 2";
 *4. Verificar se N < 1 e, se for, apresentar a mensagem "você entrou com um valor muito baixo!";
 *5. Verificar se N > 2 e, se for, apresentar a mensagem "você entrou com um valor muito alto! ";*/
public class Exemplo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x;

		System.out.println("Digite um valor ente 1 ou 2: ");
		x = scanner.nextInt();

		if (x == 1) {
			System.out.println("Você entrou com valor 1! ");
		}
		if (x == 2) {
			System.out.println("Você entrou com valor 2! ");
		}
		if (x < 1) {
			System.out.println("Você entrou com um valor muito baixo! ");
		}
		if (x > 2) {
			System.out.println("Você entrou com um valor muito alto! ");
		}

		scanner.close();
	}
}
