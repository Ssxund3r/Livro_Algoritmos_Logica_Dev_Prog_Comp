package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio K: Escrever um programa que calcule e apresente o somat�rio do n�mero de gr�os de trigo
 *que se pode obter em um tabuleiro de xadrez, obedecendo � seguinte regra: colocar um gr�o de trigo
 *no primeiro quadro, e nos quadros seguintes, o dobro do quadro anterior. Ou seja, no primeiro quadro 
 *coloca-se um gr�o, no segundo quadro colocam-se dois gr�os (neste t�m-se tr�s gr�os), no terceiro quadro 
 *colocam-se quatro gr�os (tendo neste momento t�m-se sete gr�os), no quarto quadro colocam-se oito gr�os 
 *(tendo-se ent�o, 15 gr�os), at� atingir o sexag�simo quarto quadro. */
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
			System.out.println("|Gr�os: " + grao + " |");
			System.out.println("----------------------");

		}

	}
}
