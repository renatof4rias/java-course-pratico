package Seção_2_MissãoDominar;

public class ConstantesImpostos {

	private static final double IR = 0.05;
	private static final double IPI = 0.02;
	
	
	public String calcularImposto(double valor, String tipo) {
		double valorImposto = 0.0;
		double valorBase = 0.0;
		if (tipo.toUpperCase().equals("IR")) {
			valorImposto = (valor * IR);
			valorBase = 5;
		} else if (tipo.toUpperCase().equals("IPI")){
			valorImposto = (valor * IPI);
			valorBase = 2;
		}
		double valorTotal = valor + valorImposto;
		
		return	String.format(
				"""
				Tipo de Imposto: %s (%.0f%%)
				SubTotal: R$ %.2f
				Imposto: R$ %.2f
				Total: R$ %.2f
				""",tipo.toUpperCase(), valorBase, valor, valorImposto, valorTotal);
	}
}