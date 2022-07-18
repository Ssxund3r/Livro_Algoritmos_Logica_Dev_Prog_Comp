package Capitulo6_AlgoritmoLogicaProg_EstruturaDadosHomoDuasDimensoes;

import java.util.Locale;
/*Exemplo 2: Desenvolver um programa que leia os nomes de oito alunos e também suas quatro notas
 * bimestrais. Ao final, deve apresentar o nome de cada aluno classificado em ordem alfabética, bem como suas
 * médias e a média geral dos oito alunos.*/
import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String x;
		int i, j;
		double y, somaNT, somaMD, mediaGP;
		double notaAluno[][] = new double[8][4];
		double media[] = new double[8];
		String nomeAluno[] = new String[8];

		somaMD = 0;

		for (i = 0; i < 8; i++) {
			somaNT = 0;
			System.out.println("Aluno: " + " Indice: " + i);
			nomeAluno[i] = scanner.nextLine();
			System.out.println();

			for (j = 0; j < 4; j++) {
				System.out.println("Digite a nota do Aluno: " + " Indice: " + i);
				notaAluno[i][j] = scanner.nextDouble();
				somaNT += notaAluno[i][j];
			}
			media[i] = somaNT / 4;
			somaMD += media[i];
		}

		for (i = 0; i < 7; i++) {
			for (j = i + 1; j < 8; j++) {
				if (nomeAluno[i] != nomeAluno[j]) {
					x = nomeAluno[i];
					nomeAluno[i] = nomeAluno[j];
					nomeAluno[j] = x;

					y = (char) media[i];
					media[i] = media[j];
					media[j] = y;

				}
			}
		}

		for (i = 8; i < 8; i++) {
			System.out.println("Aluno: " + nomeAluno[i]);
			System.out.println("Media: " + media[i]);
		}

		mediaGP = somaMD / 8;
		System.out.println("Media geral: " + mediaGP);

		scanner.close();
	}
}
