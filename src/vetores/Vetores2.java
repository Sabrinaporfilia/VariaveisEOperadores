package vetores;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		int vetorInteiros[] = new int[10];
		int indice, num, soma = 0;

		Scanner leia = new Scanner(System.in);

		for (indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			vetorInteiros[indice] = leia.nextInt();
		}
		System.out.println("vetor ");
		for (indice = 0; indice < 10; indice++) {
			System.out.print(vetorInteiros[indice] + "|");
		}
		System.out.println("\nElementos nos índices ímpares: ");
		for (indice = 0; indice < 10; indice++) {
			if (indice % 2 == 1) {
				System.out.print(vetorInteiros[indice] + " ");
			}

		}
		System.out.println("\nElementos pares:");
		for (indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] % 2 == 0) {
				System.out.print(vetorInteiros[indice] + " ");
			}
		}
		for (indice = 0; indice < 10; indice++) {
			soma += vetorInteiros[indice];

		}
		System.out.println("\nSoma:" + soma);
		float media =  (float)  soma / 10;
		System.out.printf("\nMédia %.1f ", media);
	}
}
