package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

/*E. Efetuar a leitura de tr�s valores num�ricos (representados pelas vari�veis A, B e C) e
 *processar o c�lculo da equa��o completa de segundo grau, utilizando a f�rmula de Bhaskara
 *(Considerar para a solu��o do problema todas as poss�veis condi��es para delta: delta < 0 -
 *n�o h� solu��o real, delta > 0 - h� duas solu��es reiais e diferentes e delta = 0 - h� apenas
 *um solu��o real). Lembre-se de que � completa a equa��o de segundo grau que possui todos os coeficientes
 *A, B e C diferentes de zero. O programa deve apresentar respostas para todas as condi��es estabelecidas para delta.*/
import java.util.Scanner;

public class ExercicioE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, c, delta, x, x1, x2;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextDouble();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextDouble();

		System.out.println("Digite um valor para C: ");
		c = scanner.nextDouble();

		if ((a == 0) && (b == 0) && (c == 0)) {
			System.out.println("N�o � uma equa��o completa de segundo grau! ");
		} else {
			delta = (b * b) + (-4 * (a * c));

			if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("O valor da opera��o �:" + String.format("%.2f", x));

			} else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta) / 2 * a);
				x2 = (-b - Math.sqrt(delta) / 2 * a);

				System.out.println("O valor da opera��o � X1: " + String.format("%.2f", x1));
				System.out.println("O valor da opera��o � X2: " + String.format("%.2f", x2));
				
			} else {
				System.out.println("N�o exite ra�zes reais! ");
			}
		}

		scanner.close();
	}
}
