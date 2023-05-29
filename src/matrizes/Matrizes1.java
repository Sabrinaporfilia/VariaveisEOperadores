package matrizes;

import java.util.Scanner;

public class Matrizes1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		int soma1 = 0, soma2 = 0;
		System.out.println("Elementos da Diagonal Principal: ");
		for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
			for (int indiceColuna = 2; indiceColuna < 3; indiceColuna++) {
				System.out.print(matriz[indiceLinha][indiceLinha] + " ");
				soma1 = soma1 + matriz[indiceLinha][indiceLinha];
			}
		}
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
			for (int indiceColuna = 2; indiceColuna < 3; indiceColuna++) {
				System.out.print(matriz[indiceLinha][indiceColuna - indiceLinha] + " ");
				soma2 = soma2 + matriz[indiceLinha][indiceColuna - indiceLinha];
			}

		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal:\n" + soma1);
		System.out.println("Soma dos Elementos da Diagonal Secundária:\n" + soma2);

	}
}
