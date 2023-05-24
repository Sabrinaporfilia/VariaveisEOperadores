package variaveiseoperadores;

import java.util.Scanner;

public class DiferencaEntreProdutos {
	public static void main(String[] args) {
	float n1, n2, n3, n4, diferenca;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite sua primeira nota: ");
	n1 = leia.nextFloat();
	
	System.out.println("Digite sua segunda nota: ");
	n2 = leia.nextFloat();
	
	System.out.println("Digite sua terceira nota: ");
	n3 = leia.nextFloat();
	
	System.out.println("Digite sua quarta nota: ");
	n4 = leia.nextFloat();
	
	diferenca = (n1 * n2) - (n3 * n4);
	System.out.printf("Diferença final entre os produtos é de: %.1f", diferenca);
}
}