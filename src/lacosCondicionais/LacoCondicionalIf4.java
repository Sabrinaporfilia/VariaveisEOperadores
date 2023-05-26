package lacosCondicionais;

import java.util.Scanner;

public class LacoCondicionalIf4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String caracteristica1, caracteristica2, caracteristica3, resultadoFinal;

		System.out.println("Digite as características do animal (vertebrado/invertebrado)");
		caracteristica1 = leia.next();
		System.out.println("Digite as características ave/mamífero/inseto/anelídeo");
		caracteristica2 = leia.next();
		System.out.println("Digite as características carnívoro/onívoro/herbívoro/hematófago");
		caracteristica3 = leia.next();

		if (caracteristica1.equalsIgnoreCase("vertebrado")) {
			if (caracteristica2.equalsIgnoreCase("ave")) {
				if (caracteristica3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("pombo");
				}
			} else {
				if (caracteristica3.equalsIgnoreCase("onívoro")) {
					System.out.println("pessoa");
				} else {
					if (caracteristica3.equalsIgnoreCase("herbívoro")) {
						System.out.println("vaca");
					}
				}
			}
		} else {
			if (caracteristica2.equalsIgnoreCase("inseto")) {
				if (caracteristica3.equalsIgnoreCase("hematófago")) {
					System.out.println("pulga");
				} else {
					if (caracteristica3.equalsIgnoreCase("herbívoro")) {
						System.out.println("Lagarta");
					}
				}
			} else {
				if (caracteristica2.equalsIgnoreCase("anelídeo")) {
					if (caracteristica3.equalsIgnoreCase("hematófago")) {
						System.out.println("sanguessuga");
					} else {
						if (caracteristica3.equalsIgnoreCase("onívoro")) {
							System.out.println("minhoca");
						}
					}
				} else {
					System.out.println("Digite uma caracteristicas válidas!");
				}
			}

		}
	}
}
