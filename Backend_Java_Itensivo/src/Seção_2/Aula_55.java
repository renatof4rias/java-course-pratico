package Seção_2;

public enum Aula_55 {

	//Constantes Declaradas 
	// posso ter metodos, construtores
	
	SEGUNDA_FEIRA (0),
	TERCA_FEIRA(1),
	QUARTA_FEIRA(2),
	QUINTA_FEIRA(3),
	SEXTA_FEIRA(4),
	SABADO(5),
	DOMINGO(6);
	
	private final int valor;
	
	private Aula_55(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
}
