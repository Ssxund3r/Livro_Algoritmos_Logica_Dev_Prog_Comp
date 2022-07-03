package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

public class ExercicioD1 {
	public static void main(String[] args) {
		int s, i, resto;

		s = 0;
		for (i = 1; i < 500; i++) {
			resto = i - 2 * (i / 2);

			if (resto == 0) {
				s = s + i;

			}
			System.out.println("Total da operação: " + s + " Laço: " + i);
		}
	}
}
