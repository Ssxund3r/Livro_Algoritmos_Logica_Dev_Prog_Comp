package Capitulo3_AlgoritmoLogicaProg_EstruturaLacos;

/*Exercicio E: Elaborar um programa que apresente todos os valores numéricos inteiros ímpares 
 *situados na faixa de 0 a 20. Sugestão: para verificar se o valor numérico é impar, dentro do laço 
 *de repetição, fazer a verificação lógica dessa condição com a intrução se/fim_se dentro do próprio
 *laço, perguntando se o valor númerico do contador é impar (se o resto do número divido por 2 é diferente de zero);
 *sentro, motre-o; não sendo, passe para o próximo valor numerico.*/
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
