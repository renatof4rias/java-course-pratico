package Seção_2;

public class Aula_30 {

	private String cpf;
	private String nome;

	public Aula_30() {

	}

	public Aula_30(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "Aula_30 [cpf=" + cpf + ", nome=" + nome + "]";
	}
}