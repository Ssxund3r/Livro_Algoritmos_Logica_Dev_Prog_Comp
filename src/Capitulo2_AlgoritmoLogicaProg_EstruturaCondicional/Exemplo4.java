package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Ler o valor de sal�rio atual (vari�vel SA).;
 *
 *2. Verificar se o valor da vari�vel SA � menor que 500. Se sim, reajustar o valor com mais 15%, atribuindo
 *o novo valor � variavel NS. Se n�o, verificar a pr�xima condi��o. Note que essa condi��o estabelece o reajuste 
 *de 15% aos sal�rios entre os valroe de 0 at� 499. O que estiver acima dessa faixa � verificado posteriormente;
 *
 *3. Verificar se o valor da vari�vel SA � menor ou superior que 1000. Se sim, reajustar o valor com mais 10%, atribuindo
 *o novo valor � v�riavel NS. Essa condi��o estabelecer o reajuste de 10% aos sal�rios entre 500 (ap�s a condi��o falsa do passo 3)
 *at� 1000. O que estiver fora dessa faixa e automaticamente reajustado com mais 5% atribuindo � v�riavel NS, pois se trata de valores acima 1000;
 *
 *4. Apresentar o valor do novo sal�rio, implicando na vari�vel NS.*/
public class Exemplo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salarioAtual, salarioNovo;

		System.out.println("Digite o sal�rio atual: ");
		salarioAtual = scanner.nextDouble();

		salarioNovo = salarioAtual;

		if (salarioNovo < 500) {
			salarioNovo = salarioAtual * 1.15;
			
		} else if (salarioNovo <= 1000) {
			salarioNovo = salarioAtual * 1.10;
			
		} else {
			salarioNovo = salarioAtual * 1.05;
		}

		System.out.println("O valor do novo sal�rio �: " + String.format("%.2f", salarioNovo));

		scanner.close();
	}
}
