package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		Boolean executar = true;
		String cliente = null;

		while (executar) {

			System.out.println("----------------------------");
			System.out.println("\t");
			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar Cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("\t");
			System.out.println("----------------------------");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do cliente: ");
				cliente = ler.next();
				fila.add(cliente);
				System.out.println("Cliente Adicionado!!");
				break;

			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(fila);

				break;

			case 3:
				if (fila.size() == 0) {
					System.out.println("A Fila está vazia!!");
				} else {
					System.out.println(fila.poll());
					System.out.println("O Cliente foi Chamado!");
					System.out.println("\nFila: ");
					System.out.println(fila);
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
