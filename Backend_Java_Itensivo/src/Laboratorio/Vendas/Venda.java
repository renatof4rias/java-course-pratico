package Laboratorio.Vendas;

public class Venda {

	private Produto produto;
	private int quantidade;

	public Venda() {

	}
	
	public Venda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public double getValorTotal() {
		return produto.getPreco() * quantidade;
	}

	@Override
	public String toString() {
		return "Venda [produto= " + produto.getNome() + ", quantidade=" + quantidade + "]";
	}

}