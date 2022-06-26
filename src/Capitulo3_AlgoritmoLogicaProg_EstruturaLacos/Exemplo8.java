package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exemplo#8: Elaborar um programa que calcule e apresente o resultado do c�lculo fatorial de um n�mero
 *qualquer. Al�m dessa possibilidade, o programa deve permitir ao usu�rio fazer novos c�lculos at� o momento que decidir encerrar programa.
 *
 *Entendimento:
 *
 *1. Definir uma vari�vel para controle do la�o de respota do usu�rio (vari�vel RESP);
 *2. Inidicar uma vari�vel para contorle do la�o de c�lculo da fatorial (vari�vel I);
 *3. Definir uma vari�vel para o limite m�ximo de c�lculo para a fatorial (vari�vel N);
 *4. Inicializar a vari�vel RESP com valor "SIM";
 *5. Inicializar a vari�vel FAT com valor 1;
 *6. Efetuar a entrada da vari�vel N para definir o valor limite de c�lculo;
 *7. Inicializar o la�o da vari�vel CONT em 1 e terminar em N de 1 em 1;
 *8. Calcular a express�o arim�tica FAT = FAT * CONT;
 *9. Incrementar o valor 1 � vari�vel CONT at� chegar ao limite da vari�vel N;
 *10. Apresentar o resultado obtido na vari�vel FAT;
 *11. Perguntar ao usu�rio se deseja continuar. Se a resposta for "SIM", repetir os passos de 5 at� 11;
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

			System.out.println("Deseja Continuar a opera��o? ");
			resp = scanner.next();

		} while (resp == "sim");

		System.out.println("Encerrando o programa... ");

		scanner.close();
	}
}
