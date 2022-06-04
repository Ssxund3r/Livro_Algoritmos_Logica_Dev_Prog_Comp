package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo: 
 *Elaborar um programa que leia um valor inteiro qualquer e apresene esse valor somente se 
 *for divisivel por 2 ou somente se for divisivel por 3. Caso contr�rio, n�o fa�a nada. Em nenhuma hip�tese
 *esse valor pode ser apresentado caso seja divisivel por 2 ou 3.
 *
 *Entendimento: 
 *1. Efetuar a leitura do valor inteiro qualquer (Variavel N)
 *2. Calcular a divisibilidade da vari�vel N por 2 (armazenar resultado na vari�vel R2)
 *3. Calcular a divisibilidade da variavel N por 3 (armazenar resultado na vari�vel R3)
 *4. Varificar sea a vri�vel R2 � igual a zero ou exclusivamente se a vari�vel R3 � igual a zero:
 *4.1 Se sim, apresentar o conte�do na vari�vel N.
 *4.2 Se n�o, abandonar o programa*/
public class ExemploEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r2, r3;

		System.out.println("Digite um valor inteiro para N: ");
		n = scanner.nextInt();

		r2 = n - 2 * (n / 2);

		r3 = n - 3 * (n / 3);

		if (r2 == 0 ^ r3 == 0) {
			System.out.println("O valor da opera��o �: " + n);
		} else {
			System.out.println("Valor inv�lido! encerrando... ");
		}

		scanner.close();
	}
}
