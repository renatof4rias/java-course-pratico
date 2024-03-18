package Laboratorio.Vendas;

public class VendasTest {

	public static void main(String[] args) {

		SistemaVendas s1 = new SistemaVendas();

		Produto p1 = new Produto(01, "Aatrox", 450.00);
		Produto p2 = new Produto(02, "Mordekaiser", 1350.00);
		Produto p3 = new Produto(03, "Garen", 3150.00);
		Produto p4 = new Produto(04, "Kalista", 4800.00);
		Produto p5 = new Produto(05, "Blitzcrank", 6280.00);
		// Produto p6 = new Produto(06, "Yummi", 7200.00);

		s1.cadastrarProduto(p1);
		s1.cadastrarProduto(p2);
		s1.cadastrarProduto(p3);
		s1.cadastrarProduto(p4);
		s1.cadastrarProduto(p5);
		// s1.cadastrarProduto(p6);

		s1.cadastrarUsuario("1sqhynosh", "powergvt123");
		s1.cadastrarUsuario("alura", "123");
		// s1.cadastrarUsuario("udemy", "321");

		s1.realizarVenda(p1, 2);
		s1.realizarVenda(p2, 1);
		s1.realizarVenda(p3, 2);
		// s1.realizarVenda(p4, 2);
		// s1.realizarVenda(p5, 2);

		s1.exibirRelatorioVendas();

		s1.autenticarUsuario("asqhynosh", "powergvt123");
		s1.autenticarUsuario("1sqhynosh", "powergvt123");

	}

}