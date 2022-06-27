package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

import java.util.Scanner;

/*Exerc�cio S: Elaborar um programa que apresente o resultado inteiro da divis�o de dois n�meros
 *quaisquer, representando o dividendo e o divisor da divis�o a ser processada. Sugest�o: para a elabora��o
 *do programa, n�o utilize o operador aritm�tico da divis�o com quociente inteiro div. Use uma solu��o baseada em la�o.
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
