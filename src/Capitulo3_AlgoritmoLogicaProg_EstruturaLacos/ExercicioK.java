package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio K: Escrever um programa que calcule e apresente o somatório do número de grãos de trigo
 *que se pode obter em um tabuleiro de xadrez, obedecendo á seguinte regra: colocar um grão de trigo
 *no primeiro quadro, e nos quadros seguintes, o dobro do quadro anterior. Ou seja, no primeiro quadro 
 *coloca-se um grão, no segundo quadro colocam-se dois grãos (neste têm-se três grãos), no terceiro quadro 
 *colocam-se quatro grãos (tendo neste momento têm-se sete grãos), no quarto quadro colocam-se oito grãos 
 *(tendo-se então, 15 grãos), até atingir o sexagésimo quarto quadro. */
public class ExercicioK {
	public static void main(String[] args) {
		int i, grao, quadro;

		grao = 0;
		quadro = 1;
		i = 1;

		while (i <= 64) {	
			grao = grao + quadro;
			
			quadro = quadro * 2;
			
			i++;
			
			System.out.println("----------------------");
			System.out.println("|Grãos: " + grao + " |");
			System.out.println("----------------------");

		}

	}
}
