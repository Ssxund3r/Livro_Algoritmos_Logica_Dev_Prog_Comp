package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

public class ExercicioA1 {
	public static void main(String[] args) {
		int quadrado, i;

		for (i = 15; i < 200; i++) {
			quadrado = (int) Math.pow(i, 2);

			System.out.println("Total: " + quadrado + " --- " + " Laço: " + i);
		}
	}
}
