package lacosCondicionais;

import java.util.Scanner;

public class LacoCondicionalIf3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;
		Boolean verdadeiro;

		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue do doador? -true- para sim ou -false- para não: ");
		verdadeiro = leia.nextBoolean();
		
		if (idade >= 18 && idade<60) {
			System.out.println(nome+" está apto para doar sangue!");
		}
		else if (idade >= 60 && idade<69 && verdadeiro == true) {
			System.out.println(nome+" não está apto para doar sangue!");
		}
		else if (idade >= 60 && idade<69 && verdadeiro == false) {
			System.out.println(nome+" esta apto para doar sangue!");
		}
		else {
			System.out.println(nome+" não está apto para doar sangue");
		}
			
		
	}

}
