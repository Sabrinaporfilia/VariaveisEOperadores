package lacosRepeticaoDoWhile;

import java.util.Scanner;

public class LacoRepeticaoDoWhile1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int somapositivos = 0, numero;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero > 0) {
				somapositivos += numero;
			}

		} while (numero != 0);

		System.out.println("A soma dos numeros positivos é: " + somapositivos);

	}

}
