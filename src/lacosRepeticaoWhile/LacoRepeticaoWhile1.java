package lacosRepeticaoWhile;

import java.util.Scanner;

public class LacoRepeticaoWhile1 {

	public static void main(String[] args) {

		int idade, menos21 = 0, mais50 = 0;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {

			if (idade < 21) {
				menos21++;
			}
			if (idade > 50) {
				mais50++;
			}
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}

		if (idade <= 0) {

			System.out.println("Total de pessoas menores de 21 anos:" + menos21);
			System.out.println("Total de pessoas maiores de 50 anos:" + mais50);

		}
	}

}
