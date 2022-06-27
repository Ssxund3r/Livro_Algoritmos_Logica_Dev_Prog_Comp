package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exemplo#7: Elaborar um programa que efetue o cálculo da fatorial do valor inteiro 5 e apresentar
 *o resultado desta operação.
 *Entendimento:
 *1. Inicializar as variáveis FAT e CONT, ambas com o valor inicial 1;
 *2. Multiplicar o valor da variável FAT sucessivamente pelo valor da variável CONT, atribuindo o incrementar mais 1 á variável FAT;
 *3. Incrementar mais 1 á variável CONT;
 *4. Repetir os passos 2 e 3 até o limite de 5 para variável CONT;
 *5. Apresentar ao final o valor obtido na variável FAT;
 *6. Encerrar o programa.*/

public class Exemplo7 {
	public static void main(String[] args) {		
		int FAT, CONT;

		FAT = 1;
		CONT = 1;

		while (CONT <= 5) {
			FAT = FAT * CONT;
			CONT++;

		}

		System.out.println("5! = " + FAT);

	}
}
