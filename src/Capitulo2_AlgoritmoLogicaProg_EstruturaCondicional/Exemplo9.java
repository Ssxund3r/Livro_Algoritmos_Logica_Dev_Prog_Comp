package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Ler um valor num�rico inteiro qualquer (vari�vel N);
 *2. Calcular o resto da divis�o de N por 4, usar a vari�vel R4;
 *3. Calcular o resto da divis�o de N por 5, usar a vari�vel R5;
 *4. Verificar se as vari�veis R4 e R5 possuem o valor de resto igual a zero; se sim, apresentar o valor
 *da vari�vel N; se n�o, apresentar a mensagem "Valor n�o � divis�vel por 4 e 5".*/
public class Exemplo9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r4, r5;

		System.out.println("Digite um n�mero inteiro: ");
		n = scanner.nextInt();

		r4 = n - 4 * (n / 4);
		r5 = n - 5 * (n / 5);

		if ((r4 == 0) && (r5 == 0)) {
			System.out.println("O resultado �: " + n);
		} else {
			System.out.println("O valor n�o � divis�vel por 4 e 5! ");
		}

		scanner.close();
	}
}
