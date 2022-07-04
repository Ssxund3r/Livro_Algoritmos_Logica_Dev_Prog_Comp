package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Locale;
import java.util.Scanner;

/*Exercício C: Escrever um programa que leia duas matrizes (denominadas A e B) do tipo vetor com 20 elementos reais.
 *Constuir uma matriz C, sendo cada elemento da matriz C a subtração de um elemento correspondente da matriz A com um 
 *elemento correspondente da matriz B, ou seja, a operação de processamento deve estar baseada na operação C[i] <- A[i] - B[i].
 *Ao final, apresentar os elementos da matriz C.*/
public class ExercicioC {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[20];
		double B[] = new double[20];
		double C[] = new double[20];

		int i;

		for (i = 0; i < 20; i++) {
			System.out.println("Digite um valor real para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();

		}

		for (i = 0; i < 20; i++) {
			System.out.println("---");
			System.out.println("Digite um valor real para o vetor B: " + " Indice: " + i);
			B[i] = scanner.nextDouble();
		}

		for (i = 0; i < 20; i++) {
			C[i] = A[i] - B[i];
		}
		
		for(i = 0; i < 20; i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("Total da operação na locação do vetor C: " + String.format("%.2f", C[i]) + " Indice: " + i);
			System.out.println("--------------------------------------------------");
		}
		
		scanner.close();
	}
}
