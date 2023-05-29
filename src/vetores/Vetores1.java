package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int indice, num;
		Scanner leia = new Scanner(System.in);

		System.out.print("Vetor ");
		for (indice = 0; indice < 10; indice++) {
			System.out.print(vetorInteiros[indice] + "|");

		}
		
		Arrays.sort(vetorInteiros);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();

		int posicao = Arrays.binarySearch(vetorInteiros, num);

		if (posicao >= 0)
			System.out.println("\nO número " + num + " está localizado na posição: " + posicao);
		else
			System.out.println("\nO número " + num + " não foi encontrado!");

	}

}
