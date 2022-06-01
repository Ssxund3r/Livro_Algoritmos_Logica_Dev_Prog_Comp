package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*P. Elaborar um programa que leia o valor num�rico correspondente ao sal�rio mensal
 *(vari�vel SM) de um trabalhador e tamb�m fazer a leitura do valor percentual de reajuste 
 *(vari�vel PR) a ser atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS) ap�s o armazenamento
 *do c�lculo em mem�ria. */
public class ExercicioP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double sm, pr, ns;

		System.out.println("Digite o sal�rio mensal: ");
		sm = scanner.nextDouble();

		System.out.println("Digite o valor do percentual no reajuste: ");
		pr = scanner.nextDouble();

		ns = sm + sm * (pr / 100);

		System.out.println("O novo sal�rio do funcion�rio �: " + String.format("%.2f", ns));

		scanner.close();
	}
}
