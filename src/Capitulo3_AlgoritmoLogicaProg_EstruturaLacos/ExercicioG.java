package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;
/*Exercicio G: Elaborar um programa que apresente os resultados das pot�ncias do valor da base 3, elevado a um expoente que varie do valor 0 at� o 15.
 *O programa deve apresentar os valores 1, 3 , 9 , 27, ..., 14.348.9077. Sugest�o: leve em considera��o as defini��es matem�ticas do c�lculo de pot�ncia, em que qualquer 
 *valor numerico diferente de zero elevado a zero � 1, e todo o valor numerio elevado a 1 � ele pr�prio. N�o use o operador aritm�tico de exponencia��o 
 *apresentado no Cap�tulo 3; resolva o problema com a t�cnica de la�o.*/
public class ExercicioG {
	public static void main(String[] args) {
		
		int P, I;
		
		P = 1;
		I = 0;
		
		while(I <= 15) {
			System.out.println(P + " contador: " + I);
			P = P *3;
			I++;
		}
		
	}
}
