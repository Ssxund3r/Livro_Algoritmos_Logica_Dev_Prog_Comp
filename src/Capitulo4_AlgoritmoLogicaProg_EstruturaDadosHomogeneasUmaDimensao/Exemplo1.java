package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;
/*Exemplo 1: */
public class Exemplo1 {
	public static void main(String[] args) {
		int i;
		double[] md = {4,5 , 6,5 , 8,0 , 3,5 , 6,0 , 6,5 , 6,5 , 6,0}; 
		double  soma, media;
		
		soma = 0;
		
		for(i=0; i < 8; i++) {
			System.out.println(md[i]);
			soma = soma + md[i];
		}
		media = soma / 8;
		System.out.println(media);
		
	}
}
