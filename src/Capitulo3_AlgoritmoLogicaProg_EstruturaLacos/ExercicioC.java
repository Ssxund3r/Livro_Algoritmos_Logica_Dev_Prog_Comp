package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio C: Construir um programa que apresente a soma dos cem primeiros números naturais 
 *(1 + 2 + 3 +.... + 98 + 99 + 100)*/
public class ExercicioC {
	public static void main(String[] args) {

		int S, I;

		I = 1;
		while (I <= 100) {
			S = 0;
			S = S + I;
			I++;

			System.out.println(S);
		}

	}
}
