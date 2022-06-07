package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

/*E. Efetuar a leitura de três valores numéricos (representados pelas variáveis A, B e C) e
 *processar o cálculo da equação completa de segundo grau, utilizando a fórmula de Bhaskara
 *(Considerar para a solução do problema todas as possíveis condições para delta: delta < 0 -
 *não há solução real, delta > 0 - há duas soluções reiais e diferentes e delta = 0 - há apenas
 *um solução real). Lembre-se de que é completa a equação de segundo grau que possui todos os coeficientes
 *A, B e C diferentes de zero. O programa deve apresentar respostas para todas as condições estabelecidas para delta.*/
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
			System.out.println("Não é uma equação completa de segundo grau! ");
		} else {
			delta = (b * b) + (-4 * (a * c));

			if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("O valor da operação é:" + String.format("%.2f", x));

			} else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta) / 2 * a);
				x2 = (-b - Math.sqrt(delta) / 2 * a);

				System.out.println("O valor da operação é X1: " + String.format("%.2f", x1));
				System.out.println("O valor da operação é X2: " + String.format("%.2f", x2));
				
			} else {
				System.out.println("Não exite raízes reais! ");
			}
		}

		scanner.close();
	}
}
