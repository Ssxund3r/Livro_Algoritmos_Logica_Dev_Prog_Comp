package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*C. Realizar a leitura dos valores de quatro notas escolares bimetrais de um aluno represenadas pelas
 *vari�veis N1, N2, N3 e N4. Calcular a m�dia aritm�tica (vari�vel MD) desse aluno e apresentar a mensagem "Aprovado"
 *se a m�dia obtida for maior ou igual a 5; caso contr�rio, apresentar a mensagem "Reprovado". Informar tamb�m, ap�s a 
 *apresenta��o das mensagens o valor da m�dia obtida pelo aluno.*/
public class ExercicioC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n1, n2, n3, n4, media;

		System.out.println("Digite o valor da nota 1: ");
		n1 = scanner.nextDouble();

		System.out.println("Digite o valor da nota 2: ");
		n2 = scanner.nextDouble();

		System.out.println("Digite o valor da nota 3: ");
		n3 = scanner.nextDouble();

		System.out.println("Digite o valor da nota 4: ");
		n4 = scanner.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 5) {
			System.out.println("Aluno aprovado " + media);
		} else {
			System.out.println("Aluno reprovado " + media);
		}

		scanner.close();
	}
}
