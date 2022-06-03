package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Ler um valor numérico inteiro qualquer (variável N);
 *2. Calcular o resto da divisão de N por 4, usar a variável R4;
 *3. Calcular o resto da divisão de N por 5, usar a variável R5;
 *4. Verificar se as variáveis R4 e R5 possuem o valor de resto igual a zero; se sim, apresentar o valor
 *da variável N; se não, apresentar a mensagem "Valor não é divisível por 4 e 5".*/
public class Exemplo9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r4, r5;

		System.out.println("Digite um número inteiro: ");
		n = scanner.nextInt();

		r4 = n - 4 * (n / 4);
		r5 = n - 5 * (n / 5);

		if ((r4 == 0) && (r5 == 0)) {
			System.out.println("O resultado é: " + n);
		} else {
			System.out.println("O valor não é divisível por 4 e 5! ");
		}

		scanner.close();
	}
}
