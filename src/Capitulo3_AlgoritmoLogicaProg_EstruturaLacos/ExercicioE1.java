package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

public class ExercicioE1 {
	public static void main(String[] args) {
		int i, resto;

		for (i = 0; i < 20; i++) {
			resto = i - 2 * (i / 2);

			if (resto != 0) {
				System.out.println(i);
			}

		}

	}
}
