package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a 
 *fórmula VOLUME <- 3.14159 * R ^ 2 * ALTURA.*/
public class ExercicioC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double volume, R, altura;
		
		System.out.println("Digite um valor para Raio: ");
		R = scanner.nextDouble();
		
		System.out.println("Digite um valor para altura: ");
		altura = scanner.nextDouble();
		
		volume = 3.14159 * (R * R) * altura;
		
		System.out.println("O volume da lata é: " + String.format("%.2f", volume));
		
		scanner.close();
	}
}
