package Capitulo1_AlgoritmosLogicaProg;

import java.util.Scanner;

/*Desenvolver um programa que fa�a a entrada do nome de uma pessoa e de seu sexo. 
 *Em seguida, apresentar os dados anteriormente informados.
 *Entendimento:
 *1. Efetuar a entrada do nome na vari�vel nome;
 *2. Efetuar a entrada do sexo na vari�vel sexo;
 *3. Apresentar o nome e o sexo informados.*/
public class Exemplo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		char sexo;

		System.out.println("Digite seu nome: ");
		nome = scanner.next();

		System.out.println("Digite seu sexo: [M, F]");
		sexo = scanner.next().charAt(0);

		System.out.println("-------------------------");
		System.out.println("Seu nome �: " + nome);
		System.out.println("Seu sexo �: " + sexo);
		System.out.println("-------------------------");

		scanner.close();
	}
}
