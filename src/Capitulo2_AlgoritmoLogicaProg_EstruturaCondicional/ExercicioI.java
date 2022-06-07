package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*I. Ler cinco valores numéricos inteiros (A, B, C, D e E), identificar e apresentar
 *o maior e o menor valores informados. Não execute a ordenação dos valores como no exercício "f".*/
public class ExercicioI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, e, valorMaior, valorMenor;
		
		System.out.println("Digite o valor para A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor para B: ");
		b = scanner.nextInt();
		
		System.out.println("Digite o valor para C: ");
		c = scanner.nextInt();
		
		System.out.println("Digite o valor para D: ");
		d = scanner.nextInt();
		
		System.out.println("Digite o valor para E: ");
		e = scanner.nextInt();
		
		valorMaior = a;
		valorMenor = a;
		
		if (valorMaior < b) {
			valorMaior = b;
		}
		
		if (valorMaior < c) {
			valorMaior = c;
		}
		
		if (valorMaior < d) {
			valorMaior = d;
		}
		
		if (valorMaior < e) {
			valorMaior = e;
		}
		
		if (valorMenor > b) {
			valorMenor = b;
		}
		
		if (valorMenor > c) {
			valorMenor = c;
		}
		
		if (valorMenor > d) {
			valorMenor = d;
		}
		
		if (valorMenor > e) {
			valorMenor = e;
		}
		
		System.out.println("Maior valor é: " + valorMaior);
		System.out.println("Menor valor é: " + valorMenor);
		
		scanner.close();
	}
}
