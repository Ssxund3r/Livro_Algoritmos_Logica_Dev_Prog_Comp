package Capitulo2_AlgoritmoLogicaProg_EstruturaCondicional;

import java.util.Scanner;

/*Entendimento
 *1. Efetuar a leitura de um valor numerico inteiro (variável MES)
 *2. Se a variável MES for igual a 1, apresentar a mensagem "Janeiro";
 *3. Se a variável MES for igual a 2, apresentar a mensagem "Fevereiro";
 *4. Se a variável MES for igual a 3, apresentar a mensagem "Março";
 *5. Se a variável MES for igual a 4, apresentar a mensagem "Abril";
 *6. Se a variável MES for igual a 5, apresentar a mensagem "Maio";
 *7. Se a variável MES for igual a 6, apresentar a mensagem "Junho";
 *8. Se a variável MES for igual a 7, apresentar a mensagem "Julho";
 *9. Se a variável MES for igual a 8, apresentar a mensagem "Agosto";
 *10. Se a variável MES for igual a 9, apresentar a mensagem "Setemebro";
 *11. Se a variável MES for igual a 10, apresentar a mensagem "Outubro";
 *12. Se a variável MES for igual a 11, apresentar a mensagem "Novembro";
 *13. Se a variável MES for igual a 12, apresentar a mensagem "Dezembro";*
 *14. Se a variável MES for menor que 1 ou maior que 12, apresentar a mensagem "Valor inválido".*/
public class Exemplo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mes;

		System.out.println("Digite o número de um mês: [0 - 12] ");
		mes = scanner.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Valor inválido! tente novamente...");
			break;
		}

		scanner.close();
	}
}
