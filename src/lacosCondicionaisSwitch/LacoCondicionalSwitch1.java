package lacosCondicionaisSwitch;

import java.util.Scanner;

public class LacoCondicionalSwitch1 {

	public static void main(String[] args) {
		
		int opcao,quantidade ;
		float total,preco;
		String produto;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um código do produto de seu interesse");

		System.out.println("1 Cachorro quente");
		System.out.println("2 X-Salada");
		System.out.println("3 X-Bacon");
		System.out.println("4 Bauru");
		System.out.println("5 Refrigerante");
		System.out.println("6 Suco de laranja");
		
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite a quantidade que você quer:");
			quantidade = leia.nextInt();
			preco = 10;
			total = quantidade * preco;
			produto = "Cachorro quente";
			if (total >= 10) {
				System.out.println("Produto:"+produto);
				System.out.printf("Valor total:%.2f",total);}
			else {
				System.out.println("Escolha uma quantidade válida");
			}
			break;
			
		case 2:
			System.out.println("Digite a quantidade que você quer:");
			quantidade = leia.nextInt();
			preco = 15;
			total = quantidade * preco;
			produto = "X-Salada";
			if (total >= 15) {
				System.out.println("Produto:"+produto);
				System.out.printf("Valor total:%.2f",total);
			}
			else {
				System.out.println("Escolha uma quantidade válida");

			}
			break;
			
		case 3:
			System.out.println("Digite a quantidade que você quer:");
			quantidade = leia.nextInt();
			preco = 18;
			total = quantidade * preco;
			produto = "X-Bacon";
			if (total >= 18) {
				System.out.println("Produto:"+produto);
				System.out.printf("Valor total:%.2f",total);
			}
			else {
				System.out.println("Escolha uma quantidade válida");

			}
			break;
			
		case 4:
			System.out.println("Digite a quantidade que você quer:");
			quantidade = leia.nextInt();
			preco = 12;
			total = quantidade * preco;
			produto = "Bauru";
			if (total >= 12) {
				System.out.println("Produto:"+produto);
				System.out.printf("Valor total:%.2f",total);
			}
			else {
				System.out.println("Escolha uma quantidade válida");

			}
			break;
			
		case 5:
			System.out.println("Digite a quantidade que você quer:");
			quantidade = leia.nextInt();
			preco = 8;
			total = quantidade * preco;
			produto = "Refrigerante";
			if (total >= 8) {
				System.out.println("Produto:"+produto);
				System.out.printf("Valor total:%.2f",total);
			}
			else {
				System.out.println("Escolha uma quantidade válida");

			}
			break;
			
		case 6:
			System.out.println("Digite a quantidade que você quer:");
			quantidade = leia.nextInt();
			preco = 13;
			total = quantidade * preco;
			produto = "Suco de laranja";
			if (total >= 13) {
				System.out.println("Produto:"+produto);
				System.out.printf("Valor total:%.2f",total);
			}
			else {
				System.out.println("Escolha uma quantidade válida");

			}
			break;

	}
}
}