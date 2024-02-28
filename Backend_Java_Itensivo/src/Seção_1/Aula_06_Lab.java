package Seção_1;

public class Aula_06_Lab {
// DIGAMOS QUE O NOME DA CLASSE SEJA ---------> Pessoa <---------
	
	String nome;
	String cpf;
	String departamento;
	Double valorPorHora;
	Double horasTrabalhadas;
	
	public Double calcularSalario() {
		
		return valorPorHora * horasTrabalhadas;
	
	}
}