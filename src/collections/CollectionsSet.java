package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		Set<Integer> num = new HashSet<Integer>();

		Integer num1 = 0, num2 = 0, num3 = 0;

		// permite o usuário adicionar números inteiros
		for (num2 = 1; num2 <= 10; num2++) {
			System.out.println("Digite " + num2 + "° número... ");
			num1 = Ler.nextInt();
			num.add(num1);
		}
		// vai ler os dados da lista e passar para nova variavel "iNum"
		Iterator<Integer> iNum = num.iterator();

		System.out.println("\nListar dados do Set: ");
		// enquanto tiver dados na variavel iNum, ela sera mostrada para o usuário
		while (iNum.hasNext()) {
			System.out.println(iNum.next());
		}

	}

}
