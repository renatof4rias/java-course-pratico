package Laboratorio.Hospital;

public class Paciente {

	private String nome;
	private String dataNascimento;
	private char sexo;
	private String endereco;
	private String numeroTelefone;

	public Paciente(String nome, String dataNascimento, char sexo, String endereco, String numeroTelefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.numeroTelefone = numeroTelefone;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", endereco="
				+ endereco + ", numeroTelefone=" + numeroTelefone + "]";
	}

}