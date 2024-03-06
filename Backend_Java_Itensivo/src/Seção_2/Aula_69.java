package Seção_2;

public class Aula_69 {

	public String nome;
	public String cpf;
	public int idade;
	public double salario;
	public double altura;

	public Aula_69() {

	}

	public Aula_69(String nome) {
		this.nome = nome;
	}

	public Aula_69(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Aula_69(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Aula_69(String nome, String cpf, int idade, double salario) {
		this.nome = nome;
		this.cpf = cpf;
       	this.idade = idade;
		this.salario = salario;
	}

	public Aula_69(String nome, String cpf, int idade, double salario, double altura) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
		this.altura = altura;
	}
}
