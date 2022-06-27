package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio J: Elaborar um programa que apresente os valores de converão de graus Celsius em graus
 *Fahrenheit, de dez em dez graus Celsius e finalizando em cem graus Celsius. O programa deve apresentar os valores
 *das duas temperaturas.*/
public class ExercicioJ {
	public static void main(String[] args) {
		double C, F;

		C = 10;
		while (C <= 100) {

			F = (9 * C + 160) / 5;

			System.out.println("-----------------------------------------");
			System.out.println("|Celsius: " + C + " |------|" + " Fahrenheit: " + F);
			System.out.println("-----------------------------------------");

			C = C + 10;
		}
	}
}
