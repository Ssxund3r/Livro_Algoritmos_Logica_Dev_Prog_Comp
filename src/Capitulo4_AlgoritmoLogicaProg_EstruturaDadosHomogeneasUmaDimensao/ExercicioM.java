package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio M: Construir um programa que calcule a tabuada de um valor qualquer de 1 até 10 e 
 *armazene os resultados em uma matriz A de uma dimensão. Apresentar os elementos da matriz A.*/
public class ExercicioM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A[] = new int[10];
		int i, n;
	
		
		System.out.println("Digite um numero inteiro: ");
		n = scanner.nextInt();
		for (i = 1; i < 10; i++) {
			
			A[i] = n * i;
		}

		for (i = 1; i < 10; i++) {
			System.out.println("Total da operação: " + A[i]);
		}

		scanner.close();
	}
}
