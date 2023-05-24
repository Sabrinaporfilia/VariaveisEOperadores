package variaveiseoperadores;

import java.util.Scanner;

public class SalarioEAbono {

	public static void main(String[] args) {
		float salario, abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		salario += abono ;
		System.out.printf("Seu novo salário é: %.2f", salario );


	}

}
