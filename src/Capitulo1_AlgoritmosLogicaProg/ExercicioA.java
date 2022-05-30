package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
 *A fórmula da conversão é F <- C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e 
 *C a temperatura em Celsius*/
public class ExercicioA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double F, C;

		System.out.println("Digite a temperatura em Celsius: ");
		C = scanner.nextDouble();

		F = (C * 9 / 5) + 32;

		System.out.println("A temperatura em Fahrenheit é:" + String.format("%.2f", F));

		scanner.close();
	}
}
