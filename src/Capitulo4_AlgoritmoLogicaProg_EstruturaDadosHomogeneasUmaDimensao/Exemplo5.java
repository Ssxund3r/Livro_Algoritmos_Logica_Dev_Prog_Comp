package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

/*Exemplo#5: Desenvolver um programa em que o usuário determine a quantidade de valores numericos inteiros 
 *a serem fornecidos para uma matrzi A do tipo vetor. No final, apresentar o total da soma de todos os elementos
 *da matriz A que sejam pares.*/
import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r, i, soma;
		int A[] = new int[100];

		soma = 0;

		System.out.println("Digite a quantidade de numeros inteiros: ");
		n = scanner.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Digite um valor inteiro para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextInt();
		}
		for (i = 0; i < n; i++) {
			r = A[i] - 2 * (A[i] / 2);

			if (r == 0) {
				soma += A[i];
			}
		}
		System.out.println("Total da soma é: " + soma);

		scanner.close();
	}
}
