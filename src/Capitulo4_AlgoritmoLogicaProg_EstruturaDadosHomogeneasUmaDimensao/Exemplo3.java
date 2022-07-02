package Capitulo4_AlgoritmoLogicaProg_EstruturaDadosHomogeneasUmaDimensao;

/*Exemplo#3: Desenvolver um programa que leia dez elementos numéricos reais de uma matriz A do tipo vetor.
 *Construir uma matriz B do mesmo tipo, observando a seguinte lei de formação: se o valor do indice da matriz A for par,
 *o valor deve ser multiplicado por 5; sendo impar, deve ser somado com 5. Ao final mostrar o conteúdo da matriz A e B.
 *
 *Entendimento: 
 *
 *1. Iniciar o contador de indice, variável I como 1, estendendo essa contagem até 10;
 *2. Ler os dez valores, um a um;
 *3. Verificar se o índice da matriz A é par; se sim, multiplicar o valor por 5; se não, somar 5 ao valor.
 *Criar a matriz B e atribuir a ela os valores da matriz A devidamente calculados.
 *4. Apresentar o conteudo da matriz B;*/
public class Exemplo3 {
	public static void main(String[] args) {

		int i, r;
		double A[] = { 1,5 , 4,5 , 6,0 , 8,0, 7,5 , 5,4 , 4,5 , 2,5 , 1,1 , 2,2 };
		double B[] = { 1,5 , 4,5 , 6,0 , 8,0, 7,5 , 5,4 , 4,5 , 2,5 , 1,1 , 2,2 };

		for (i = 0; i < 10; i++) {

			System.out.println(A[i]);
		}

		for (i = 0; i < 10; i++) {
			r = i - 2 * (i / 2);

			if (r == 0) {
				B[i] = A[i] * 5;

			} else {
				B[i] = A[i] + 5;
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Matriz A: " + A[i] + " |----| " +" Matriz B: " + B[i]);
		
		}

	}
}
