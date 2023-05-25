package variaveisOperadores;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do seu adicional norturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor de suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos seus descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno ) + (horasExtras * 5) - descontos;
		System.out.printf("Seu salário líquido é de: %.2f", salarioLiquido);

	}

}
