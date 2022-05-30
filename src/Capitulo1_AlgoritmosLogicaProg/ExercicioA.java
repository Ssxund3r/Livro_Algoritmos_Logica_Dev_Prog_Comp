package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit.
 *A f�rmula da convers�o � F <- C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e 
 *C a temperatura em Celsius*/
public class ExercicioA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double F, C;

		System.out.println("Digite a temperatura em Celsius: ");
		C = scanner.nextDouble();

		F = (C * 9 / 5) + 32;

		System.out.println("A temperatura em Fahrenheit �:" + String.format("%.2f", F));

		scanner.close();
	}
}
