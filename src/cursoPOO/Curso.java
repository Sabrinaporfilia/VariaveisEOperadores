package cursoPOO;

public class Curso {
	private String instrutor;
	private String nomeAluno;
	private String nomeCurso;
	private float valor;
	private int duracao;

	public Curso(String instrutor, String nomeAluno, String nomeCurso, float valor, int duracao) {
		super();
		this.instrutor = instrutor;
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
		this.valor = valor;
		this.duracao = duracao;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void visualizar() {
		System.out.println("Nome do Instrutor: " + instrutor);
		System.out.println("Nome do Aluno: " + nomeAluno);
		System.out.println("Nome do Curso: " + nomeCurso);
		System.out.println("Valor do Curso: " + valor);
		System.out.println("Duração do curso em anos: "+ duracao+" anos");
		System.out.println("**********************************");

	}

}
