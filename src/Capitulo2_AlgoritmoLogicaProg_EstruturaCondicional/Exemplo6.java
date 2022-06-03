package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Efetuar a leitura de um valor inteiro (variavel NUMERO);
 *2. Verificar se o valor fornecido � maior ou igual a 20 e se o mesmo valor � menor ou igual a 90.
 *Se esta condi��o for verdadeira, apresentar a mensagem "O n�mero est� na faixa de 20 a 90"; caso
 *ao contr�rio, apresentar a mensagem "O n�mero est� de fora da faixa de 20 a 90".*/
public class Exemplo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um n�mero entre 20 a 90: ");
		numero = scanner.nextInt();
		
		if (numero >= 20 && numero <= 90) {
			System.out.println("O n�mero est� na faixa de 20 a 90");
		} else {
			System.out.println("O numero est� fora da faixa de 20 e 90");
		}

		scanner.close();
	}
}
