package Seção_2_MissãoDominar;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro() {

	}

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String informacoesLivro() {
		return String.format(
				"""
				Livro: %s
				Autor: %s
				Ano Publicação : %d
				""", this.titulo, this.autor, this.anoPublicacao);
	}

}
