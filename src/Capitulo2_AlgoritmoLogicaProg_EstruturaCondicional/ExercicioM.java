package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*M. Efetuar a leitura de um nome (variavel NOME) e o sexo (variavel SEXO) de uma pessoa e apresentar como sa�da
 *uma das seguintes mensagens: "Ilmo. Sr.", caso seja informado o sexo masculino (utilizar como valor o caractere "M"
 *ou "Ilma.Sra.", caso seja informado o sexo feminino (utilizar como valor o caractere "F"). Ap�s a mesagem de sauda��o
 *apresentar o nome informado. O programa deve, ap�s a entrada do sexo, varificar primeiramente se o sexo fornecido � realmente v�lido
 *ou seja, se � igual a "M" ou a "F". N� sendo essa condi��o verdadeira o programa deve apresentar a mensagem "Sexo informado inv�lido."*/
public class ExercicioM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char sexo;
		String nome;

		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();

		System.out.println("Digite seu sexo: [M - masculino | F - feminino] ");
		sexo = scanner.next().charAt(0);

		if ((sexo == 'M') || (sexo == 'm') || (sexo == 'F') || (sexo == 'f')) {
			if (sexo == 'M' || sexo == 'm') {
				System.out.println("Ilmo. Sr. " + nome);
			} else if (sexo == 'F' || sexo == 'f') {
				System.out.println("Ilmo. Sra. " + nome);
			}
		} else {
			System.out.println("Sexo inv�lido! ");
		}

		scanner.close();
	}
}
