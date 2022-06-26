package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo#8: Elaborar um programa que calcule e apresente o resultado do cálculo fatorial de um número
 *qualquer. Além dessa possibilidade, o programa deve permitir ao usuário fazer novos cálculos até o momento que decidir encerrar programa.
 *
 *Entendimento:
 *
 *1. Definir uma variável para controle do laço de respota do usuário (variável RESP);
 *2. Inidicar uma variável para contorle do laço de cálculo da fatorial (variável I);
 *3. Definir uma variável para o limite máximo de cálculo para a fatorial (variável N);
 *4. Inicializar a variável RESP com valor "SIM";
 *5. Inicializar a variável FAT com valor 1;
 *6. Efetuar a entrada da variável N para definir o valor limite de cálculo;
 *7. Inicializar o laço da variável CONT em 1 e terminar em N de 1 em 1;
 *8. Calcular a expressão arimética FAT = FAT * CONT;
 *9. Incrementar o valor 1 á variável CONT até chegar ao limite da variável N;
 *10. Apresentar o resultado obtido na variável FAT;
 *11. Perguntar ao usuário se deseja continuar. Se a resposta for "SIM", repetir os passos de 5 até 11;
 *12. Encerrar o programa.*/
public class Exemplo8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int CONT, FAT, N;
		String resp;

		do {
			FAT = 1;
			System.out.println("Digite um valor inteiro: ");
			N = scanner.nextInt();

			for (CONT = 1; CONT < N; CONT++) {
				FAT = FAT * CONT;

				System.out.println();
				System.out.println(N + " ! = " + FAT);
			}

			System.out.println("Deseja Continuar a operação? ");
			resp = scanner.next();

		} while (resp == "sim");

		System.out.println("Encerrando o programa... ");

		scanner.close();
	}
}
