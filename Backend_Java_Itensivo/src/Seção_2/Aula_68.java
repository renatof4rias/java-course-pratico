package Seção_2;

public class Aula_68 {

	
	
	
	
	
	
	
	
	public String impressora(Aula_68_Pessoa pessoa) {
		return "A/O " + pessoa.nome + " Com seus " + pessoa.idade + " anos de idade, com seus incriveis " + pessoa.altura + " Possui " + pessoa.peso ;
	}
	
	public double calculoBasal(Aula_68_Pessoa pessoa) {
		pessoa.basal = pessoa.peso * pessoa.altura;
		return pessoa.basal;
	}
	
	
	
}
