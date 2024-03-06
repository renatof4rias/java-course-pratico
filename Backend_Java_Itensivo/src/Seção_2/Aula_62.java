package Seção_2;

public abstract class Aula_62 {
	
	public abstract int somaInt();  
	public abstract double somaDouble();  
	
/*
	 Metodos Abstratos só existem dentro de classes ABSTRATAS
	 Classes Abstratas podem ter metodos Abstratos e Nao Abstratos
	 Classe Abstratas Nao podem ser instanciadas, apenas herdadas
*/
	
	public String somaString(String a, String b) {
		return a + b ;
	}
	
}