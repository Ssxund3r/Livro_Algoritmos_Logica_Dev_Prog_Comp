package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;
/*Z. Ler dois valores númericos inteiros (representados pelas variáveis A e B) e apresentar
 *o resultado inteiro do quadrado da divisão do valor da variável A em relação ao valor da variável B
 *armazenado em memória.*/
import java.util.Scanner;
public class ExercicioZ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, r;
		
		System.out.println("Digite o valor para A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor para B:");
		b = scanner.nextInt();
		
		r = (int) Math.pow((a / b), 2);
		
		System.out.println("O resultado é:" + r);
		
		scanner.close();
	}
}
