package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercício A: Elaborar um programa que apresente como resultado os quadrados, armazenados na memória 
 *dos números inteiros existentes na faixa de valores de 15 a 200;*/
public class ExercicioA {
	public static void main(String[] args) {
		int quadrado, i;

		i = 15;
		while (i <= 200) {
			quadrado = (int) Math.pow(i, 2);
			System.out.println("O resultado do quadrado é: " + quadrado + " ----- " + "laço " + i);
			i++;
		}
	}
}
