package Capitulo1_AlgoritmosLogicaProg;

import java.util.Locale;
import java.util.Scanner;

/*Desenvolver um programa que calcule o salário líquido de um professor. Para elaborar o programa,
 *é necessário possuir alguns dados, como valor da hora-aula, número de horas trabalhadas no mês e
 *percentual de desconto do INSS. Em primeiro lugar, deve-se estabelecer o seu salário bruto para 
 *fazer o desconto e ter o valor do salário líquido.
 *
 *Entendimento:
 * 
 *1. Estabelecer a leitura da variável HT [horasTrabalhadas].
 *2. Estabelecer a leitura da variável VH [valorHoraAula].
 *3. Estabelecer a leitura da variável PD [percentualDesconto].
 *4. Calcular SB salário bruto [salarioBruto], sendo a multiplicação das variáveis HT e VH.
 *5. Calcular o total de desconto TD [totalDesconto], com base no valor de PD divido por 100.
 *6. Calcular o salário líquido SL [salarioLiquido], deduzindo o desconto do salário bruto SB.
 *7. Apresentar os valores dos salários bruto e líquido: SB e SL.*/
public class Exemplo3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int horasTrabalhadas;
		double valorHoraAula, percentualDesconto, totalDesconto, salarioBruto, salarioLiquido;

		System.out.println("Digite as horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();

		System.out.println("Digite o valor total das horas das aulas do mês: ");
		valorHoraAula = scanner.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		percentualDesconto = scanner.nextDouble();

		salarioBruto = horasTrabalhadas * valorHoraAula;

		totalDesconto = (percentualDesconto / 100) * salarioBruto;

		salarioLiquido = salarioBruto - totalDesconto;

		System.out.println("-------------------------------------------------");
		System.out.println("O total do Salário Bruto é: " + String.format("%.2f", salarioBruto));
		System.out.println("-------------------------------------------------");
		System.out.println("O total do salário líquido é: " + String.format("%.2f", salarioLiquido));
		System.out.println("-------------------------------------------------");

		scanner.close();
	}
}
