package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio O: Escrever um programa que leia 25 elementos(valores reais) para temperaturas em graus 
 *Celsius e armazenae esses valores em uma matriz A de uma dimensão do tipo vetor.
 *Construir uma matriz B de mesmos tipo e dimensão, em que cada elemento da matriz B deve ser a conversão  */
public class ExercicioO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[25];
		double B[] = new double[25];
		int i;

		for (i = 0; i < 25; i++) {
			System.out.println("Digite um numeor real para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();
		}

		for (i = 0; i < 25; i++) {
			B[i] = (9 * A[i] + 160) / 5;
		}

		for (i = 0; i < 25; i++) {
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}

		scanner.close();
	}
}
