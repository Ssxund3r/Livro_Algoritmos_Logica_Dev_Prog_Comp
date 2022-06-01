package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*P. Elaborar um programa que leia o valor numérico correspondente ao salário mensal
 *(variável SM) de um trabalhador e também fazer a leitura do valor percentual de reajuste 
 *(variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS) após o armazenamento
 *do cálculo em memória. */
public class ExercicioP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double sm, pr, ns;

		System.out.println("Digite o salário mensal: ");
		sm = scanner.nextDouble();

		System.out.println("Digite o valor do percentual no reajuste: ");
		pr = scanner.nextDouble();

		ns = sm + sm * (pr / 100);

		System.out.println("O novo salário do funcionário é: " + String.format("%.2f", ns));

		scanner.close();
	}
}
