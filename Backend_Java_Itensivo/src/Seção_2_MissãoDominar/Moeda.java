package Seção_2_MissãoDominar;

public enum Moeda {

	REAL("R$"), DOLAR("$"), EURO("€");

	private String simbolo;

	private Moeda(String simbolo) {
		this.simbolo = simbolo;
	}

	public void getSimbolo() {
		String getSimbolo = this.simbolo;
		System.out.println(getSimbolo);
	}

	public static void imprimirTodasMoedas() {
		Moeda[] moedas = Moeda.values();
		for (Moeda moeda : moedas) {
			System.out.println(moeda);
		}

	}

}
