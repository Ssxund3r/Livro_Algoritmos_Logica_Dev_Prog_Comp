package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

public class ExercicioI1 {
	public static void main(String[] args) {
		int i, atual, anterior, proximo;

		anterior = 0;
		atual = 1;

		for (i = 0; i < 15; i++) {
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;

			System.out.println(atual);
		}

	}
}
