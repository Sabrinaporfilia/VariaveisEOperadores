package clientePOO;

import util.Cores;

public class Cliente {

	private String nome;
	private int idade;
	private String genero;
	private float saldo;
	private int cep;

	public Cliente(String nome, int idade, String genero, float saldo, int cep) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.saldo = saldo;
		this.cep = cep;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public void visualizar() {

		System.out.println(Cores.TEXT_YELLOW_BRIGTH + "***************************");
		System.out.println("Nome Cliente: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Gênero: " + genero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Cep: " + cep);
		System.out.println("***************************");
		System.out.println("                        " + Cores.TEXT_RESET);

	}

}
