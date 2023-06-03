package produtoPOO;

public class Produto {
	
	private String titulo;
	private String genero;
	private String plataforma;
	private int faixaEtaria;
	private int anoLancamento;
	
	
	public Produto(String titulo, String genero, String plataforma, int faixaEtaria, int anoLancamento) {
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.faixaEtaria = faixaEtaria;
		this.anoLancamento = anoLancamento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void visualizar() {
		System.out.println("Nome do Produto: "+ titulo);
		System.out.println("Gênero: " + genero);
		System.out.println("Plataforma: "+ plataforma);
		System.out.println("Faixa Etaria: " + faixaEtaria);
		System.out.println("Ano de lançamento: "+ anoLancamento);
		System.out.println("**********************************");
	}
}
