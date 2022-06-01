package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*Construir um programa que calcule, armazene e apresente em metros por segundo o valor da velocidade
 *de um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos. Utilize a 
 *fórmula VELOCIDADE <- (DISTANCIA * 1000) / (TEMPO * 60).*/
public class ExercicioT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distancia, tempo, velocidade;
		
		System.out.println("Digite o valor para a velocidade: ");
		distancia = scanner.nextDouble();
		
		System.out.println("Digite o valor para o tempo: ");
		tempo = scanner.nextDouble();
		
		velocidade = (distancia * 1000) / (tempo * 60);
		
		System.out.println("O valor da velocidade de um projétil é: " + String.format("%.2f", velocidade));
		
		scanner.close();
	}
}
