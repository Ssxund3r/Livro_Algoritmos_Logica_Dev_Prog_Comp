package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*G. Ler quatro num�ricos inteiros e apresentar os resultados armazenados em mem�ria das adi��es e multiplica��es 
 *utilizando o mesmo racioc�nio aplicado quando do uso de propriedades distributivas para a m�xima combina��o poss�vel entre
 *as quatro vari�veis. N�o � para clacular a propriedade distributiva, deve-se apenas usar a sua forma de combina��o. Considerando a leitura de valores para
 *variaveis A, B, C, e D, devem ser feitas seis adi��es e seis multiplica��es, ou seja, deve ser combinada a vari�vel A com a variavel B
 *, a variavel A com a variavel C, a variavel A com a variavel D. Depois, � necess�rio combinar a vari�vel B com a variavel C,
 *variavel B com a variavel D e por fim, a variavel C ser� combinada com a variavel D.  */
public class ExercicioG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, d, a1, a2, a3, a4, a5, a6, m1, m2, m3, m4, m5, m6;

		System.out.println("digite um n�mero para A: ");
		a = scanner.nextInt();

		System.out.println("digite um n�mero para B: ");
		b = scanner.nextInt();

		System.out.println("digite um n�mero para C: ");
		c = scanner.nextInt();

		System.out.println("digite um n�mero para D: ");
		d = scanner.nextInt();

		a1 = a + b;
		a2 = a + c;
		a3 = a + d;
		a4 = b + c;
		a5 = b + d;
		a6 = c + d;
		m1 = a * b;
		m2 = a * c;
		m3 = a * d;
		m4 = b * c;
		m5 = b * d;
		m6 = c * d;

		System.out.println("O resultado foi: " + a1 + "\n" + a2 + "\n" + a3 + "\n" + "\n" + a4 + "\n" + a5 + "\n" + a6
				+ "\n" + m1 + "\n" + m2 + "\n" + m3 + "\n" + m4 + "\n" + m5 + "\n" + m6);

		scanner.close();
	}

}
