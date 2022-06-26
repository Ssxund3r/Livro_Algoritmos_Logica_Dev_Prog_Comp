package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exemplo#6: Elaborar um programa que efetue a entrada de um valor numerico inteiro qualquer.
 *Em seguida, calcular o valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Ao final, 
 *o programa deve perguntar ao usu�rio se ele deseja novo c�lculo. Se a resposta for sim, deve executar 
 *novamente as instru��es subordinadas ao bloco adjacente. Se a resposta for n�o, o programa deve parar a execu��o.*/
import java.util.Scanner;

public class Exemplo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N, R;
		char resp;

		do {

			System.out.println("Digite um valor inteiro: ");
			N = scanner.nextInt();

			R = N * 3;

			System.out.println("O total da opera��o �: " + R);
			System.out.println();

			System.out.println("Deseja continuar o programa? ");
			resp = scanner.next().charAt(0);

		} while (resp == 'S' || resp == 's');

		System.out.println("Encerrando o programa...");

		scanner.close();
	}
}
