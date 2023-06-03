package clientePOO;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente Cliente1 = new Cliente("Jose", 18, "Masculino", 1000.0f, 1319948);
		Cliente Cliente2 = new Cliente("Maria", 25, "Feminino", 2500.0f, 1342789);

		Cliente1.visualizar();

		Cliente2.visualizar();

	}

}
