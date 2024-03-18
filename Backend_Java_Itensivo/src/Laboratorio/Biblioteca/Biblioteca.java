package Laboratorio.Biblioteca;

public class Biblioteca {

	private Livro[] livros;
	private int totalLivros;
	private int capacidadeMaxima;

	public Biblioteca() {

	}

	public Biblioteca(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.livros = new Livro[capacidadeMaxima];
		this.totalLivros = 0;
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	public int getTotalLivros() {
		return totalLivros;
	}

	public void setTotalLivros(int totalLivros) {
		this.totalLivros = totalLivros;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public void cadastrarLivro(String titulo, String autor) {
		for (int i = 0; i < livros.length; i++) {
			if (totalLivros == capacidadeMaxima) {
				System.out.println("Não Há Espaço para Novos Livros!!!");
				return;
			} else if (livros[i] == null) {
				livros[i] = new Livro(titulo, autor);
				this.totalLivros++;
				System.out.println("Livro Cadastrado!!!");
				return;
			}
		}
	}

	public void listarLivro() {
		for (Livro livro : livros) {
			if (livro != null && livro.getEmprestado() == false) {
				System.out.println(livro.getTitulo());
			}
		}
	}

	public void emprestarLivro(String titulo) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getTitulo().equals(titulo)) {
				livros[i].emprestarLivro();
				System.out.println("Empréstimo de livro confirmado!!!");
				return;
			}
		}
		System.out.println("Livro não encontrado!!!");
	}

	public void devolverLivro(String titulo) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getTitulo().equals(titulo)) {
				livros[i].devolverLivro();
				System.out.println("Devolução de livro confirmado!!!");
				return;
			}
		}
		System.out.println("Livro não encontrado!!!");
	}

	public void exibirInformacoesLivro(String titulo) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getTitulo().equals(titulo)) {
				System.out.println(livros[i].toString());
				return;
			}
		}
		System.out.println("Livro não encontrado!!!");
	}

}