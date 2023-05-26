package lacosRepeticaoWhile;

import java.util.Scanner;

public class LacosRepeticaoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String continua = "s";
		int idade, sexo, categoria, devBack = 0, devFront = 0, hMobile40 = 0, mFull30 = 0;

		while (continua.equals("s")) {

			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("Digite o sexo ");
			sexo = leia.nextInt();
			System.out.print("Digite a categoria ");
			categoria = leia.nextInt();

			if (categoria == 1) {
				devBack++;
			}
			if (categoria == 2 && sexo == 2) {
				devFront++;
			}
			if (categoria == 3 && idade >= 40 && sexo == 1) {
				hMobile40++;
			}
			if (categoria == 4 && idade <= 30 && sexo == 2) {
				mFull30++;
			}
			System.out.println("Deseja continuar? (s/n)");
			continua = leia.next();
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + devBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + devFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + hMobile40);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mFull30);
	}

}
