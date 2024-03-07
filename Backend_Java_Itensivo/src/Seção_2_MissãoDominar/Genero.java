package Seção_2_MissãoDominar;

public enum Genero {

	MASCULINO('M', "HOMEM") ,
	FEMININO('F', "MULHER");
	
	public char sexo;
	public String genero;
	
	private Genero(char sexo, String genero) {
		this.sexo = sexo;
		this.genero = genero;
	}
	
}
