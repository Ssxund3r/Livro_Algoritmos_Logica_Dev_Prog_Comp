package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio P: Elaborar um programa que apresente os resultados da soma e da m�dia aritm�tica 
 *dos valores pares situados na faixa num�rica de 50 at� 70.*/
public class ExercicioP {
	public static void main(String[] args) {
		int soma, total, r, i;
		double media;

		total = 0;
		soma = 0;
		i = 50;

		while (i <= 70) {
			r = i - 2 * (i / 2);

			if (r == 0) {
				soma = soma + i;
				total++;
			}

			media = soma / total;
			System.out.println("Soma: " + soma + " Media: " + media + " la�o: " + i);
			i++;
		}
	}
}
