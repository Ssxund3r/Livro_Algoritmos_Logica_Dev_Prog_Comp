package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*D. Ler os valores de quatro notas escolares bimestrais de um aluno representadas pelas vari�veis N1, N2, N3, e N4
 *Calcular a m�dia aritm�tica (vari�vel MD1) desse aluno e apresentar a mensagem "Aprovado" se a m�dia obtida for maior 
 *ou igual a 7; caso contr�rio, o programa deve solicitar a quinta nota (nota de exame, representada pela vari�vel NE) do
 *aluno e calcular uma novam�dia aritm�tica (vari�vel MD2) entre a nota de exame e a primeira m�dia aritm�tica (vari�vel MD2) 
 *entre a nota de cinco, apresentar a mensagem ""Aprovado em exame"; caso contr�rio, apresentar a mensagem "Reprovado". Informar 
 *tamb�m, ap�s a apresenta��o das mensagens, o valor da m�dia obtida pelo aluno.*/
public class ExercicioD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n1, n2, n3, n4, media, novaMedia, exame;

		System.out.println("Digite o valor da nota 1: ");
		n1 = scanner.nextDouble();

		System.out.println("Digite o valor da nota 2: ");
		n2 = scanner.nextDouble();

		System.out.println("Digite o valor da nota 3: ");
		n3 = scanner.nextDouble();

		System.out.println("Digite o valor da nota 4: ");
		n4 = scanner.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 7) {
			System.out.println("Aluno aprovado: " + media);

		} else {
			System.out.println("Digite a nota exame: ");
			exame = scanner.nextDouble();
			novaMedia = (media + exame) / 2;

			if (novaMedia >= 5) {
				System.out.println("Aluno aprovado em exame" + novaMedia);

			} else {
				System.out.println("Aluno reprovado! " + novaMedia);
			}

		}
		scanner.close();
	}
}
