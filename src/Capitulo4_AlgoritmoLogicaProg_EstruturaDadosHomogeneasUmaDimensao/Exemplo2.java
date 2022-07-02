package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

/*Exemplo#2: V2*/
public class Exemplo2 {
	public static void main(String[] args) {
		int i;
		double[] md = { 4,5 , 6,5 , 8,0 , 3,5 , 6,0 , 6,5 , 6,5 , 6,0 };
		double soma = 0, media;

		for (i = 0; i < 8; i++) {
			System.out.println(md[i]);
			soma = soma + md[i];
		}
		System.out.println();
		media = soma / 8;
		
		for (i = 0; i < 8; i++) {
			
			System.out.println(md[i]);
		}
		System.out.println("-------");
		System.out.println(media);
	}
}
