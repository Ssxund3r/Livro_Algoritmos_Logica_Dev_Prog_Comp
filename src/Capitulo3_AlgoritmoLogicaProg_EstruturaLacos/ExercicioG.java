package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;
/*Exercicio G: Elaborar um programa que apresente os resultados das potências do valor da base 3, elevado a um expoente que varie do valor 0 até o 15.
 *O programa deve apresentar os valores 1, 3 , 9 , 27, ..., 14.348.9077. Sugestão: leve em consideração as definições matemáticas do cálculo de potência, em que qualquer 
 *valor numerico diferente de zero elevado a zero é 1, e todo o valor numerio elevado a 1 é ele próprio. Não use o operador aritmético de exponenciação 
 *apresentado no Capítulo 3; resolva o problema com a técnica de laço.*/
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
