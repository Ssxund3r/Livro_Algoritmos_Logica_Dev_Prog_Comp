package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*W. Elaborar um programa que leia uma medida em pés, calcular, armazenar e apresentar o seu valor
 *convertido em metros, lembrando que um pé mede 0,3048 metro ou seja, um pé é igual a 30,48*/
public class ExercicioW {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double pes, metros;
		
		System.out.println("Digite um valor para medida em pés: ");
		pes = scanner.nextDouble();
		
		metros = pes * 0.3048;
		
		System.out.println("O valor convertido em metros é: " + String.format("%.2f", metros));
		
		scanner.close();
	}
}
