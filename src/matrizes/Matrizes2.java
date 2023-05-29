package matrizes;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float matrizNotas[][] = new float[10][4];
		float soma = 0.0f;
		float media[] = new float[10];

		for (int linha = 0; linha < 10; linha++) {
			System.out.println("Digite a nota do " + (linha + 1) + "º aluno:");
			for (int coluna = 0; coluna < 4; coluna++) {
				matrizNotas[linha][coluna] = leia.nextFloat();
				soma += matrizNotas[linha][coluna];
			}
			media[linha] = soma / 4;
			soma = 0.0f; //reinicia a soma
		}
		System.out.println("\nMédias dos alunos:");
		for (int linha = 0; linha < 10; linha++) {
			System.out.printf("Aluno %d: %.1f\n", (linha + 1), media[linha]);
		}
	}

}
