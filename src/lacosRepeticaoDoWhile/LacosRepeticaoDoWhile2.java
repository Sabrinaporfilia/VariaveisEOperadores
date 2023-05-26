package lacosRepeticaoDoWhile;

import java.util.Scanner;

public class LacosRepeticaoDoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		float soma = 0f, contador = 0f, media = 0f;

		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num % 3 == 0 && num != 0) {
				soma += num;
				contador++;
			}
		} while (num != 0);

		media = soma / contador;
		System.out.printf("A média de todos números múltiplos de 3 é: %.1f", media);

	}

}
