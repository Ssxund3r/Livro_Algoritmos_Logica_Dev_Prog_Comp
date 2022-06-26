package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exemplo#4: Elaborar um programa que entre um valor numerico qualquer. Em seguida, calcular o valor de entrada,
 *multiplicando-o por 3 e apresentado seu resultado. Ao final da apresentação do resultado, o programa deve perguntar ao 
 *usuário se ele deseja novo cálculo. Se a resposta for sim, deve executar novamente as instruções subordinadas ao bloco
 *adjacente. Se a resposta for não, o programa deve parar a execução.*/
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
			System.out.println("O total é: " + R);
			System.out.println("--------------------------------------------------");
			System.out.println();
			System.out.println("Deseja continuar o programa? [1 - Sim | 0 - Não]");
			resp = scanner.nextInt();

		}

		scanner.close();
	}
}
