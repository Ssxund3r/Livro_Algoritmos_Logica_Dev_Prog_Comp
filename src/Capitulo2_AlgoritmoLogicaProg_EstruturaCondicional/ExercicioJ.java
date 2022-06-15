package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Ler um valor númerico inteiro e apresentar se o valor fornecido é par ou ímpar.*/
public class ExercicioJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, resto;
		
		System.out.println("Digite um valor para variavel N: ");
		n = scanner.nextInt();
		
		resto = n - 2 * (n / 2);
		
		if(resto == 0) {
			System.out.println("O valor " + n + " é PAR! ");
		} else {
			System.out.println("O valor " + n + " é IMPAR ");
		}
		
		scanner.close();
	}
}
