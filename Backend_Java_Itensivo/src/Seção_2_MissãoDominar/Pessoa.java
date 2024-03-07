package Seção_2_MissãoDominar;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Genero genero;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String nome, int idade, Genero genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String informacoesPessoais() {
		return 	String.format
				("""
				Nome:  %s
				Idade: %d
				Genero: %s
				""", this.nome, this.idade, this.genero);
	}
	
}