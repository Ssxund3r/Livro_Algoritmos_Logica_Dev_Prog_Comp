package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo com la�o iterativo: Elaborar um programa que efetue a entrada de um valor num�rico inteiro qualquer;
 *Em seguida processar o c�lculo do valor de entrada, multiplicando-o por 3 e apresentando seu resultado.
 *Proceder � a��o dos passos anteiores cinco vezes. 
 *
 *ENTENDIMENTO: 
 *
 *1. Criar uma variavel de controle para servir como contador com valor inicial 1 (vari�vel I);
 *2. Enquanto o valor da vari�vel contador for menor ou igual a 5, executar os passos 3 a 5; caso
 *	 contr�rio, desviar a execu��o do programa para o passo 8.
 *3. Ler um valor inteiro qualquer (vari�vel N);
 *4. Efetuar a multiplica��o do valor de N por 3, colocando o resultado na vari�vel R;
 *5. Apresentar o valor calculado que est� armazenado na vari�vel R;
 *6. Acrescentar o valor 1 ao valor existente da vari�vel I, definida no passo 1;
 *7. Retornar a execu��o do programa ao passo 2;
 *8. Encerrar a execu��o do programa.
 **/
public class Exemplo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int I, N, R;

		I = 1;

		while (I <= 5) {
			System.out.println("-----------------------------------");
			System.out.println("Digite um valor para variavel N: ");
			System.out.println("-----------------------------------");
			N = scanner.nextInt();

			R = N * 3;

			System.out.println("-----------------------------------");
			System.out.println("O valor �: " + R);
			System.out.println("-----------------------------------");
			I++;
		}
		scanner.close();
	}
}
