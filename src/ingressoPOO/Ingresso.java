package ingressoPOO;

public class Ingresso {
	
	private String evento;
	private String nome;
	private String local;
	private float valor;
	private int assento;
	
	
	public Ingresso(String evento, String nome, String local, float valor, int assento) {
		this.evento = evento;
		this.nome = nome;
		this.local = local;
		this.valor = valor;
		this.assento = assento;
	}
	
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getAssento() {
		return assento;
	}
	public void setAssento(int assento) {
		this.assento = assento;
	}
	
	public void visualizar() {
		System.out.println("Nome do evento: "+ evento);
		System.out.println("Nome comprador: " + nome);
		System.out.println("Local do evento: "+ local);
		System.out.println("Valor: " + valor);
		System.out.println("Assento: "+ assento);
		System.out.println("**********************************");
		
	}
	
	
	
	

}
