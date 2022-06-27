package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exercício S: Elaborar um programa que apresente o resultado inteiro da divisão de dois números
 *quaisquer, representando o dividendo e o divisor da divisão a ser processada. Sugestão: para a elaboração
 *do programa, não utilize o operador aritmético da divisão com quociente inteiro div. Use uma solução baseada em laço.
 *O programa deve apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.*/
public class ExercicioS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quociente, dividendo, divisor;

		System.out.println("Digite o valor para o dividendo: ");
		dividendo = scanner.nextInt();

		System.out.println("Digite o valor para o divisor: ");
		divisor = scanner.nextInt();

		quociente = 0;

		while (divisor <= dividendo) {
			dividendo = dividendo - divisor;
			quociente = quociente + 1;
		}

		System.out.println("Quociente: " + quociente);

		scanner.close();
	}
}
