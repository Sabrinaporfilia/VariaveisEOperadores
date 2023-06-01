package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsList2 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();

		Integer num1 = 0, num3 = 0, num2 = 0;

		for (num2 = 1; num2 <= 10; num2++) {
			System.out.println("Digite " + num2 + "° número... ");
			num1 = Ler.nextInt();
			num.add(num1);
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		num3 = Ler.nextInt();

		if (num.contains(num3)) {
			System.out.println("\nA posição do " + num3 + " é :" + num.indexOf(num3));
		} else {
			System.out.println("\nO numero " + num3 + " não foi encontrado");
		}
	}

}
