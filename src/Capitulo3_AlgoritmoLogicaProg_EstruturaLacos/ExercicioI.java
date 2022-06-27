package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio I: Escrever um programa que apresente os valores da sequ�ncia num�rica de Fibonacci
 *at� o d�cimo quinto termo. A sequ�ncia de Fibonacci � formada pelo valores num�ricos 0, 1, 1, 
 *2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377... etc.., obtendo-se o pr�ximo termo a partir da 
 *soma do termo atual com o anterior sucessivamente at� o infinito se a sequ�ncia n�o for interrompida,
 *sendo determinada a partir da f�rmula Fn = Fn-1 + Fn-2. Utilize para este exercicio as variaveis ATUAL, ANTERIOR e PROXIMO */
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
