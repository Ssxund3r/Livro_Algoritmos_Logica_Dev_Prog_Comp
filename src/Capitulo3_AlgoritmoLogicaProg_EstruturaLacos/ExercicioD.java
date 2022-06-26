package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio D: Elaborar um programa que apresente a soma dos valores para 
 *existentes na faixa de 1 até 500.*/
public class ExercicioD {
	public static void main(String[] args) {
		int S, I, resto;
		I = 1;

		while (I <= 500) {
			S = 0;

			resto = I - 2 * (I / 2);

			if (resto == 0) {
				S = S + I;
			}

			I++;
			System.out.println(S);
		}

	}

}
