package ingressoPOO;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso("Show Roberto Carlos", "Marcelo dos Santos", "Parque das Americas", 200f, 25);
		Ingresso ingresso2 = new Ingresso("Show Rebelde", "Maria da Silva", "Allianz", 600f, 150);

		ingresso1.visualizar();
		ingresso2.visualizar();
	}

}
