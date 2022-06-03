package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Ler o valor de salário atual (variável SA).;
 *
 *2. Verificar se o valor da variável SA é menor que 500. Se sim, reajustar o valor com mais 15%, atribuindo
 *o novo valor à variavel NS. Se não, verificar a próxima condição. Note que essa condição estabelece o reajuste 
 *de 15% aos salários entre os valroe de 0 até 499. O que estiver acima dessa faixa é verificado posteriormente;
 *
 *3. Verificar se o valor da variável SA é menor ou superior que 1000. Se sim, reajustar o valor com mais 10%, atribuindo
 *o novo valor à váriavel NS. Essa condição estabelecer o reajuste de 10% aos salários entre 500 (após a condição falsa do passo 3)
 *até 1000. O que estiver fora dessa faixa e automaticamente reajustado com mais 5% atribuindo à váriavel NS, pois se trata de valores acima 1000;
 *
 *4. Apresentar o valor do novo salário, implicando na variável NS.*/
public class Exemplo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salarioAtual, salarioNovo;

		System.out.println("Digite o salário atual: ");
		salarioAtual = scanner.nextDouble();

		salarioNovo = salarioAtual;

		if (salarioNovo < 500) {
			salarioNovo = salarioAtual * 1.15;
			
		} else if (salarioNovo <= 1000) {
			salarioNovo = salarioAtual * 1.10;
			
		} else {
			salarioNovo = salarioAtual * 1.05;
		}

		System.out.println("O valor do novo salário é: " + String.format("%.2f", salarioNovo));

		scanner.close();
	}
}
