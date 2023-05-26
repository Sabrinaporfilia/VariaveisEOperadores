package lacosCondicionaisSwitch;

import java.util.Scanner;

public class LacoCondicionalSwitch4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float num1, num2, resultado, saque, deposito, saldo = 1000f;
		int operacao;

		System.out.println("Digite a operação desejada: ");

		System.out.println("1 Saldo");
		System.out.println("2 Saque");
		System.out.println("3 Depósito");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.printf("Operação - Saldo" + "\nSaldo: R$ %.2f", saldo);

			break;
		case 2:
			System.out.printf("Digite o valor do saque desejado: ");
			saque = leia.nextFloat();
			saldo -= saque;

			if (saque <= saldo) {
				System.out.printf("Operação - Saque " + "\nNovo Saldo: R$ %.2f", saldo);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			break;
		case 3:
			System.out.printf("Digite o valor do depósito desejado: ");
			deposito = leia.nextFloat();
			saldo += deposito;
			System.out.printf("Operação - Depósito" + "\nNovo Saldo: R$ %.2f", saldo);
			break;
		default:
			System.out.println("Operação inválida");

		}
	}

}
