package produtoPOO;

public class TestaProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto ("Spider-Man","Ação/Aventura", "PS4", 12, 2018);
		Produto p2 = new Produto ("Grand Theft Auto V","Ação/Aventura", "Xbox One", 18, 2013);
		
		p1.visualizar();
		p2.visualizar();
	}
}
