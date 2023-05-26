package lacosCondicionaisSwitch;

import java.util.Scanner;

public class LacoCondicionalSwitch3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float num1,num2,resultado;
		int operacao;
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextFloat();
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextFloat();
		
		System.out.println("1 Soma");
		System.out.println("2 Subtração");
		System.out.println("3 Multiplicação");
		System.out.println("4 Divisão");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			resultado = num1 + num2;
			System.out.printf(num1+" + "+ num2+" = "+ resultado);
		
			break;
			
		case 2:
			resultado = num1 - num2;
			System.out.printf(num1+" - "+ num2+" = "+ resultado);
		
			break;
		case 3:
			resultado = num1 * num2;
			System.out.printf(num1+" * "+ num2+" = "+ resultado);
		
			break;
		case 4:
			resultado = num1 / num2;
			System.out.printf(num1+" / "+ num2+" = "+ resultado);
		
			break;
		default:
			System.out.println("Operação inválida");

		}
		
	}
	

}
