package colecctions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet2 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		Set<Integer> num = new HashSet<Integer>();

		Integer num1 = 0, num2 = 0, num3 = 0;

		for (num2 = 1; num2 <= 10; num2++) {
			System.out.println("Digite " + num2 + "° número... ");
			num1 = Ler.nextInt();
			num.add(num1);
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		num3 = Ler.nextInt();
		num.add(num3);

		if (num.contains(num3)) {
			System.out.println("\nO número " + num3 + " foi encontrado!");
		} else {
			System.out.println("\nO número " + num3 + " não foi encontrado!");
		}
	}

}
