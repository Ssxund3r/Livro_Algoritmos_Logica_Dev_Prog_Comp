package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*M. Efetuar a leitura de um nome (variavel NOME) e o sexo (variavel SEXO) de uma pessoa e apresentar como saída
 *uma das seguintes mensagens: "Ilmo. Sr.", caso seja informado o sexo masculino (utilizar como valor o caractere "M"
 *ou "Ilma.Sra.", caso seja informado o sexo feminino (utilizar como valor o caractere "F"). Após a mesagem de saudação
 *apresentar o nome informado. O programa deve, após a entrada do sexo, varificar primeiramente se o sexo fornecido é realmente válido
 *ou seja, se é igual a "M" ou a "F". Nã sendo essa condição verdadeira o programa deve apresentar a mensagem "Sexo informado inválido."*/
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
			System.out.println("Sexo inválido! ");
		}

		scanner.close();
	}
}
