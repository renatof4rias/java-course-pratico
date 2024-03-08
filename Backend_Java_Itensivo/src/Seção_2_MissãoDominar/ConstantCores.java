package Seção_2_MissãoDominar;

public class ConstantCores {

	private static final String VERMELHO = "#FF0000";
	private static final String VERDE = "#00FF00";
	private static final String AZUL = "#0000FF";
	private static final String ROSA = "#FFC0CB";
	private static final String PRETO = "#000000";
	private static final String AMARELO = "#FFFF00";
	
	public void obterHexadecimal(String cor) {
		
		if (cor.toUpperCase().equals("VERMELHO") ) {
			System.out.println(VERMELHO);
		} else if (cor.toUpperCase().equals("VERDE")) {
			System.out.println(VERDE);
		} else if (cor.toUpperCase().equals("AZUL")) {
			System.out.println(AZUL);
		} else if (cor.toUpperCase().equals("ROSA")) {
			System.out.println(ROSA);
		} else if (cor.toUpperCase().equals("PRETO")) {
			System.out.println(PRETO);
		} else if (cor.toUpperCase().equals("AMARELO")) {
			System.out.println(AMARELO);
		} else {
			System.out.println("COR NAO CATALOGADA NO SISTEMA!!!");
		}
		
	}
	
}