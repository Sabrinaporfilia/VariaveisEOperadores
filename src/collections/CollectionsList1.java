package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsList1 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		String cor = null;

		for (int linha = 0; linha < 5; linha++) {
			System.out.println("Digite as cores... ");
			cor = Ler.next();
			cores.add(cor);
		}
		System.out.println("\nListar todas as cores :\r");
		for (String cor1 : cores) {
			System.out.println(cor1);
		}

		System.out.println("\nOrdenar as cores :");
		Collections.sort(cores);
		for (String cor1 : cores) {
			System.out.println(cor1);
		}

	}

}
