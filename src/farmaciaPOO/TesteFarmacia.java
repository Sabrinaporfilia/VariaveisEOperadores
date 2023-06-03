package farmaciaPOO;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia f1 = new Farmacia("Farmacia Avenida", "Rua Angelina dos Anjos", "Dorflex", 12f, "Débito");
		Farmacia f2 = new Farmacia("Farmacia Azevedo", "Rua Doutor das Dores", "Dipirona", 9f, "Dinheiro");

		f1.visualizar();
		f2.visualizar();
	}

}
