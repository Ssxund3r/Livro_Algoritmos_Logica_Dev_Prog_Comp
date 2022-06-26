package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exemplo#4: Elaborar um programa que entre um valor numerico qualquer. Em seguida, calcular o valor de entrada,
 *multiplicando-o por 3 e apresentado seu resultado. Ao final da apresenta��o do resultado, o programa deve perguntar ao 
 *usu�rio se ele deseja novo c�lculo. Se a resposta for sim, deve executar novamente as instru��es subordinadas ao bloco
 *adjacente. Se a resposta for n�o, o programa deve parar a execu��o.*/
import java.util.Scanner;

public class Exemplo4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N, R, resp;

		for (resp = 0; resp != 1; resp++) {
			
			System.out.println("Digite um valor inteiro: ");
			N = scanner.nextInt();

			R = N * 3;

			System.out.println("--------------------------------------------------");
			System.out.println("O total �: " + R);
			System.out.println("--------------------------------------------------");
			System.out.println();
			System.out.println("Deseja continuar o programa? [1 - Sim | 0 - N�o]");
			resp = scanner.nextInt();

		}

		scanner.close();
	}
}
