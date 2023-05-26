package lacosRepeticaoFor;

import java.util.Scanner;

public class LacoRepeticaoFor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, contador;

		System.out.println("Digite o primeiro número do intervalo:");
		num1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		num2 = leia.nextInt();

		if (num1 >= num2) {
			System.out.println("Intervalo inválido!");
		}
		System.out.println("No Intervalo entre " + num1 + " e " + num2 + ":");
		for (contador = num1; contador <= num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {

				System.out.println(contador + " é múltiplo de 3 e 5");

			}
		}

	}

}
