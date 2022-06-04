package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo 1:
 *Elaborar um programa que efetue a entrada de um valor numérico real não negativo diferente de cinco.
 *Em caso afirmativo, o programa deve calcular e exibir o resultado da raiz quadrada do valor fornecido;
 *caso contrário, o programa deve apresentar o resultado da raiz cúbica do valor fornecido. Se o valor fornecido
 *for negativo, o programa não deve executar nenhuma ação, apenas ser encerrado. 
 *Entendimento:
 *1. ler um valor numérico real qualquer (variável N)
 *2. Verificar se o valor fornecido é não negativo e proceder da seguinte forma:
 *2.1 Se positivo, verificar se é diferente de 5;
 *2.2 Se sim, calcular a raiz quadrada (variável R);
 *2.3 Se não, calcular a raiz quadrada a raiz cúbica (variável R);
 *2.4 Apresentar o resultado do cálculo da raiz (variável R);
 *3. Se não, for positivo, não fazer nada;
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
			System.out.println("O resultado é: " + String.format("%.2f", r));
		}
		System.out.println("Encerrando o programa... ");

		scanner.close();
	}
}
