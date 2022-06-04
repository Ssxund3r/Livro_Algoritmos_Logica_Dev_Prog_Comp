package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo 1:
 *Elaborar um programa que efetue a entrada de um valor num�rico real n�o negativo diferente de cinco.
 *Em caso afirmativo, o programa deve calcular e exibir o resultado da raiz quadrada do valor fornecido;
 *caso contr�rio, o programa deve apresentar o resultado da raiz c�bica do valor fornecido. Se o valor fornecido
 *for negativo, o programa n�o deve executar nenhuma a��o, apenas ser encerrado. 
 *Entendimento:
 *1. ler um valor num�rico real qualquer (vari�vel N)
 *2. Verificar se o valor fornecido � n�o negativo e proceder da seguinte forma:
 *2.1 Se positivo, verificar se � diferente de 5;
 *2.2 Se sim, calcular a raiz quadrada (vari�vel R);
 *2.3 Se n�o, calcular a raiz quadrada a raiz c�bica (vari�vel R);
 *2.4 Apresentar o resultado do c�lculo da raiz (vari�vel R);
 *3. Se n�o, for positivo, n�o fazer nada;
 *3.1 Encerrar o programa.*/
public class ExemploEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n, r;

		System.out.println("Digite um valor para N: ");
		n = scanner.nextDouble();

		if (!(n < 0)) {
			if (n != 5) {
				r = Math.pow(n, 2) + (1 / 2);
			} else {
				r = Math.pow(n, 2) + (1 / 3);
			}
			System.out.println("O resultado �: " + String.format("%.2f", r));
		}
		System.out.println("Encerrando o programa... ");

		scanner.close();
	}
}
