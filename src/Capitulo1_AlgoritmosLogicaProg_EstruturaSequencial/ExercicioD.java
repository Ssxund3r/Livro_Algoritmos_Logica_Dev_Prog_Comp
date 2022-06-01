package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

/*D. Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz 
 *12 quil�metros por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto (vari�vel TEMPO) e a 
 *velocidade m�dia (vari�vel VELOCIDADE) durante a viagem. Dessa forma, ser� poss�vel obter a dist�ncia percorrida 
 *com a f�rmula DISTANCIA <- TEMPO * VELOCIDADE. A partir do valor da dist�ncia, basta calcular a quantidade de litros 
 *de combust�vel utilizada na viagem com a f�rmula LITROS_USADOS <- DISTANCIA / 12. O programa deve apresentar os valores 
 *de velocidade m�dia, tempo gasto na viagem, a dist�ncia percorrida e a quantidade de litros utilizada na viagem. */
import java.util.Scanner;

public class ExercicioD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double tempo, velocidade, distancia, litrosUsados;

		System.out.println("Digite o tempo gasto: ");
		tempo = scanner.nextDouble();

		System.out.println("Digite a velocidade m�dia: ");
		velocidade = scanner.nextDouble();

		distancia = tempo * velocidade;

		litrosUsados = distancia / 12;
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("A velocidade total �:" + String.format("%.2f", velocidade));
		System.out.println("---------------------------------------------------------------");
		System.out.println("A tempo total �:" + String.format("%.2f", tempo));
		System.out.println("---------------------------------------------------------------");
		System.out.println("A dist�ncia total �:" + String.format("%.2f", distancia));
		System.out.println("---------------------------------------------------------------");
		System.out.println("O total de litros usados �:" + String.format("%.2f", litrosUsados));
		System.out.println("---------------------------------------------------------------");

		scanner.close();
	}

}
