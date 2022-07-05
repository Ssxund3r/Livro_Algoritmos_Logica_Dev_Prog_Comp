package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercício Q: Elaborar um programa que leia 15 elementos reais para uma matriz A de uma dimensão do tipo vetor.
 *Construir uma matriz B de mesmo tipo e dimensão, observando a seguinte lei de formação: "todod elemento da matriz A
 *que possuir indice par deve ter seu elemento devivido por 2; caso contrário, o elemento da matriz A deve ser multiplicado 
 *por 1.5". Apresentar os elementos da matriz B.*/
public class ExercicioQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[15];
		double B[] = new double[15];
		int i, r;

		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor real para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();
		}

		for (i = 0; i < 15; i++) {
			r = i - 2 * (i / 2);

			if (r == 0) {
				B[i] = A[i] / 2;
			} else {
				B[i] = A[i] * 1.5;
			}
		}

		for (i = 0; i < 15; i++) {
			System.out.println("Total da operação: " + B[i]);
		}

		scanner.close();
	}
}
