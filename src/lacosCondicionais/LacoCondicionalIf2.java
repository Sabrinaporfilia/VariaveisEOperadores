package lacosCondicionais;

import java.util.Scanner;

public class LacoCondicionalIf2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int  num;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		
		if (num %2 != 0 && num < -0 ) {
			System.out.println("O Número "+num+ " é ímpar e negativo!");
		} 
		else if (num %2 != 0 && num >= 0){
			System.out.println("O Número "+num+" é impar e positivo!");
		}
		else if (num %2 == 0 && num < -0 ) {
			System.out.println("O Número "+num+" é par e negativo!");
		} 
		else if (num %2 == 0 && num >= 0){
			System.out.println("O Número "+num+" é par e positivo!");
		
		}
	}

}
