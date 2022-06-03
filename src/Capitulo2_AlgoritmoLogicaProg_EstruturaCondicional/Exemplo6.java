package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Efetuar a leitura de um valor inteiro (variavel NUMERO);
 *2. Verificar se o valor fornecido é maior ou igual a 20 e se o mesmo valor é menor ou igual a 90.
 *Se esta condição for verdadeira, apresentar a mensagem "O número está na faixa de 20 a 90"; caso
 *ao contrário, apresentar a mensagem "O número está de fora da faixa de 20 a 90".*/
public class Exemplo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um número entre 20 a 90: ");
		numero = scanner.nextInt();
		
		if (numero >= 20 && numero <= 90) {
			System.out.println("O número está na faixa de 20 a 90");
		} else {
			System.out.println("O numero está fora da faixa de 20 e 90");
		}

		scanner.close();
	}
}
