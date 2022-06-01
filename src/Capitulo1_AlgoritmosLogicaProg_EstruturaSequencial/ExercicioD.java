package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

/*D. Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 
 *12 quilômetros por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (variável TEMPO) e a 
 *velocidade média (variável VELOCIDADE) durante a viagem. Dessa forma, será possível obter a distência percorrida 
 *com a fórmula DISTANCIA <- TEMPO * VELOCIDADE. A partir do valor da distância, basta calcular a quantidade de litros 
 *de combustível utilizada na viagem com a fórmula LITROS_USADOS <- DISTANCIA / 12. O programa deve apresentar os valores 
 *de velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem. */
import java.util.Scanner;

public class ExercicioD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double tempo, velocidade, distancia, litrosUsados;

		System.out.println("Digite o tempo gasto: ");
		tempo = scanner.nextDouble();

		System.out.println("Digite a velocidade média: ");
		velocidade = scanner.nextDouble();

		distancia = tempo * velocidade;

		litrosUsados = distancia / 12;
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("A velocidade total é:" + String.format("%.2f", velocidade));
		System.out.println("---------------------------------------------------------------");
		System.out.println("A tempo total é:" + String.format("%.2f", tempo));
		System.out.println("---------------------------------------------------------------");
		System.out.println("A distância total é:" + String.format("%.2f", distancia));
		System.out.println("---------------------------------------------------------------");
		System.out.println("O total de litros usados é:" + String.format("%.2f", litrosUsados));
		System.out.println("---------------------------------------------------------------");

		scanner.close();
	}

}
