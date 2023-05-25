package lacosCondicionaisSwitch;

import java.util.Scanner;

public class LacoCondicionalSwitch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String colaborador;
		float salario, novoSalario;
		int cargo;
		
		System.out.println("Digite o nome do colaborador: ");
		colaborador = leia.nextLine();
		System.out.println("Digite o código do cargo de seu interesse");

		System.out.println("1 Gerente");
		System.out.println("2 Vendedor");
		System.out.println("3 Supervisor");
		System.out.println("4 Motorista");
		System.out.println("5 Estoquista");
		System.out.println("6 Técnico de TI");
		cargo = leia.nextInt();
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		switch (cargo) {
		case 1:
			novoSalario = salario + (0.10f*salario);
			System.out.println("Nome do colaborador: "+colaborador);
			System.out.println("Cargo: Gerente ");
			System.out.printf("Novo Salário %.2f", novoSalario);
			break;
			
		case 2:
			novoSalario = salario + (0.07f*salario);
			System.out.println("Nome do colaborador: "+colaborador);
			System.out.println("Cargo: Vendedor ");
			System.out.printf("Novo Salário %.2f", novoSalario);
			break;
			
		case 3:
			novoSalario = salario + (0.09f*salario);
			System.out.println("Nome do colaborador: "+colaborador);
			System.out.println("Cargo: Supervisor ");
			System.out.printf("Novo Salário %.2f", novoSalario);
			break;
			
		case 4:
			novoSalario = salario + (0.06f*salario);
			System.out.println("Nome do colaborador: "+colaborador);
			System.out.println("Cargo: Motorista ");
			System.out.printf("Novo Salário %.2f", novoSalario);
			break;
			
		case 5:
			novoSalario = salario + (0.05f*salario);
			System.out.println("Nome do colaborador: "+colaborador);
			System.out.println("Cargo: Estoquista ");
			System.out.printf("Novo Salário %.2f", novoSalario);
			break;
			
		case 6:
			novoSalario = salario + (0.08f*salario);
			System.out.println("Nome do colaborador: "+colaborador);
			System.out.println("Cargo: Técnico de TI ");
			System.out.printf("Novo Salário %.2f", novoSalario);
			break;
		
		}

	}

}
