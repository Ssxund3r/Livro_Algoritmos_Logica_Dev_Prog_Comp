package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;
/*Entendimento:
 * 1. Ler dois valores desconhecidos, representados pelas vari�veis A e B
 * 2. Efetuar adi��o das vari�veis A e B, cujo resultado ser� atribuido � vari�vel X.
 * 3. Apresentar o valor da vari�vel X, que � o resultado da soma realizada.*/
public class Exemplo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int A, B, X;
		
		System.out.println("Digite o valor para A");
		A = scanner.nextInt();
		
		System.out.println("Digite o valor para B");
		B = scanner.nextInt();
		
		X = A + B; 
		
		System.out.println("O valor total �: " + X);
		
		scanner.close();
	}
}
