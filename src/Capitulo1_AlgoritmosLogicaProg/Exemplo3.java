package Capitulo1_AlgoritmosLogicaProg;

import java.util.Locale;
import java.util.Scanner;

/*Desenvolver um programa que calcule o sal�rio l�quido de um professor. Para elaborar o programa,
 *� necess�rio possuir alguns dados, como valor da hora-aula, n�mero de horas trabalhadas no m�s e
 *percentual de desconto do INSS. Em primeiro lugar, deve-se estabelecer o seu sal�rio bruto para 
 *fazer o desconto e ter o valor do sal�rio l�quido.
 *
 *Entendimento:
 * 
 *1. Estabelecer a leitura da vari�vel HT [horasTrabalhadas].
 *2. Estabelecer a leitura da vari�vel VH [valorHoraAula].
 *3. Estabelecer a leitura da vari�vel PD [percentualDesconto].
 *4. Calcular SB sal�rio bruto [salarioBruto], sendo a multiplica��o das vari�veis HT e VH.
 *5. Calcular o total de desconto TD [totalDesconto], com base no valor de PD divido por 100.
 *6. Calcular o sal�rio l�quido SL [salarioLiquido], deduzindo o desconto do sal�rio bruto SB.
 *7. Apresentar os valores dos sal�rios bruto e l�quido: SB e SL.*/
public class Exemplo3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int horasTrabalhadas;
		double valorHoraAula, percentualDesconto, totalDesconto, salarioBruto, salarioLiquido;

		System.out.println("Digite as horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();

		System.out.println("Digite o valor total das horas das aulas do m�s: ");
		valorHoraAula = scanner.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		percentualDesconto = scanner.nextDouble();

		salarioBruto = horasTrabalhadas * valorHoraAula;

		totalDesconto = (percentualDesconto / 100) * salarioBruto;

		salarioLiquido = salarioBruto - totalDesconto;

		System.out.println("-------------------------------------------------");
		System.out.println("O total do Sal�rio Bruto �: " + String.format("%.2f", salarioBruto));
		System.out.println("-------------------------------------------------");
		System.out.println("O total do sal�rio l�quido �: " + String.format("%.2f", salarioLiquido));
		System.out.println("-------------------------------------------------");

		scanner.close();
	}
}
