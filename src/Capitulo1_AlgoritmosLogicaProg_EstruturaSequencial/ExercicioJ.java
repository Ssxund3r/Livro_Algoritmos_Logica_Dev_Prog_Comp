package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*J. Ler dois valores num�ricos inteiros ()representados pelas vari�veis A e ) e apresentar
 *o resultado armazenado em mem�ria do quadrado da diferen�a do primeiro valor (vari�vel A)
 *em rela��o ao segundo valor (vari�vel B).*/
public class ExercicioJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double A, B, X;
		
		System.out.println("Digite o valor de A: ");
		A = scanner.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = scanner.nextDouble();
		
		X = Math.pow(A - B, 2);
		
		System.out.println("A diferen�a do quadrado do primeiro valor �: " + String.format("%.2f", X));
		
		scanner.close();
	}
}
