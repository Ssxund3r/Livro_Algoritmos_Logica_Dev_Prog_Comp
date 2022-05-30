package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Ler uma temperatura em graus Fahrenheit e apresent�-la convertida em graus Celsius.
 *A f�rmula de convers�o � C <- ((F - 32) * 5) / 9, sendo F a temperatura Fahrenheit e 
 *C a temperatura em Celsius*/
public class ExercicioB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double F, C;

		System.out.println("Digite a temperatura em Fahrenheit: ");
		F = scanner.nextDouble();

		C = ((F - 32) * 5) / 9;

		System.out.println("A temperatura em Celsius �: " + String.format("%.2f", C));

		scanner.close();
	}

}
