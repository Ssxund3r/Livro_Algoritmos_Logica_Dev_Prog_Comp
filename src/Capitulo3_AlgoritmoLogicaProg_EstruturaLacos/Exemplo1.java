package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo com laço iterativo: Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer;
 *Em seguida processar o cálculo do valor de entrada, multiplicando-o por 3 e apresentando seu resultado.
 *Proceder à ação dos passos anteiores cinco vezes. 
 *
 *ENTENDIMENTO: 
 *
 *1. Criar uma variavel de controle para servir como contador com valor inicial 1 (variável I);
 *2. Enquanto o valor da variável contador for menor ou igual a 5, executar os passos 3 a 5; caso
 *	 contrário, desviar a execução do programa para o passo 8.
 *3. Ler um valor inteiro qualquer (variável N);
 *4. Efetuar a multiplicação do valor de N por 3, colocando o resultado na variável R;
 *5. Apresentar o valor calculado que está armazenado na variável R;
 *6. Acrescentar o valor 1 ao valor existente da variável I, definida no passo 1;
 *7. Retornar a execução do programa ao passo 2;
 *8. Encerrar a execução do programa.
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
			System.out.println("O valor é: " + R);
			System.out.println("-----------------------------------");
			I++;
		}
		scanner.close();
	}
}
