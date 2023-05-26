package lacosRepeticaoFor;

import java.util.Scanner;

public class LacoRepeticaoFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, contador, numPares = 0, numImpares = 0;

		for (contador = 1; contador != 11; contador++) {
			System.out.println("\nDigite o " + contador + "º número: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				numPares++;
			}
			if (num % 2 != 0) {
				numImpares++;
			}

		}
		System.out.println("Total de números pares: " + numPares);
		System.out.println("Total de números ímpares: " + numImpares);

	}

}
