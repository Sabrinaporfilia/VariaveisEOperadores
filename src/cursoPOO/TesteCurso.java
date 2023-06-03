package cursoPOO;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Marcelo", "João dos Santos", "Enfermagem", 400f, 2);
		Curso curso2 = new Curso("Fernanda", "Mike Barbosa", "Música", 500f, 3);

		curso1.visualizar();
		curso2.visualizar();

	}

}
