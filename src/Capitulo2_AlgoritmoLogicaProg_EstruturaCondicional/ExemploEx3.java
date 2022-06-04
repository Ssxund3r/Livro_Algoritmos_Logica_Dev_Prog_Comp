package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Exemplo:
 *  
 *Elaborar um programa que leia tr�s valores para os lados de um tri�ngulo, considerando lados como A, B e C.
 *Verificar se os lados fornecidos formam um tri�ngulo, e se esta condi��o for verdadeira, deve ser indicado
 *o tipo de tri�ngulo formado: is�sceles, escaleno ou equil�tero. 
 *
 *Entendimento:
 *
 *1. Ler tr�s valores para os lados de um tri�ngulo (vari�veis A, B e C)
 *2. Verificar se cada lado � menor que a soma dos outros dois lados. Se sim, saber se A = B e se B = C
 *sendo verdade, o tri�ngulo � is�sceles, caso contr�rio o tri�ngulo � escaleno
 *3. Caso os lados fornecidos n�o caracterizem um tri�ngulo, avisar a ocorr�ncia.*/
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
				System.out.println("Tri�ngulo Equil�tero");
			} else if ((a == b) || (a == c) || (c == b)) {
				System.out.println("Tri�ngulo Is�sceles");
			} else {
				System.out.println("Tri�ngulo Escaleno");
			}
		} else {
			System.out.println("As medidas n�o formam um tri�ngulo! ");
		}

		scanner.close();
	}
}
