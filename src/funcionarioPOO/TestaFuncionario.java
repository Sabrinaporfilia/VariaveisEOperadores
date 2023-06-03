package funcionarioPOO;


public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario ("Joana",24,"Feminino",2000.0f,"Balconista");
		Funcionario F2 = new Funcionario ("Guilherme",26,"Masculino",1800.0f,"Caixa");
		
		F1.visualizar();
		
		F2.visualizar();

	}

}
