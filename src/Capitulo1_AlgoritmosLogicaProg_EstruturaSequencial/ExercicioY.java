package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Y. Construir um programa que leia um valor num�rico inteiro e apresente como resultado
 *armazenado em mem�ria os seus valores sucessor e antecessor.*/
public class ExercicioY {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sucessor, antecessor, valor;
		
		System.out.println("Digite o valor: ");
		valor = scanner.nextInt();
		
		sucessor = valor + 1;
		antecessor = valor - 1;
		
		System.out.println("O valor sucessor �: " + sucessor);
		System.out.println("-------------------------------------");
		System.out.println("O valor antecessor �: " + antecessor);
		
		scanner.close();
	}
}
