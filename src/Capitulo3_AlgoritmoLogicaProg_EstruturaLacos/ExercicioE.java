package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio E: Elaborar um programa que apresente todos os valores num�ricos inteiros �mpares 
 *situados na faixa de 0 a 20. Sugest�o: para verificar se o valor num�rico � impar, dentro do la�o 
 *de repeti��o, fazer a verifica��o l�gica dessa condi��o com a intru��o se/fim_se dentro do pr�prio
 *la�o, perguntando se o valor n�merico do contador � impar (se o resto do n�mero divido por 2 � diferente de zero);
 *sentro, motre-o; n�o sendo, passe para o pr�ximo valor numerico.*/
public class ExercicioE {
	public static void main(String[] args) {
		int I, resto;

		I = 0;
		while (I <= 20) {

			resto = I - 2 * (I / 2);

			if (resto != 0) {
				System.out.println(I);
			}
			I++;
		}
	}
}
