package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Ler um valor n�merico inteiro e apresentar se o valor fornecido � par ou �mpar.*/
public class ExercicioJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, resto;
		
		System.out.println("Digite um valor para variavel N: ");
		n = scanner.nextInt();
		
		resto = n - 2 * (n / 2);
		
		if(resto == 0) {
			System.out.println("O valor " + n + " � PAR! ");
		} else {
			System.out.println("O valor " + n + " � IMPAR ");
		}
		
		scanner.close();
	}
}
