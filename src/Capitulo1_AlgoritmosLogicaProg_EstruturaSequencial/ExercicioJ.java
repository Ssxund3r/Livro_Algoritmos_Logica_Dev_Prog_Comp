package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*J. Ler dois valores numéricos inteiros ()representados pelas variáveis A e ) e apresentar
 *o resultado armazenado em memória do quadrado da diferença do primeiro valor (variável A)
 *em relação ao segundo valor (variável B).*/
public class ExercicioJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double A, B, X;
		
		System.out.println("Digite o valor de A: ");
		A = scanner.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = scanner.nextDouble();
		
		X = Math.pow(A - B, 2);
		
		System.out.println("A diferença do quadrado do primeiro valor é: " + String.format("%.2f", X));
		
		scanner.close();
	}
}
