package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		Set<Integer> num = new HashSet<Integer>();

		Integer num1 = 0, contador = 0;

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Digite " + contador + "° número... ");
			num1 = Ler.nextInt();
			num.add(num1);
		}
		Iterator<Integer> iNum = num.iterator();

		System.out.println("\nListar dados do Set: ");

		while (iNum.hasNext()) {
			System.out.println(iNum.next());
		}

	}

}
