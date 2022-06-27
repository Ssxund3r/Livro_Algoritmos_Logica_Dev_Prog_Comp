package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;
/*Exercício T: Elaborar um programa que apresente os quadrados sem armazená-los na memória
 *dos valroes inteiros existentes na faixa de valores de 15 a 200 com saltos de 3 em 3.*/
public class ExercicioT {
	public static void main(String[] args) {
		
		int i;
		
		i = 15;
		
		while(i <= 200) {
			System.out.println("Total: " +Math.pow(i, 2) + " |------| " + " Laço: " + i);
			i = i + 3;
		}
		
	}
}
