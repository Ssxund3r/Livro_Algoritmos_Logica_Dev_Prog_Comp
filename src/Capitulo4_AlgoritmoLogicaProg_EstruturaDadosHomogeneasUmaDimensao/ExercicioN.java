package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio N: Elaborar um programa que leia 20 elementos(valores reais) para temperaturas em graus Celsius
 * e armazene esses valores em uma matriz A de uma dimensão. O programa ao final deve apresentar a menor, a maior 
 * e a média das temperaturas lidas. */
public class ExercicioN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[20];
		double soma, media, valorMaior, valorMenor;
		int i;
		soma = 0;

		for (i = 0; i < 20; i++) {
			System.out.println("Digite um valor real para vator A: " + " indice: " + i);
			A[i] = scanner.nextDouble();
			soma += A[i];
		}
		valorMenor = A[1];
		valorMaior = A[1];

		for (i = 2; i < 20; i++) {
			if (valorMaior < A[i]) {
				valorMaior = A[i];
			}
			if (valorMenor > A[i]) {
				valorMenor = A[i];
			}
		}
		media = soma / 20;
		System.out.println("Valor Maior: " + valorMaior);
		System.out.println("Valor Menor: " + valorMenor);
		System.out.println("Valor Média: " + media);

		scanner.close();
	}
}
