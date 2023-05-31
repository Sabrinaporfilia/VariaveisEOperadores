package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		Boolean executar = true;
		String livro = null;

		while (executar) {

			System.out.println("\t ----------------------------");
			System.out.println("\t");
			System.out.println("\t 1 - Adicionar Livro na pilha");
			System.out.println("\t 2 - Listar todos os Livros");
			System.out.println("\t 3 - Retirar Livro da pilha");
			System.out.println("\t 0 - Sair");
			System.out.println("\t");
			System.out.println("\t ----------------------------");
			System.out.println("\t Entre com a opção desejada ");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do Livro: ");
				ler.nextLine();
				livro = ler.nextLine();
				pilha.add(livro);
				System.out.println("Pilha: ");
				System.out.println(pilha);
				System.out.println("\nLivro Adicionado!!");
				
				break;

			case 2:
				System.out.println("Lista de Livros na Pilha: ");
				System.out.println(pilha);

				break;

			case 3:
				if (pilha.size() == 0) {
					System.out.println("A Pilha está vazia!!");
				} else {
					System.out.println("Um livro foi retirado da pilha!");
					System.out.println(pilha.pop());
					System.out.println("\nPilha: ");
					System.out.println(pilha);
				}
				break;
			default:
				if (opcao == 0) {
					executar = false;
					System.out.println("Programa Finalizado!!");
				} else {
					System.out.println("Opcão Invalida!!");
				}
				break;
			}
		}
	}
}
