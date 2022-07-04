package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

import java.util.Scanner;

/*Exercicio A: Elaborar um programa que efetue a leitura de dez nomes de pessoas em uma matriz A
 *do tipo vetor e apresentá-los em seguida.*/
public class ExercicioA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i;
		String A[] = new String[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Digite seu primeiro nome: " + " Indice: " + i);
			A[i] = scanner.nextLine();
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Seu nome é : " + A[i] + " --- " + " Indice: " + i);
		}

		scanner.close();
	}
}
