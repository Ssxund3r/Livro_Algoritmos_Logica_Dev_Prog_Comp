package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

public class ExercicioF1 {
	public static void main(String[] args) {

		int i, resto;

		for (i = 1; i < 200; i++) {
			resto = i - 4 * (i / 4);
			
			if (resto == 0) {
				System.out.println(i);
			}
		}
	}
}
