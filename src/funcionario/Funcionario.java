package funcionario;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String genero;
	private float salario;
	private String setor;
	
	public Funcionario(String nome, int idade, String genero, float salario, String setor) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.salario = salario;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		System.out.println("Nome Funcionario(a): " + nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Gênero: " + genero);
		System.out.println("Salario: " + salario);
		System.out.println("Setor:" + setor);
		System.out.println("                           ");
		System.out.println("***************************");
	}
}
