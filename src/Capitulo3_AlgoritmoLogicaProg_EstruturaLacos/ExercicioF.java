package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio F: Construir um programa que apresente todos os valores num�ricos divisiveis por 4 
 *e menores que 200. Seguest�o: a vari�vel que controla o contador do la�o deve ser iniciado em 1.*/
public class ExercicioF {
	public static void main(String[] args) {
		int I, resto;

		I = 1;
		while (I < 200) {

			resto = I - 4 * (I / 4);

			if (resto == 0) {
				System.out.println(I);
			}
			I++;
		}
	}
}
