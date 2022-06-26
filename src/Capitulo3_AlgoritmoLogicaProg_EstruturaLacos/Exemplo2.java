package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo #2: Elaborar um programa que efetue a entrada de um valor num�rico inteiro qualquer. 
 *Em seguida, calcular o valor entrado, multiplicando-o por 3 e apresentando seu resultado. Ao final 
 *da apresenta��o do resultado, o programa deve perguntar ao usu�rio se ele deseja novo c�lculo. Se a 
 *resposta for sim, deve executar novamente as instru��es subordinadas ao bloco adjacente. Se a resposta for
 *n�o, o programa deve parar a execu��o.*/
public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int R, N;
		char resp = 'S';

		while (resp == 'S' || resp == 's') {
			System.out.println("Digite um n�mero inteiro: ");
			N = scanner.nextInt();

			R = N * 3;

			System.out.println("Deseja continuar? ");
			resp = scanner.next().charAt(0);

			System.out.println("--------------------");
			System.out.println("O total �: " + R);
			System.out.println("--------------------");

		}

		scanner.close();
	}
}
