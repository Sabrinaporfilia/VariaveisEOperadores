package lacosCondicionais;

import java.util.Scanner;

public class LacoCondicionalIF1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int a,b,c,resultado;
		
		System.out.println("Digite o número A");
		a = leia.nextInt();
		
		System.out.println("Digite o número B");
		b = leia.nextInt();
		
		System.out.println("Digite o número C");
		c = leia.nextInt();
		
		resultado = a + b;
		
		if(resultado > c){
			System.out.println("\n"+a+" + "+b+" = "+resultado+" > "+c+"\nA Soma de A + B é Maior do que C");
			}
		
			else if (resultado < c){
				System.out.println("\n"+a+" + "+b+" = "+resultado+" < "+c+ "\nA Soma de A + B é Menor do que C");
			}
			else{
				System.out.println("\n"+a+" + "+b+" = "+resultado+" = "+c+ "\nA Soma de A + B é Igual a C");
			}
		

	}

}
