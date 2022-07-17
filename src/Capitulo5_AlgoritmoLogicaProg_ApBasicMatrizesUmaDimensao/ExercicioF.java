package Capitulo5_AlgoritmoLogicaProg_ApBasicMatrizesUmaDimensao;

import java.util.Scanner;

public class ExercicioF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A[] = new double[30];
		double B[] = new double[30];
		int i;
		String resp;
		double pesq;
		boolean acha;

		for (i = 0; i < 30; i++) {
			System.out.println("Digite um numero real para o vetor A: " + " Indice: " + i);
			A[i] = scanner.nextDouble();
		}

		for (i = 0; i < 30; i++) {
			B[i] = Math.pow(A[i], 3);
		}

		resp = "sim";
		while (resp == "sim") {
			System.out.println("Digite a posição a ser pesquisada: ");
			pesq = scanner.nextDouble();

			i = 1;
			acha = false;
			while ((i < 30) && (acha == false)) {
				if (pesq == B[i]) {
					acha = true;
				} else {
					i += 1;
				}

			}
			if (acha == true) {
				System.out.println(pesq + " foi localizado na posição! " + i);

			} else {
				System.out.println(pesq + " não foi localizado! ");
			}
			System.out.println("Deseja continuar a operação? [Sim | 'sim' - Nao | 'nao' -> " + resp);
			resp = scanner.nextLine();

		}

		scanner.close();
	}
}
