package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo #2: Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. 
 *Em seguida, calcular o valor entrado, multiplicando-o por 3 e apresentando seu resultado. Ao final 
 *da apresentação do resultado, o programa deve perguntar ao usuário se ele deseja novo cálculo. Se a 
 *resposta for sim, deve executar novamente as instruções subordinadas ao bloco adjacente. Se a resposta for
 *não, o programa deve parar a execução.*/
public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int R, N;
		char resp = 'S';

		while (resp == 'S' || resp == 's') {
			System.out.println("Digite um número inteiro: ");
			N = scanner.nextInt();

			R = N * 3;

			System.out.println("Deseja continuar? ");
			resp = scanner.next().charAt(0);

			System.out.println("--------------------");
			System.out.println("O total é: " + R);
			System.out.println("--------------------");

		}

		scanner.close();
	}
}
