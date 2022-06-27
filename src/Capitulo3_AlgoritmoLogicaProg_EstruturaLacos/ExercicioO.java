package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercico O: Construir um programa que apresente como resultado a fatorial dos valores impares 
 *situados na faixa numérica de 1 até 10.*/
public class ExercicioO {
	public static void main(String[] args) {
		int fat, i, j, r;

		i = 1;

		while (i <= 10) {
			r = i - 2 * (i / 2);

			if (r != 0) {
				fat = 1;
				j = 1;

				while (j <= i) {
					fat = fat * j;
					j++;
				}
				System.out.println(fat);
			}
			i++;
		}
	}
}
