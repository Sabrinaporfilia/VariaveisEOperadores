package farmaciaPOO;

public class Farmacia {
	
	private String nome;
	private String endereco;
	private String produto;
	private float preco;
	private String pagamento;
	
	public Farmacia(String nome, String endereco, String produto, float preco, String pagamento) {
		this.nome = nome;
		this.endereco = endereco;
		this.produto = produto;
		this.preco = preco;
		this.pagamento = pagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreço(float preco) {
		this.preco = preco;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	
	public void visualizar() {
		System.out.println("Nome da Farmacia: "+ nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Produto: "+ produto);
		System.out.println("Preço: " + preco);
		System.out.println("Forma de pagamento: "+ pagamento);
		System.out.println("**********************************");
	}
		

}
