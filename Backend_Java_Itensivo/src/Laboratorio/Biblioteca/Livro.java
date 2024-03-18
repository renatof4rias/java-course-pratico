package Laboratorio.Biblioteca;

public class Livro {

	private String titulo;
	private String autor;
	private boolean emprestado;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		setEmprestado(false);
	}
		
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public boolean getEmprestado() {
		return this.emprestado;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
		
	public void emprestarLivro() {
		setEmprestado(true);
	}
	
	public void devolverLivro() {
		setEmprestado(false);
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", emprestado=" + emprestado + "]";
	}
	
}