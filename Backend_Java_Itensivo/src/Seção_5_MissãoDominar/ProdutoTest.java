package Seção_5_MissãoDominar;

public class ProdutoTest {

	public static void main(String[] args) {

		Produto[] p1 = {

				new Produto("Chave ", 12.50, 8), new Produto("Creme", 16.60, 7), new Produto("Caneta", 2.50, 6),
				new Produto("Caderno", 19.90, 5), new Produto("Garrafa", 28.10, 4), new Produto("Monitor", 37.20, 3),
				new Produto("Oculos", 46.30, 2), new Produto("Lapis", 55.40, 1),

		};

		double valorTotal = 0.0;

		for (Produto produto : p1) {
			double subTotal;
			valorTotal += produto.getPreco() * produto.getQuantidade();
			subTotal = produto.getPreco() * produto.getQuantidade();
			System.out.println(produto.getNome() + " " + produto.getQuantidade() + " " + produto.getPreco()
					+ "Subtotal: " + subTotal);
		}

		System.out.println(valorTotal);

	}

}
