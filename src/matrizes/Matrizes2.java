package matrizes;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float matrizNotas[][] = new float[10][4];
		float soma = 0, media = 0;

		for (int linha = 0; linha < 10; linha++) {
			System.out.println("Digite a nota do " + (linha + 1) + "º aluno:");
			for (int coluna = 0; coluna < 4; coluna++)
				matrizNotas[linha][coluna] = leia.nextFloat();

		}
		System.out.println("\nAs notas foram foram: \n");

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println((linha + 1) + "º aluno " + matrizNotas[linha][coluna]);
			}

		}
		for (int linha = 0; linha < 10; linha++)
			for (int coluna = 0; coluna < 4; coluna++) {
				soma += matrizNotas[linha][coluna];

			}

	}

}
