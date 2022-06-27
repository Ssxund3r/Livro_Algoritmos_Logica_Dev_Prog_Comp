package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio I: Escrever um programa que apresente os valores da sequência numérica de Fibonacci
 *até o décimo quinto termo. A sequência de Fibonacci é formada pelo valores numéricos 0, 1, 1, 
 *2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377... etc.., obtendo-se o próximo termo a partir da 
 *soma do termo atual com o anterior sucessivamente até o infinito se a sequência não for interrompida,
 *sendo determinada a partir da fórmula Fn = Fn-1 + Fn-2. Utilize para este exercicio as variaveis ATUAL, ANTERIOR e PROXIMO */
public class ExercicioI {
	public static void main(String[] args) {

		int i, atual, anterior, proximo;

		anterior = 0;
		atual = 1;
		i = 1;

		while (i <= 15) {
			System.out.println(atual);
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
			i++;
		}

	}

}
