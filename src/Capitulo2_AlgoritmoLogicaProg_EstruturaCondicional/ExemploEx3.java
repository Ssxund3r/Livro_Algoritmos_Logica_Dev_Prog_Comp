package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo:
 *  
 *Elaborar um programa que leia três valores para os lados de um triângulo, considerando lados como A, B e C.
 *Verificar se os lados fornecidos formam um triângulo, e se esta condição for verdadeira, deve ser indicado
 *o tipo de triângulo formado: isósceles, escaleno ou equilátero. 
 *
 *Entendimento:
 *
 *1. Ler três valores para os lados de um triângulo (variáveis A, B e C)
 *2. Verificar se cada lado é menor que a soma dos outros dois lados. Se sim, saber se A = B e se B = C
 *sendo verdade, o triângulo é isósceles, caso contrário o triângulo é escaleno
 *3. Caso os lados fornecidos não caracterizem um triângulo, avisar a ocorrência.*/
public class ExemploEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, c;

		System.out.println("Digite um valor para letra A: ");
		a = scanner.nextDouble();

		System.out.println("Digite um valor para letra B: ");
		b = scanner.nextDouble();

		System.out.println("Digite um valor para letra C: ");
		c = scanner.nextDouble();

		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			if ((a == b) && (b == c)) {
				System.out.println("Triângulo Equilátero");
			} else if ((a == b) || (a == c) || (c == b)) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("As medidas não formam um triângulo! ");
		}

		scanner.close();
	}
}
