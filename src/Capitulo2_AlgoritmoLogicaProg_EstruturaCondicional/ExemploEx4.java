package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo: 
 *Elaborar um programa que leia um valor inteiro qualquer e apresene esse valor somente se 
 *for divisivel por 2 ou somente se for divisivel por 3. Caso contrário, não faça nada. Em nenhuma hipótese
 *esse valor pode ser apresentado caso seja divisivel por 2 ou 3.
 *
 *Entendimento: 
 *1. Efetuar a leitura do valor inteiro qualquer (Variavel N)
 *2. Calcular a divisibilidade da variável N por 2 (armazenar resultado na variável R2)
 *3. Calcular a divisibilidade da variavel N por 3 (armazenar resultado na variável R3)
 *4. Varificar sea a vriável R2 é igual a zero ou exclusivamente se a variável R3 é igual a zero:
 *4.1 Se sim, apresentar o conteúdo na variável N.
 *4.2 Se não, abandonar o programa*/
public class ExemploEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, r2, r3;

		System.out.println("Digite um valor inteiro para N: ");
		n = scanner.nextInt();

		r2 = n - 2 * (n / 2);

		r3 = n - 3 * (n / 3);

		if (r2 == 0 ^ r3 == 0) {
			System.out.println("O valor da operação é: " + n);
		} else {
			System.out.println("Valor inválido! encerrando... ");
		}

		scanner.close();
	}
}
