package Capitulo1_AlgoritmosLogicaProg_EstruturaSequencial;

import java.util.Scanner;

/*R. Em uma elei��o sindical concerreram ao cargo de presidente tr�s candidatos(representados pelas variaveis A, B e C).
 *Durante a apura��o dos votos foram computados votos nulos e em branco, al�m dos votos v�lidos para cada candidato.
 *Deve ser criado um programa de computador que fa�a a leitura da quantidade de votos v�lidos para cada candidato.
 *al�m de ler tamb�m a quantidade de votos nulos e em branco. Ao final, o programa deve apresentar o n�mero total
 *de eleitores, considerando votos v�lidos, nulos e em branco; o percentual correnpondente de votos validos do canditato A
 *em rela��o � quantidade de eleitores; o percentual correspondente de votos v�lidos do candidato B em rela��o � quantidade 
 *de eleitores;o percentual correspondente de votos v�lidos do candidato C em rela��o � quantidade de eleitores;
 *e, por �ltimo, o percentual correspondente de votos em branco em rela��o � quantidade de eleitores. 
 *Todos os c�lculos devem efetivamente ser armazenados em mem�ria.*/
public class ExercicioR {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int votoA, votoB, votoC,votoNulo, votoBranco, totalEleitores;
		double percentualTotalVotos, percentualVotoA, percentualVotoB, percentualVotoC, percentualVotoNulo, percentualVotoBranco;
		
		System.out.println("Digite o total de votos para o candidato A: ");
		votoA = scanner.nextInt();
		
		System.out.println("Digite o total de votos para o candidato B: ");
		votoB = scanner.nextInt();
		
		System.out.println("Digite o total de votos para o canditato C: ");
		votoC = scanner.nextInt();
		
		System.out.println("Digite o total de votos nulos: ");
		votoNulo = scanner.nextInt();
		
		System.out.println("Digite o total de votos em branco: ");
		votoBranco = scanner.nextInt();
		
		totalEleitores = votoA + votoB + votoC + votoNulo + votoBranco;
		
		percentualTotalVotos = (votoA + votoB + votoC) * 100 / totalEleitores;
		
		percentualVotoA = votoA * 100 / totalEleitores;
		percentualVotoB = votoB * 100 / totalEleitores;
		percentualVotoC = votoC * 100 / totalEleitores;
		
		percentualVotoNulo = votoNulo * 100 / totalEleitores;
		
		percentualVotoBranco = votoBranco * 100 / totalEleitores;
		
		System.out.println("O total de eleitores �: " + totalEleitores);
		System.out.println("----------------------------------------------------------------");
		System.out.println("O total do percentual de votos �: " + String.format("%.2f", percentualTotalVotos));
		System.out.println("----------------------------------------------------------------");
		System.out.println("O total do percentual nos votos do candidato A:" + String.format("%.2f", percentualVotoA));
		System.out.println("----------------------------------------------------------------");
		System.out.println("O total do percentual nos votos do candidato B: " + String.format("%.2f", percentualVotoB));
		System.out.println("----------------------------------------------------------------");
		System.out.println("O total do percentual nos votos do candidato C: " + String.format("%.2f", percentualVotoC));
		System.out.println("----------------------------------------------------------------");
		System.out.println("O total do percentual de votos nulos s�o: " + String.format("%.2f", percentualVotoNulo));
		System.out.println("----------------------------------------------------------------");
		System.out.println("O total do percentual de votos em branco s�o: " + String.format("%.2f", percentualVotoBranco));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Encerrando... ");
		
		scanner.close();
	}
}
