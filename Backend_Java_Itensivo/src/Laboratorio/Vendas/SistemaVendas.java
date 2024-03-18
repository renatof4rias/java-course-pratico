package Laboratorio.Vendas;

public class SistemaVendas {

	private Produto[] produtos;
	private Venda[] vendas;
	private Usuario[] usuarios;
	private int totalProdutos;
	private int totalVendas;
	private int totalUsuarios;

	private final int MAX_PRODUTOS = 5;
	private final int MAX_VENDAS = 3;
	private final int MAX_USUARIOS = 2;

	public SistemaVendas() {
		this.produtos = new Produto[MAX_PRODUTOS];
		this.vendas = new Venda[MAX_VENDAS];
		this.usuarios = new Usuario[MAX_USUARIOS];
		this.totalProdutos = 0;
		this.totalVendas = 0;
		this.totalUsuarios = 0;
	}

	public void cadastrarProduto(Produto produto) {
		for (int i = 0; i < produtos.length; i++) {
			if (totalProdutos == MAX_PRODUTOS) {
				System.out.println("Não Há Espaço para Novos Produtos!!!");
				return;
			} else if (produtos[i] == null) {
				produtos[i] = new Produto(produto.getCodigo(), produto.getNome(), produto.getPreco());
				this.totalProdutos++;
				System.out.println("Produto Cadastrado!!!");
				return;
			}
		}
	}

	public void realizarVenda(Produto produto, int quantidade) {
		for (int i = 0; i < vendas.length; i++) {
			if (totalVendas == MAX_VENDAS) {
				System.out.println("Sem Espaço para Novas Vendas!!!");
				return;
			} else if (this.totalProdutos < quantidade) {
				System.out.println("Estoque Insuficiente!!!");
				return;
//			} else if (produtos[i] != null && produtos[i].getCodigo() != produto.getCodigo()) {
//				System.out.println("Produto Nao Encontrado!!!");
//				return;
			} else if (vendas[i] == null) {
				vendas[i] = new Venda(produto, quantidade);
				this.totalProdutos -= quantidade;
				this.totalVendas++;
				System.out.println("Venda Confirmada!!!");
				System.out.println("Valor Total: R$ " + vendas[i].getValorTotal());
				return;
			}
		}
	}

	public void exibirRelatorioVendas() {
		for (int i = 0; i < vendas.length; i++) {
			System.out.println(vendas[i].toString());
			System.out.println(vendas[i].getValorTotal());
		}
	}

	public void cadastrarUsuario(String senha, String usuario) {
		for (int i = 0; i < usuarios.length; i++) {
			if (totalUsuarios == MAX_USUARIOS) {
				System.out.println("Espaço Insuficiente para Novos Usuarios!!!");
				return;
			} else if (usuarios[i] == null) {
				usuarios[i] = new Usuario(usuario, senha);
				totalUsuarios++;
				System.out.println("Usuario Cadastrado com Sucesso!!!");
				return;
			}
		}
	}

	public void autenticarUsuario(String usuario, String senha) {

		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].getSenha().equals(senha)) {
				System.out.println("True");
				return;
			} else if (!usuarios[i].getUsuario().equals(usuario) && usuarios[i].getSenha().equals(senha)) {
				System.out.println("False");
				return;
			}
		}

	}

}