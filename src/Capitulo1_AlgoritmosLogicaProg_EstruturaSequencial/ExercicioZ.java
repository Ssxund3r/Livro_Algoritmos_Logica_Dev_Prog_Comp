package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;
/*Z. Ler dois valores n�mericos inteiros (representados pelas vari�veis A e B) e apresentar
 *o resultado inteiro do quadrado da divis�o do valor da vari�vel A em rela��o ao valor da vari�vel B
 *armazenado em mem�ria.*/
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
		
		System.out.println("O resultado �:" + r);
		
		scanner.close();
	}
}
